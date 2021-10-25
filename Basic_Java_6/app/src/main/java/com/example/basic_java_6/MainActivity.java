package com.example.basic_java_6;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import java.util.Random;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string,Toast.LENGTH_SHORT).show();
    }

    public void Guess(View view){

        EditText inputNumber = (EditText) findViewById(R.id.inputNumber);

        int guessInt = Integer.parseInt(inputNumber.getText().toString());

        if (guessInt > randomNumber){
            makeToast("Lower !");
        }else if(guessInt < randomNumber) {
            makeToast("Higher !");
        }else{
            makeToast("Congratulation !!!");
            Random rand = new Random();
            randomNumber = rand.nextInt(20) +1;

        }

        Toast.makeText(MainActivity.this, inputNumber.getText().toString(),Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber= rand.nextInt(20) +1;

    }
}