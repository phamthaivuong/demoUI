package com.example.phamthaivuong.myapplication.User.SignUp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.phamthaivuong.myapplication.FAQ.FQAActivity;
import com.example.phamthaivuong.myapplication.R;

public class SignUp_3_Activity extends AppCompatActivity {
    android.support.v7.widget.Toolbar toolbar;
    Button btn;
    ImageButton imgbtn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_3_);
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

        btn = (Button)findViewById(R.id.btnNext);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_3_Activity.this,FQAActivity.class);
                startActivity(intent);
            }
        });
    }
}
