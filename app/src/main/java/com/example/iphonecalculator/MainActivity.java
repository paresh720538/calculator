package com.example.iphonecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    EditText inputOutputResult;
    Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inputOutputResult = findViewById(R.id.input_output_result);
        String input = inputOutputResult.getText().toString();

        // This is for the Clear the input.
        clear = findViewById(R.id.button_clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
            }
        });

    }


    public int calculator(int data1, int data2, String operator) {


        // add switch case for operation as per the user intended


        switch (operator) {
            case "+":
                return data1 + data2;


            case "-":
                return data1 - data2;


            case "*":
                return data1 * data2;


            case "/":
                return data1 / data2;


            case "%":
                return data1 % data2;

            default:
                return 0;
        }
    }
}