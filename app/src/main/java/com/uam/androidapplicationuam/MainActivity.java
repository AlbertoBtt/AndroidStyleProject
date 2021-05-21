package com.uam.androidapplicationuam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.preference.PreferenceManager;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private int nRadioButtons =8;
    private int nCheckboxes =12;

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
        String titleSize=pref.getString("list_preference_1", "36");
        String title1Font = pref.getString("list_preference_2","Coolvetica");
        Button button1= (Button)findViewById(R.id.BotonYes);
        Button button2= (Button)findViewById(R.id.BotonNo);
        String buttonBackground= pref.getString("list_preference_4","Grey");
        String buttonSize=pref.getString("list_preference_6", "30");
        String buttonFont = pref.getString("list_preference_5","Coolvetica");
        String buttonFontColor=pref.getString("list_preference_7","White");
        ConstraintLayout constraintLayout = findViewById(R.id.screen1);
        String screenColor=pref.getString("list_preference_8","Black");

        switch (title1New){
            case "White":
                title1.setTextColor(getResources().getColor(R.color.white));
                break;
            case "Blue":
                title1.setTextColor(getResources().getColor(R.color.blue));
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
                title1.setTextColor(getResources().getColor(R.color.teal_700));
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

        switch (title1Font){
            case "Arial":
                Typeface Arial = ResourcesCompat.getFont(this, R.font.arial);
                title1.setTypeface(Arial);

                break;
            case "Comic Sans":
                Typeface Comic = ResourcesCompat.getFont(this, R.font.comic);
                title1.setTypeface(Comic);

                break;
            case "Coolvetica":
                Typeface Coolvetica = ResourcesCompat.getFont(this, R.font.coolvetica);
                title1.setTypeface(Coolvetica);

                break;
            case "Book Antiqua":
                Typeface Bookantiqua = ResourcesCompat.getFont(this, R.font.bookantiqua);
                title1.setTypeface(Bookantiqua);

                break;
            case "Times New Roman":
                Typeface Time = ResourcesCompat.getFont(this, R.font.times);
                title1.setTypeface(Time);

                break;
        }
        title1.setTextSize(Float.parseFloat(titleSize));
        switch (buttonFont){
            case "Arial":
                Typeface Arial = ResourcesCompat.getFont(this, R.font.arial);
                button1.setTypeface(Arial);
                button2.setTypeface(Arial);

                break;
            case "Comic Sans":
                Typeface Comic = ResourcesCompat.getFont(this, R.font.comic);
                button1.setTypeface(Comic);
                button2.setTypeface(Comic);

                break;
            case "Coolvetica":
                Typeface Coolvetica = ResourcesCompat.getFont(this, R.font.coolvetica);
                button1.setTypeface(Coolvetica);
                button2.setTypeface(Coolvetica);

                break;
            case "Book Antiqua":
                Typeface Bookantiqua = ResourcesCompat.getFont(this, R.font.bookantiqua);
                button1.setTypeface(Bookantiqua);
                button2.setTypeface(Bookantiqua);

                break;
            case "Times New Roman":
                Typeface Time = ResourcesCompat.getFont(this, R.font.times);
                button1.setTypeface(Time);
                button2.setTypeface(Time);

                break;
        }
        switch (buttonBackground){
            case "White":
                button1.setBackgroundTintList(this.getResources().getColorStateList(R.color.white));
                button2.setBackgroundTintList(this.getResources().getColorStateList(R.color.white));
                break;
            case "Blue":
                button1.setBackgroundTintList(this.getResources().getColorStateList(R.color.blue));
                button2.setBackgroundTintList(this.getResources().getColorStateList(R.color.blue));
                break;
            case "Green":
                button1.setBackgroundTintList(this.getResources().getColorStateList(R.color.green));
                button2.setBackgroundTintList(this.getResources().getColorStateList(R.color.green));
                break;
            case "Black":
                button1.setBackgroundTintList(this.getResources().getColorStateList(R.color.black_background));
                button2.setBackgroundTintList(this.getResources().getColorStateList(R.color.black_background));
                break;
            case "Cream":
                button1.setBackgroundTintList(this.getResources().getColorStateList(R.color.cream));
                button2.setBackgroundTintList(this.getResources().getColorStateList(R.color.cream));
                break;
            case "Yellow":
                button1.setBackgroundTintList(this.getResources().getColorStateList(R.color.Yellow));
                button2.setBackgroundTintList(this.getResources().getColorStateList(R.color.Yellow));
                break;
            case "Teal":
                button1.setBackgroundTintList(this.getResources().getColorStateList(R.color.teal_700));
                button2.setBackgroundTintList(this.getResources().getColorStateList(R.color.teal_700));
                break;
            case "Purple":
                button1.setBackgroundTintList(this.getResources().getColorStateList(R.color.purple_500));
                button2.setBackgroundTintList(this.getResources().getColorStateList(R.color.purple_500));
                break;
            case "Grey":
                button1.setBackgroundTintList(this.getResources().getColorStateList(R.color.grey));
                button2.setBackgroundTintList(this.getResources().getColorStateList(R.color.grey));
                break;
            case "Red":
                button1.setBackgroundTintList(this.getResources().getColorStateList(R.color.Red));
                button2.setBackgroundTintList(this.getResources().getColorStateList(R.color.Red));
                break;
        }
        button1.setTextSize(Float.parseFloat(buttonSize));
        button2.setTextSize(Float.parseFloat(buttonSize));
        switch (buttonFontColor){
            case "White":
                button1.setTextColor(this.getResources().getColorStateList(R.color.white));
                button2.setTextColor(this.getResources().getColorStateList(R.color.white));
                break;
            case "Blue":
                button1.setTextColor(this.getResources().getColorStateList(R.color.blue));
                button2.setTextColor(this.getResources().getColorStateList(R.color.blue));
                break;
            case "Green":
                button1.setTextColor(this.getResources().getColorStateList(R.color.green));
                button2.setTextColor(this.getResources().getColorStateList(R.color.green));
                break;
            case "Black":
                button1.setTextColor(this.getResources().getColorStateList(R.color.black_background));
                button2.setTextColor(this.getResources().getColorStateList(R.color.black_background));
                break;
            case "Cream":
                button1.setTextColor(this.getResources().getColorStateList(R.color.cream));
                button2.setTextColor(this.getResources().getColorStateList(R.color.cream));
                break;
            case "Yellow":
                button1.setTextColor(this.getResources().getColorStateList(R.color.Yellow));
                button2.setTextColor(this.getResources().getColorStateList(R.color.Yellow));
                break;
            case "Teal":
                button1.setTextColor(this.getResources().getColorStateList(R.color.teal_700));
                button2.setTextColor(this.getResources().getColorStateList(R.color.teal_700));
                break;
            case "Purple":
                button1.setTextColor(this.getResources().getColorStateList(R.color.purple_500));
                button2.setTextColor(this.getResources().getColorStateList(R.color.purple_500));
                break;
            case "Grey":
                button1.setTextColor(this.getResources().getColorStateList(R.color.grey));
                button2.setTextColor(this.getResources().getColorStateList(R.color.grey));
                break;
            case "Red":
                button1.setTextColor(this.getResources().getColorStateList(R.color.Red));
                button2.setTextColor(this.getResources().getColorStateList(R.color.Red));
                break;
        }
        switch (screenColor){
            case "White":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.white));
                break;
            case "Blue":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.blue));
                break;
            case "Green":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.green));
                break;
            case "Black":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.black_background));
                break;
            case "Cream":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.cream));
                break;
            case "Yellow":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.Yellow));
                break;
            case "Teal":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.teal_700));
                break;
            case "Purple":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.purple_500));
                break;
            case "Grey":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.grey));
                break;
            case "Red":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.Red));
                break;
        }
    }

    private void setSettingsScreen2(){

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        TextView title2=findViewById(R.id.textView2);
        String title1New= pref.getString("list_preference_3","White");
        String titleSize=pref.getString("list_preference_1", "36");
        String title2Font = pref.getString("list_preference_2","Coolvetica");
        Button button= (Button)findViewById(R.id.button);
        String buttonBackground= pref.getString("list_preference_4","Grey");
        String buttonFont = pref.getString("list_preference_5","Coolvetica");
        String buttonSize=pref.getString("list_preference_6", "30");
        String buttonFontColor=pref.getString("list_preference_7","White");
        ConstraintLayout constraintLayout = findViewById(R.id.screen2);
        String screenColor=pref.getString("list_preference_8","Black");



        switch (title1New){
            case "White":
                title2.setTextColor(getResources().getColor(R.color.white));
                break;
            case "Blue":
                title2.setTextColor(getResources().getColor(R.color.blue));
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
        switch (title2Font){
            case "Arial":
                Typeface Arial = ResourcesCompat.getFont(this, R.font.arial);
                title2.setTypeface(Arial);

                break;
            case "Comic Sans":
                Typeface Comic = ResourcesCompat.getFont(this, R.font.comic);
                title2.setTypeface(Comic);

                break;
            case "Coolvetica":
                Typeface Coolvetica = ResourcesCompat.getFont(this, R.font.coolvetica);
                title2.setTypeface(Coolvetica);

                break;
            case "Book Antiqua":
                Typeface Bookantiqua = ResourcesCompat.getFont(this, R.font.bookantiqua);
                title2.setTypeface(Bookantiqua);

                break;
            case "Times New Roman":
                Typeface Time = ResourcesCompat.getFont(this, R.font.times);
                title2.setTypeface(Time);

                break;
        }
        title2.setTextSize(Float.parseFloat(titleSize));
        switch (buttonBackground){
            case "White":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.white));
                break;
            case "Blue":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.blue));
                break;
            case "Green":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.green));
                break;
            case "Black":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.black_background));
                break;
            case "Cream":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.cream));
                break;
            case "Yellow":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.Yellow));
                break;
            case "Teal":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.teal_700));
                break;
            case "Purple":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.purple_500));
                break;
            case "Grey":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.grey));
                break;
            case "Red":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.Red));
                break;
        }
        switch (buttonFont){
            case "Arial":
                Typeface Arial = ResourcesCompat.getFont(this, R.font.arial);
                button.setTypeface(Arial);

                break;
            case "Comic Sans":
                Typeface Comic = ResourcesCompat.getFont(this, R.font.comic);
                button.setTypeface(Comic);

                break;
            case "Coolvetica":
                Typeface Coolvetica = ResourcesCompat.getFont(this, R.font.coolvetica);
                button.setTypeface(Coolvetica);

                break;
            case "Book Antiqua":
                Typeface Bookantiqua = ResourcesCompat.getFont(this, R.font.bookantiqua);
                button.setTypeface(Bookantiqua);

                break;
            case "Times New Roman":
                Typeface Time = ResourcesCompat.getFont(this, R.font.times);
                button.setTypeface(Time);
                break;
        }
        button.setTextSize(Float.parseFloat(buttonSize));
        switch (buttonFontColor){
            case "White":
                button.setTextColor(this.getResources().getColorStateList(R.color.white));
                break;
            case "Blue":
                button.setTextColor(this.getResources().getColorStateList(R.color.blue));
                break;
            case "Green":
                button.setTextColor(this.getResources().getColorStateList(R.color.green));
                break;
            case "Black":
                button.setTextColor(this.getResources().getColorStateList(R.color.black_background));
                break;
            case "Cream":
                button.setTextColor(this.getResources().getColorStateList(R.color.cream));
                break;
            case "Yellow":
                button.setTextColor(this.getResources().getColorStateList(R.color.Yellow));
                break;
            case "Teal":
                button.setTextColor(this.getResources().getColorStateList(R.color.teal_700));
                break;
            case "Purple":
                button.setTextColor(this.getResources().getColorStateList(R.color.purple_500));
                break;
            case "Grey":
                button.setTextColor(this.getResources().getColorStateList(R.color.grey));
                break;
            case "Red":
                button.setTextColor(this.getResources().getColorStateList(R.color.Red));
                break;
        }
        switch (screenColor){
            case "White":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.white));
                break;
            case "Blue":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.blue));
                break;
            case "Green":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.green));
                break;
            case "Black":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.black_background));
                break;
            case "Cream":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.cream));
                break;
            case "Yellow":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.Yellow));
                break;
            case "Teal":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.teal_700));
                break;
            case "Purple":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.purple_500));
                break;
            case "Grey":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.grey));
                break;
            case "Red":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.Red));
                break;
        }

        List<RadioButton> list=new ArrayList<RadioButton>();
        for (int i = 0; i < nRadioButtons; i++) {
            int id = getResources().getIdentifier("radioButton"+(1+i), "id", getPackageName());
            list.add((RadioButton) findViewById(id));
        }

        String textSize = pref.getString("list_preference_10", "24");
        String textFont = pref.getString("list_preference_9","Coolvetica");
        String textColor = pref.getString("list_preference_11","White");

        switch (textFont){
            case "Arial":
                Typeface Arial = ResourcesCompat.getFont(this, R.font.arial);
                for (int i = 0; i < nRadioButtons; ++i) {
                    list.get(i).setTypeface(Arial);
                }
                break;
            case "Comic Sans":
                Typeface Comic = ResourcesCompat.getFont(this, R.font.comic);
                for (int i = 0; i < nRadioButtons; ++i) {
                    list.get(i).setTypeface(Comic);
                }
                break;
            case "Coolvetica":
                Typeface Coolvetica = ResourcesCompat.getFont(this, R.font.coolvetica);
                for (int i = 0; i < nRadioButtons; ++i) {
                    list.get(i).setTypeface(Coolvetica);
                }
                break;
            case "Book Antiqua":
                Typeface Booqantiqua = ResourcesCompat.getFont(this, R.font.bookantiqua);
                for (int i = 0; i < nRadioButtons; ++i) {
                    list.get(i).setTypeface(Booqantiqua);
                }
                break;
            case "Times New Roman":
                Typeface Times = ResourcesCompat.getFont(this, R.font.times);
                for (int i = 0; i < nRadioButtons; ++i) {
                    list.get(i).setTypeface(Times);
                }
                break;
        }

        for(int i=0;i<nRadioButtons;i++){
            list.get(i).setTextSize(Float.parseFloat(textSize));
        }

        switch (textColor){
            case "White":
                for (int i = 0; i < nRadioButtons; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.white));
                }
                break;
            case "Blue":
                for (int i = 0; i < nRadioButtons; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.blue));
                }
                break;
            case "Green":
                for (int i = 0; i < nRadioButtons; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.green));
                }
                break;
            case "Black":
                for (int i = 0; i < nRadioButtons; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.black));
                }
                break;
            case "Cream":
                for (int i = 0; i < nRadioButtons; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.cream));
                }
                break;
            case "Yellow":
                for (int i = 0; i < nRadioButtons; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.Yellow));
                }
                break;
            case "Teal":
                for (int i = 0; i < nRadioButtons; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.teal_700));
                }
                break;
            case "Purple":
                for (int i = 0; i < nRadioButtons; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.purple_500));
                }
                break;
            case "Grey":
                for (int i = 0; i < nRadioButtons; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.grey));
                }
                break;
            case "Red":
                for (int i = 0; i < nRadioButtons; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.Red));
                }
                break;
        }
    }

    private void setSettingsScreen3(){

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        TextView title3=findViewById(R.id.textView3);
        String title1New= pref.getString("list_preference_3","White");
        String titleSize=pref.getString("list_preference_1", "36");
        String title3Font = pref.getString("list_preference_2","Coolvetica");
        Button button= (Button)findViewById(R.id.button2);
        String buttonBackground= pref.getString("list_preference_4","Grey");
        String buttonFont = pref.getString("list_preference_5","Coolvetica");
        String buttonSize=pref.getString("list_preference_6", "30");
        String buttonFontColor=pref.getString("list_preference_7","White");
        ConstraintLayout constraintLayout = findViewById(R.id.screen3);
        String screenColor=pref.getString("list_preference_8","Black");


        switch (title1New){
            case "White":
                title3.setTextColor(getResources().getColor(R.color.white));
                break;
            case "Blue":
                title3.setTextColor(getResources().getColor(R.color.blue));
                break;
            case "Green":
                title3.setTextColor(getResources().getColor(R.color.green));
                break;
            case "Black":
                title3.setTextColor(getResources().getColor(R.color.black_background));
                break;
            case "Cream":
                title3.setTextColor(getResources().getColor(R.color.cream));
                break;
            case "Yellow":
                title3.setTextColor(getResources().getColor(R.color.Yellow));
                break;
            case "Teal":
                title3.setTextColor(getResources().getColor(R.color.teal_700));
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
        switch (title3Font){
            case "Arial":
                Typeface Arial = ResourcesCompat.getFont(this, R.font.arial);
                title3.setTypeface(Arial);

                break;
            case "Comic Sans":
                Typeface Comic = ResourcesCompat.getFont(this, R.font.comic);
                title3.setTypeface(Comic);

                break;
            case "Coolvetica":
                Typeface Coolvetica = ResourcesCompat.getFont(this, R.font.coolvetica);
                title3.setTypeface(Coolvetica);

                break;
            case "Book Antiqua":
                Typeface Bookantiqua = ResourcesCompat.getFont(this, R.font.bookantiqua);
                title3.setTypeface(Bookantiqua);

                break;
            case "Times New Roman":
                Typeface Time = ResourcesCompat.getFont(this, R.font.times);
                title3.setTypeface(Time);

                break;
        }
        title3.setTextSize(Float.parseFloat(titleSize));
        switch (buttonBackground){
            case "White":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.white));
                break;
            case "Blue":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.blue));
                break;
            case "Green":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.green));
                break;
            case "Black":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.black_background));
                break;
            case "Cream":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.cream));
                break;
            case "Yellow":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.Yellow));
                break;
            case "Teal":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.teal_700));
                break;
            case "Purple":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.purple_500));
                break;
            case "Grey":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.grey));
                break;
            case "Red":
                button.setBackgroundTintList(this.getResources().getColorStateList(R.color.Red));
                break;
        }
        switch (buttonFont){
            case "Arial":
                Typeface Arial = ResourcesCompat.getFont(this, R.font.arial);
                button.setTypeface(Arial);

                break;
            case "Comic Sans":
                Typeface Comic = ResourcesCompat.getFont(this, R.font.comic);
                button.setTypeface(Comic);

                break;
            case "Coolvetica":
                Typeface Coolvetica = ResourcesCompat.getFont(this, R.font.coolvetica);
                button.setTypeface(Coolvetica);

                break;
            case "Book Antiqua":
                Typeface Bookantiqua = ResourcesCompat.getFont(this, R.font.bookantiqua);
                button.setTypeface(Bookantiqua);

                break;
            case "Times New Roman":
                Typeface Time = ResourcesCompat.getFont(this, R.font.times);
                button.setTypeface(Time);
                break;
        }
        button.setTextSize(Float.parseFloat(buttonSize));
        switch (buttonFontColor){
            case "White":
                button.setTextColor(this.getResources().getColorStateList(R.color.white));
                break;
            case "Blue":
                button.setTextColor(this.getResources().getColorStateList(R.color.blue));
                break;
            case "Green":
                button.setTextColor(this.getResources().getColorStateList(R.color.green));
                break;
            case "Black":
                button.setTextColor(this.getResources().getColorStateList(R.color.black_background));
                break;
            case "Cream":
                button.setTextColor(this.getResources().getColorStateList(R.color.cream));
                break;
            case "Yellow":
                button.setTextColor(this.getResources().getColorStateList(R.color.Yellow));
                break;
            case "Teal":
                button.setTextColor(this.getResources().getColorStateList(R.color.teal_700));
                break;
            case "Purple":
                button.setTextColor(this.getResources().getColorStateList(R.color.purple_500));
                break;
            case "Grey":
                button.setTextColor(this.getResources().getColorStateList(R.color.grey));
                break;
            case "Red":
                button.setTextColor(this.getResources().getColorStateList(R.color.Red));
                break;
        }
        switch (screenColor){
            case "White":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.white));
                break;
            case "Blue":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.blue));
                break;
            case "Green":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.green));
                break;
            case "Black":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.black_background));
                break;
            case "Cream":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.cream));
                break;
            case "Yellow":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.Yellow));
                break;
            case "Teal":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.teal_700));
                break;
            case "Purple":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.purple_500));
                break;
            case "Grey":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.grey));
                break;
            case "Red":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.Red));
                break;
        }

        List<CheckBox> list=new ArrayList<CheckBox>();
        for (int i = 0; i < nCheckboxes; i++) {
            int id = getResources().getIdentifier("checkBox"+(1+i), "id", getPackageName());
            list.add((CheckBox) findViewById(id));
        }

        String textSize = pref.getString("list_preference_10", "24");
        String textFont = pref.getString("list_preference_9","Coolvetica");
        String textColor = pref.getString("list_preference_11","White");

        switch (textFont){
            case "Arial":
                Typeface Arial = ResourcesCompat.getFont(this, R.font.arial);
                for (int i = 0; i < nCheckboxes; ++i) {
                    list.get(i).setTypeface(Arial);
                }
                break;
            case "Comic Sans":
                Typeface Comic = ResourcesCompat.getFont(this, R.font.comic);
                for (int i = 0; i < nCheckboxes; ++i) {
                    list.get(i).setTypeface(Comic);
                }
                break;
            case "Coolvetica":
                Typeface Coolvetica = ResourcesCompat.getFont(this, R.font.coolvetica);
                for (int i = 0; i < nCheckboxes; ++i) {
                    list.get(i).setTypeface(Coolvetica);
                }
                break;
            case "Book Antiqua":
                Typeface Booqantiqua = ResourcesCompat.getFont(this, R.font.bookantiqua);
                for (int i = 0; i < nCheckboxes; ++i) {
                    list.get(i).setTypeface(Booqantiqua);
                }
                break;
            case "Times New Roman":
                Typeface Times = ResourcesCompat.getFont(this, R.font.times);
                for (int i = 0; i < nCheckboxes; ++i) {
                    list.get(i).setTypeface(Times);
                }
                break;
        }
        switch (textColor){
            case "White":
                for (int i = 0; i < nCheckboxes; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.white));
                }
                break;
            case "Blue":
                for (int i = 0; i < nCheckboxes; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.blue));
                }
                break;
            case "Green":
                for (int i = 0; i < nCheckboxes; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.green));
                }
                break;
            case "Black":
                for (int i = 0; i < nCheckboxes; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.black));
                }
                break;
            case "Cream":
                for (int i = 0; i < nCheckboxes; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.cream));
                }
                break;
            case "Yellow":
                for (int i = 0; i < nCheckboxes; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.Yellow));
                }
                break;
            case "Teal":
                for (int i = 0; i < nCheckboxes; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.teal_700));
                }
                break;
            case "Purple":
                for (int i = 0; i < nCheckboxes; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.purple_500));
                }
                break;
            case "Grey":
                for (int i = 0; i < nCheckboxes; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.grey));
                }
                break;
            case "Red":
                for (int i = 0; i < nCheckboxes; ++i) {
                    list.get(i).setTextColor(getResources().getColor(R.color.Red));
                }
                break;
        }

        for(int i=0;i<nCheckboxes;i++){
            list.get(i).setTextSize(Float.parseFloat(textSize));
        }



    }
}

