package com.preusapps.energyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ApplianceActivity extends AppCompatActivity {

    EditText applianceNameInput;
    TextView displayAllAppliances;
    DBHelper dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appliance);
        applianceNameInput = (EditText) findViewById(R.id.applianceNameInput);
        displayAllAppliances = (TextView) findViewById(R.id.displayAllAppliances);
        dbHandler = new DBHelper(this, null, null, 1);
//        printDatabase();
    }

    public void printDatabase() {
        String dbString = dbHandler.databaseToString();
        displayAllAppliances.setText(dbString);
        applianceNameInput.setText("");
    }

    public void MenuBtnClicked(View view) {
        Intent i = new Intent(this, MenuActivity.class);
        startActivity(i);
    }

    public void AddBtnClicked(View view) {
        Intent i = new Intent(this, AddApplianceActivity.class);
        startActivity(i);
    }

}
