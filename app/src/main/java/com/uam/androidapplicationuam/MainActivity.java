package com.uam.androidapplicationuam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSettingsScreen1();
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    public void continue1(View v){
        setContentView(R.layout.activity_main2);
        setSettingsScreen2();
    }

    public void continue2(View v){
        setContentView(R.layout.activity_main3);
        setSettingsScreen3();
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
        setSettingsScreen1();
    }

    public void return_main3(View v){
        setContentView(R.layout.activity_main2);
        setSettingsScreen2();
    }

    private void setSettingsScreen1(){

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        TextView title1=findViewById(R.id.textViewFirst);
        String title1New= pref.getString("list_preference_3","White");
        switch (title1New){
            case "White":
                title1.setTextColor(getResources().getColor(R.color.white));
                break;
            case "Blue":
                title1.setTextColor(getResources().getColor(R.color.teal_700));
                break;
            case "Green":
                title1.setTextColor(getResources().getColor(R.color.green));
                break;
            case "Black":
                title1.setTextColor(getResources().getColor(R.color.black));
                break;
            case "Cream":
                title1.setTextColor(getResources().getColor(R.color.cream));
                break;
            case "Yellow":
                title1.setTextColor(getResources().getColor(R.color.Yellow));
                break;
            case "Teal":
                title1.setTextColor(getResources().getColor(R.color.teal_200));
                break;
            case "Purple":
                title1.setTextColor(getResources().getColor(R.color.purple_500));
                break;
            case "Grey":
                title1.setTextColor(getResources().getColor(R.color.grey));
                break;
            case "Red":
                title1.setTextColor(getResources().getColor(R.color.Red));
                break;
        }
    }

    private void setSettingsScreen2(){

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        TextView title2=findViewById(R.id.textView2);
        String title1New= pref.getString("list_preference_3","White");
        switch (title1New){
            case "White":
                title2.setTextColor(getResources().getColor(R.color.white));
                break;
            case "Blue":
                title2.setTextColor(getResources().getColor(R.color.teal_700));
                break;
            case "Green":
                title2.setTextColor(getResources().getColor(R.color.green));
                break;
            case "Black":
                title2.setTextColor(getResources().getColor(R.color.black));
                break;
            case "Cream":
                title2.setTextColor(getResources().getColor(R.color.cream));
                break;
            case "Yellow":
                title2.setTextColor(getResources().getColor(R.color.Yellow));
                break;
            case "Teal":
                title2.setTextColor(getResources().getColor(R.color.teal_200));
                break;
            case "Purple":
                title2.setTextColor(getResources().getColor(R.color.purple_500));
                break;
            case "Grey":
                title2.setTextColor(getResources().getColor(R.color.grey));
                break;
            case "Red":
                title2.setTextColor(getResources().getColor(R.color.Red));
                break;
        }
    }

    private void setSettingsScreen3(){

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        TextView title3=findViewById(R.id.textView3);
        String title1New= pref.getString("list_preference_3","White");
        switch (title1New){
            case "White":
                title3.setTextColor(getResources().getColor(R.color.white));
                break;
            case "Blue":
                title3.setTextColor(getResources().getColor(R.color.teal_700));
                break;
            case "Green":
                title3.setTextColor(getResources().getColor(R.color.green));
                break;
            case "Black":
                title3.setTextColor(getResources().getColor(R.color.black));
                break;
            case "Cream":
                title3.setTextColor(getResources().getColor(R.color.cream));
                break;
            case "Yellow":
                title3.setTextColor(getResources().getColor(R.color.Yellow));
                break;
            case "Teal":
                title3.setTextColor(getResources().getColor(R.color.teal_200));
                break;
            case "Purple":
                title3.setTextColor(getResources().getColor(R.color.purple_500));
                break;
            case "Grey":
                title3.setTextColor(getResources().getColor(R.color.grey));
                break;
            case "Red":
                title3.setTextColor(getResources().getColor(R.color.Red));
                break;
        }
    }
}

