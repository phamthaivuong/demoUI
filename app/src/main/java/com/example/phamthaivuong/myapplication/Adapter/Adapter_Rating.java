package com.example.phamthaivuong.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.phamthaivuong.myapplication.Model.Model_Rating;
import com.example.phamthaivuong.myapplication.R;

import java.util.ArrayList;

public class Adapter_Rating extends BaseAdapter {
    private ArrayList<Model_Rating> modelRatings;
    private Context c;

    public Adapter_Rating(ArrayList<Model_Rating> modelRatings, Context c) {
        this.modelRatings = modelRatings;
        this.c = c;
    }


    @Override
    public int getCount() {
        return modelRatings.size();
    }

    @Override
    public Object getItem(int position) {
        return modelRatings.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null){
            LayoutInflater inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_list_rating,parent,false);
        }
        TextView txt_title = (TextView)view.findViewById(R.id.txt_rating_title);
        TextView txt_content = (TextView)view.findViewById(R.id.txt_rating_content);
        RatingBar ratingBar = (RatingBar) view.findViewById(R.id.rating);

        final Model_Rating s = modelRatings.get(position);
        txt_title.setText(s.getTitle());
        txt_content.setText(s.getContent());
        ratingBar.setNumStars(s.getNumstart());
        ratingBar.setRating(s.getRating());


        return view;
    }
}
