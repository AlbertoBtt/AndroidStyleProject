package com.uam.androidapplicationuam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void continue1(View v){
        setContentView(R.layout.activity_main2);
    }

    public void continue2(View v){
        setContentView(R.layout.activity_main3);
    }

    public void continue3(View v){
        Toast.makeText(this, "All Is Tested!!!!!", Toast.LENGTH_SHORT).show();
    }

    public void settings(View v){
        Intent intent1 = new Intent(this, SettingsActivity.class);
        startActivity(intent1);
        //setContentView(R.layout.settings);
    }

    public void return_settings(View v){
        setContentView(R.layout.activity_main);
    }

    public void return_main2(View v){
        setContentView(R.layout.activity_main);
    }

    public void return_main3(View v){
        setContentView(R.layout.activity_main2);
    }



}

