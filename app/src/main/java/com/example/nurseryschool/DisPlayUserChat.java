package com.example.nurseryschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DisPlayUserChat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_play_user_chat);
        getSupportActionBar().hide();
    }
}