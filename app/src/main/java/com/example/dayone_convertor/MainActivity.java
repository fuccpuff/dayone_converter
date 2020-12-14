package com.example.dayone_convertor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    public static final String TAG = "stateChange";
    private static final String RUBLE_VALUE = "rubValues";

    TextView rubValues;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        rubValues = findViewById(R.id.rubValues);
        
        Log.i(TAG, "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop()");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        rubValues.setText(savedInstanceState.getString(RUBLE_VALUE));
        Log.i(TAG, "onRestoreInstanceState()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putString(RUBLE_VALUE, rubValues.getText().toString());
        Log.i(TAG, "onSaveInstanceState()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart()");
    }

    public void convert(View view) {
        
        EditText dollarValues = findViewById(R.id.dollarValues);

        if (dollarValues.getText().toString().equals("")) {
            rubValues.setText(R.string.no_value);
        } else {
            int dollars =  Integer.parseInt(dollarValues.getText().toString());
            double ruble = dollars * 73.12;
            rubValues.setText(ruble + "");
        }
    }
}