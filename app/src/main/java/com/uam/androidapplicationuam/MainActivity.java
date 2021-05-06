package com.uam.androidapplicationuam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.paris.Paris;

import org.w3c.dom.Text;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        View v = findViewById(android.R.id.content).getRootView();
//        Paris.style(v).apply(R.style.AppTheme);
//        TextView txtView = findViewById(R.id.textView);
//        Paris.style(txtView).apply(R.style.Titles);
//        TextView view=findViewById(R.id.BotonYes);
//        Paris.style(view).apply(R.style.CKButton);
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

