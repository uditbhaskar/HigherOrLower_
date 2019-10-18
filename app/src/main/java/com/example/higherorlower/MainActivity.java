package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int targetNum;

    public void targetNUM() {
        targetNum = (int) (Math.random() * 20 + 1); // Generating random result to be matched with user's input.
    }
    public void clickFunction(View view) {

        try {
            EditText guessNum = (EditText) findViewById(R.id.guessNum);

            int userNum = Integer.parseInt(guessNum.getText().toString()); //converting user string into double

            if (userNum > targetNum) {

                Toast.makeText(this, "Go Lower!", Toast.LENGTH_LONG).show();

            } else if (userNum < targetNum) {

                Toast.makeText(this, "Go Higher!", Toast.LENGTH_LONG).show();

            } else {
                Toast.makeText(this, "Amazing! You Got It RIGHT!", Toast.LENGTH_SHORT).show();
                targetNUM();
            }

        }catch (NumberFormatException e){
            Toast.makeText(this, "Enter some numbers.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        targetNUM();
    }
}
