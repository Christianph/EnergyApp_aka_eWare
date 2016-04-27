package com.preusapps.energyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void MenuBtnClicked(View view) {
        Intent i = new Intent(this, MenuActivity.class);
        startActivity(i);
    }

    public void AddBtnClicked(View view) {
        Intent i = new Intent(this, AddActivity.class);
        startActivity(i);
    }
}