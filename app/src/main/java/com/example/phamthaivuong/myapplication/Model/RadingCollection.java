package com.example.phamthaivuong.myapplication.Model;

import com.example.phamthaivuong.myapplication.Model.Model_Rating;
import com.example.phamthaivuong.myapplication.R;

import java.util.ArrayList;

public class RadingCollection {
    public static String content_1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore mangna aliqua. Ut enim ad minim veniam, quis nostrud exercitation";
    public static ArrayList<Model_Rating> getModel_Ratings(){
        ArrayList<Model_Rating> modelRatings = new ArrayList<>();

        Model_Rating s = new Model_Rating();
        s.setTitle("Fannie Gill");
        s.setRating(5);
        s.setContent(content_1);
        s.setNumstart(5);
        modelRatings.add(s);

        Model_Rating ss = new Model_Rating();
        ss.setTitle("Jeralcl Buchanan");
        ss.setRating(5);
        ss.setNumstart(4);
        ss.setContent(content_1);
        modelRatings.add(ss);

        return modelRatings;
    }
}
