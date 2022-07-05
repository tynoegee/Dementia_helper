package com.example.dementia_helper;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

    }
    public void onButtonRegisterClicked(View view){
        Intent intent = new Intent(WelcomeActivity.this,RegisterActivity.class);
        startActivity(intent);
    }
    public void onButtonLoginClicked(View view){
        Intent intent = new Intent(WelcomeActivity.this,LoginActivity.class);
        startActivity(intent);
    }
}