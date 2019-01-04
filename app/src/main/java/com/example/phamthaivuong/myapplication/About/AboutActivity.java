package com.example.phamthaivuong.myapplication.About;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.phamthaivuong.myapplication.R;

public class AboutActivity extends AppCompatActivity {
    ImageButton imgbtn;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        init();
        addEvent();
    }
    private void addEvent() {
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    @SuppressLint("ResourceAsColor")
    private void init() {
        imgbtn = (ImageButton)findViewById(R.id.imgbtn);


    }
}
