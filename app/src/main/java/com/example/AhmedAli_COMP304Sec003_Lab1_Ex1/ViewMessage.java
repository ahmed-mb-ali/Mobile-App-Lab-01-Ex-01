//Author: Ahmed Ali
//Assignment 01: Exercise 01
//Date 24th Jan, 2022

package com.example.AhmedAli_COMP304Sec003_Lab1_Ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ViewMessage extends AppCompatActivity {

    //Declare the views
    TextView textViewMessage;
    String Message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);

        //Set up references to GUI view
        textViewMessage = findViewById(R.id.textViewMessage);

        //Getting the text message from the Main Activity
        Message = getIntent().getExtras().getString("Value");
        textViewMessage.setText(Message);
    }
}