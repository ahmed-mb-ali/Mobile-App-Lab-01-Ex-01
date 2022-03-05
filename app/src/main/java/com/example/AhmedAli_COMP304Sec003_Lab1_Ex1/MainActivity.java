//Author: Ahmed Ali
//Assignment 01: Exercise 01
//Date 24th Jan, 2022

package com.example.AhmedAli_COMP304Sec003_Lab1_Ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declare the views
    EditText editTextMessage;
    Button buttonSend;
    String Message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set up references to GUI view
        buttonSend = (Button) findViewById(R.id.buttonSend);
        editTextMessage = (EditText) findViewById(R.id.editTextMessage);


        //Click button Send, it will display a message in view message page
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Using Intent to display between two activities
                Intent intent = new Intent(MainActivity.this,ViewMessage.class);
                Message = editTextMessage.getText().toString();
                intent.putExtra("Value", Message);
                startActivity(intent);
                 }

        });
    }
}