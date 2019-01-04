package com.example.phamthaivuong.myapplication.Rating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.phamthaivuong.myapplication.Adapter.Adapter_Rating;
import com.example.phamthaivuong.myapplication.Model.RadingCollection;
import com.example.phamthaivuong.myapplication.R;

public class Rating_Activity extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_);
        init();
    }

    private void init() {
        lv = (ListView)findViewById(R.id.lv_rating);
        lv.setAdapter(new Adapter_Rating(RadingCollection.getModel_Ratings(), Rating_Activity.this));
    }
}
