package com.example.phamthaivuong.myapplication.EditProfile;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.phamthaivuong.myapplication.R;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class Edti_ProfileActivity extends AppCompatActivity {
    ImageButton imageView;
    Button btnCamera, btnLibrary,btnExit;
    final int RESQUEST_TAKE_PHOTO = 123;
    final int REQUESRT_CHOOSE_PHOTO = 321;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edti__profile);
        imageView = (ImageButton) findViewById(R.id.img_edit);


        Intent intent = getIntent();
        imageView.setImageResource(intent.getIntExtra("image",0));

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(Edti_ProfileActivity.this);
                dialog.setContentView(R.layout.dialog_camera);
                dialog.setCancelable(false);
                dialog.show();
                btnCamera = dialog.findViewById(R.id.camera);
                btnLibrary = dialog.findViewById(R.id.library);
                btnExit = dialog.findViewById(R.id.exit);
                btnCamera.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        takePickre();
                    }
                });

                btnLibrary.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        choosePhoto();
                    }
                });
                btnExit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });

            }
        });
    }
    private void takePickre(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,RESQUEST_TAKE_PHOTO);
    }
    private void choosePhoto(){
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent,REQUESRT_CHOOSE_PHOTO);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (resultCode == RESULT_OK){
            if (requestCode == REQUESRT_CHOOSE_PHOTO){ //Chon hinh
                try {
                    Uri imgUri = data.getData();
                    InputStream is = getContentResolver().openInputStream(imgUri);
                    Bitmap bitmap = BitmapFactory.decodeStream(is);
                    imageView.setImageBitmap(bitmap);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            else if (requestCode == RESQUEST_TAKE_PHOTO){
                Bitmap bitmap = (Bitmap)data.getExtras().get("data");
                imageView.setImageBitmap(bitmap);
            }
        }
    }
}
