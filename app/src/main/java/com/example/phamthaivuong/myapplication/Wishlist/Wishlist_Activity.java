package com.example.phamthaivuong.myapplication.Wishlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.phamthaivuong.myapplication.EditProfile.Edti_ProfileActivity;
import com.example.phamthaivuong.myapplication.R;

public class Wishlist_Activity extends AppCompatActivity {
    GridView gridView;
    int[] fruitImages = {R.drawable.gird_1,R.drawable.gird_2,R.drawable.grid_3};
    final int RESQUEST_TAKE_PHOTO = 123;
    final int REQUESRT_CHOOSE_PHOTO = 321;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist_);
        gridView = (GridView)findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),Edti_ProfileActivity.class);
                intent.putExtra("image",fruitImages[i]);
                startActivity(intent);

            }
        });
    }
    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return fruitImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.custom_gridview_wishlist,null);
            //getting view in row_data
            ImageView image = view1.findViewById(R.id.images);

            image.setImageResource(fruitImages[i]);
            return view1;



        }
    }

}
