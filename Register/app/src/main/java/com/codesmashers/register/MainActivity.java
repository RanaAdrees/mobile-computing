package com.codesmashers.register;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //ActionBar actionBar = getSupportActionBar();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        actionBar.hide();
        setContentView(R.layout.activity_main);

    }
}