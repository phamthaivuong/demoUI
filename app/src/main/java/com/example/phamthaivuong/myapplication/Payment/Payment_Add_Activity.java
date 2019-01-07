package com.example.phamthaivuong.myapplication.Payment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.phamthaivuong.myapplication.Payment.Scan_QR_Code.QR_Code_Activity;
import com.example.phamthaivuong.myapplication.R;

public class Payment_Add_Activity extends AppCompatActivity {
    RelativeLayout relative_camera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment__add_);
        relative_camera = (RelativeLayout)findViewById(R.id.relative_camera);
        relative_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Payment_Add_Activity.this,QR_Code_Activity.class);
                startActivity(intent);
            }
        });
    }
}
