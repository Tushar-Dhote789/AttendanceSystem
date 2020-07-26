package com.example.attendanceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class signIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Intent intent =getIntent();
        String regno=intent.getStringExtra(MainActivity.MSG);

        TextView textView=findViewById(R.id.registration);
        textView.setText("Reg no- "+regno);
        }

    public void back(View view)
    {
        Intent packageContext;
        Intent intent =new Intent(this,MainActivity.class);

        startActivity(intent);
    }



}
