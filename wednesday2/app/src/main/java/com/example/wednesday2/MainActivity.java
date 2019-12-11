package com.example.wednesday2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mButton1;
    Button mButton2;
    Button mButton3;
    Button mButton4;
    EditText mEdit1;
    EditText mEdit2;
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton1 = (Button)findViewById(R.id.button1);
        mButton2 = (Button)findViewById(R.id.button2);
        mButton3 = (Button)findViewById(R.id.button3);
        mButton4 = (Button)findViewById(R.id.button4);



        mButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mEdit1   = (EditText)findViewById(R.id.editText3);
                mEdit2   = (EditText)findViewById(R.id.editText4);

                mText = (TextView)findViewById(R.id.textView3);
                double num1 = Double.parseDouble(mEdit1.getText().toString());
                double num2 = Double.parseDouble(mEdit2.getText().toString());

                double sum = num1 + num2;

                mText.setText(Double.toString(sum));

            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mEdit1   = (EditText)findViewById(R.id.editText3);
                mEdit2   = (EditText)findViewById(R.id.editText4);

                mText = (TextView)findViewById(R.id.textView3);
                double num1 = Double.parseDouble(mEdit1.getText().toString());
                double num2 = Double.parseDouble(mEdit2.getText().toString());

                double sub = num1 - num2;

                mText.setText(Double.toString(sub));

            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mEdit1   = (EditText)findViewById(R.id.editText3);
                mEdit2   = (EditText)findViewById(R.id.editText4);

                mText = (TextView)findViewById(R.id.textView3);
                double num1 = Double.parseDouble(mEdit1.getText().toString());
                double num2 = Double.parseDouble(mEdit2.getText().toString());

                double pro = num1 * num2;

                mText.setText(Double.toString(pro));

            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mEdit1   = (EditText)findViewById(R.id.editText3);
                mEdit2   = (EditText)findViewById(R.id.editText4);

                mText = (TextView)findViewById(R.id.textView3);
                double num1 = Double.parseDouble(mEdit1.getText().toString());
                double num2 = Double.parseDouble(mEdit2.getText().toString());

                double dee = num1 / num2;

                mText.setText(Double.toString(dee));

            }
        });



    }
}
