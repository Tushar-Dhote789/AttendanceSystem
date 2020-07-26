package com.example.attendanceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public static final String MSG="com.signIn.registrationNo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signIn(View view)
    {

        Intent intent =new Intent(this,signIn.class);

        EditText regno =findViewById(R.id.regno);
        String registrationNo=regno.getText().toString();
        intent.putExtra(MSG,registrationNo);
        startActivity(intent);
    }



}
