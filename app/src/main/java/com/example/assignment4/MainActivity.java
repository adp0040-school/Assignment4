package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView balanceTextView, dateTextView, amountTextView, spendingTextView, historyTextView;
Button addButton, spendingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        balanceTextView = (TextView) findViewById(R.id.balanceTextView);
        dateTextView = (TextView) findViewById(R.id.dateTextView);
        amountTextView = (TextView) findViewById(R.id.amountTextView);
        spendingTextView = (TextView) findViewById(R.id.spendingTextView);
        historyTextView = (TextView) findViewById(R.id.historyTextView);
        addButton = (Button) findViewById(R.id.addButton);
        spendingButton = (Button) findViewById(R.id.spendingButton);
        


    }
}
