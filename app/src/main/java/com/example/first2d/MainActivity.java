package com.example.first2d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private MyView mMyView=null;//a custom view for drawing
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //replace the view with my custom designed view
        mMyView=new MyView(this);
        setContentView(mMyView);
    }
}