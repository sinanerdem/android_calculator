package com.sinan.androidcalculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    TextView operandText;
    TextView resultText;

    EditText operand1EditText;
    EditText operand2EditText;

    Button plusButton;
    Button minusButton;
    Button multiplyButton;
    Button divideButton;
    Button answerButton;
    Button clearButton;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
