package com.example.dayone_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText dollarValues = findViewById(R.id.dollarValues);
        TextView rubValues = findViewById(R.id.rubValues);

        if (dollarValues.getText().toString().equals("")) {
            rubValues.setText(R.string.no_value);
        } else {
            int dollars =  Integer.parseInt(dollarValues.getText().toString());
            double ruble = dollars * 73.12;
            rubValues.setText(ruble + "");
        }
    }
}