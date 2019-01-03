package com.example.phamthaivuong.myapplication.FAQ;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.phamthaivuong.myapplication.R;

public class FQAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fqa);
        init();
    }

    @SuppressLint("ResourceAsColor")
    private void init() {
       Toolbar toolbar =   findViewById(R.id.toolbar); // get the reference of Toolbar
        //setSupportActionBar(toolbar); // Setting/replace toolbar as the ActionBar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getActionBar().setDisplayHomeAsUpEnabled(true);
//        getActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_back));
        //toolbar.setTitleTextColor(R.color.colorWhite);
        //toolbar.setTitleTextColor(Color.argb(1, 255, 255, 255));


        getSupportActionBar().setTitle("Terms & Conditions");
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
