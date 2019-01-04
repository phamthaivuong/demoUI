package com.example.phamthaivuong.myapplication.Model;

public class Model_Rating {
    private float rating;
    private String title;
    private String content;
    private int numstart;

    public Model_Rating(float rating, String title, String content, int numstart) {
        this.rating = rating;
        this.title = title;
        this.content = content;
        this.numstart = numstart;
    }

    public Model_Rating() {
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNumstart() {
        return numstart;
    }

    public void setNumstart(int numstart) {
        this.numstart = numstart;
    }
}
