package com.example.phamthaivuong.myapplication.FAQ;

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

public class Detail_FQAActivity extends AppCompatActivity {
    TextView txt_content,txt_title;
    ImageButton imgbtn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__fqa);
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
        txt_title = (TextView)findViewById(R.id.txt_title);
        txt_content = (TextView)findViewById(R.id.txt_content);
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("dulieu");
        String content = bundle.getString("content");
        String title = bundle.getString("title");
        txt_title.setText(title);
        txt_content.setText(content);

    }
}
