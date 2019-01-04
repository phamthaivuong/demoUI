package com.example.phamthaivuong.myapplication.User.SignIn;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.phamthaivuong.myapplication.R;
import com.example.phamthaivuong.myapplication.User.SignUp.SignUp_Activity;

public class SignIn_Activity extends AppCompatActivity {
    android.support.v7.widget.Toolbar toolbar;
    ImageButton imgbtn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_);
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
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn_Activity.this,SignUp_Activity.class);
                startActivity(intent);
            }
        });
    }

    private void init() {
//        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar); // get the reference of Toolbar
//        setSupportActionBar(toolbar); // Setting/replace toolbar as the ActionBar
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_back));
//        toolbar.setBackgroundColor(Color.argb(1,128,50,110));
//        getSupportActionBar().setTitle(null);
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });
        imgbtn = (ImageButton)findViewById(R.id.imgbtn);
        tv = (TextView)findViewById(R.id.txt_signup);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.signup:
                Toast.makeText(this, "Sing Up", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.signup){
            Intent intent = new Intent(SignIn_Activity.this,SignUp_Activity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
