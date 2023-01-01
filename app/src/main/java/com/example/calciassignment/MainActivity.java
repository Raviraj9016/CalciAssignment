package com.example.calciassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    int a;
    int b;
    boolean isPlusClicked, isMinusClicked, isMultiplyClicked, isDivisionClicked, isModClicked, isClearClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.txtOperation);
        Button btn1 = findViewById(R.id.btnone);
        Button btn2 = findViewById(R.id.btntwo);
        Button btn3 = findViewById(R.id.btnthree);
        Button btn4 = findViewById(R.id.btnfour);
        Button btn5 = findViewById(R.id.btnfive);
        Button btn6 = findViewById(R.id.btnsix);
        Button btn7 = findViewById(R.id.btnseven);
        Button btn8 = findViewById(R.id.btneight);
        Button btn9 = findViewById(R.id.btnnine);
        Button btn0 = findViewById(R.id.btnzero);
        Button btnPlus = findViewById(R.id.btnplus);
        Button btnMinus = findViewById(R.id.btnMinus);
        Button btnMultiply = findViewById(R.id.btnMultiply);
        Button btnDivision = findViewById(R.id.btnDivision);
        Button btnMod = findViewById(R.id.btnMod);
        Button btnClear = findViewById(R.id.btnClear);
        Button btnEqual = findViewById(R.id.btnEqual);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "1");


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "2");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "4");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "7");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "8");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "9");

            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "0");

            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(textView.getText().toString());
                textView.setText("");
                isPlusClicked = true;
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(textView.getText().toString());
                textView.setText("");
                isMinusClicked = true;
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(textView.getText().toString());
                textView.setText("");
                isMultiplyClicked = true;
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(textView.getText().toString());
                textView.setText("");
                isDivisionClicked = true;
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(textView.getText().toString());
                textView.setText("");
                isModClicked = true;
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("");

            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    b = Integer.parseInt(textView.getText().toString());
                    textView.setText("");
                } catch (NumberFormatException exception) {
                    exception.printStackTrace();
                }

                if (isPlusClicked) {

                    int sum = a + b;
                    textView.setText("" + sum);
                    isPlusClicked = false;

                } else if (isMinusClicked) {

                    int minus = a - b;
                    textView.setText("" + minus);
                    isMinusClicked = false;

                } else if (isMultiplyClicked) {

                    int multiply = a * b;
                    textView.setText("" + multiply);
                    isMultiplyClicked = false;

                } else if (isDivisionClicked) {

                    double division = (double) a / b;
                    textView.setText("" + division);
                    isDivisionClicked = false;
                } else if (isModClicked) {

                    int mod = (a * b) / 100;
                    textView.setText("" + mod);
                    isModClicked = false;
                }
            }
        });
    }
}