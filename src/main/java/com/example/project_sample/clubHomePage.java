package com.example.project_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class clubHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_home_page);
    }
    public void openNew(View v) {
        Intent in = new Intent(this, locationPage.class);
        startActivity(in);
    }

}