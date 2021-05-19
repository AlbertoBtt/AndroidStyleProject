package com.uam.androidapplicationuam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
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

    public void settings(MenuItem item){
        Intent intent1 = new Intent(this, SettingsActivity.class);
        startActivity(intent1);
    }

    public void return_main2(View v){
        setContentView(R.layout.activity_main);
    }

    public void return_main3(View v){
        setContentView(R.layout.activity_main2);
    }



}

