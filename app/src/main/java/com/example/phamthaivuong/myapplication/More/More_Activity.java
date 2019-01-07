package com.example.phamthaivuong.myapplication.More;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.phamthaivuong.myapplication.More.Fragment.Fragment_book;
import com.example.phamthaivuong.myapplication.More.Fragment.Fragment_chat;
import com.example.phamthaivuong.myapplication.More.Fragment.Fragment_home;
import com.example.phamthaivuong.myapplication.More.Fragment.Fragment_more;
import com.example.phamthaivuong.myapplication.More.Fragment.Fragment_notification;
import com.example.phamthaivuong.myapplication.R;

public class More_Activity extends AppCompatActivity {
    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;
    private Fragment_book fragment_book;
    private Fragment_chat fragment_chat;
    private Fragment_home fragment_home;
    private Fragment_notification fragment_notification;
    private Fragment_more fragment_more;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_);

        mMainNav = (BottomNavigationView)findViewById(R.id.main_nav);
        mMainFrame = (FrameLayout)findViewById(R.id.main_frame);

        fragment_book = new Fragment_book();
        fragment_chat = new Fragment_chat();
        fragment_home = new Fragment_home();
        fragment_notification = new Fragment_notification();
        fragment_more = new Fragment_more();

        setFragment(fragment_home);

        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_book:
                        mMainNav.setItemBackgroundResource(R.color.brown);
                        setFragment(fragment_book);
                        return true;
                    case R.id.nav_chat:
                        mMainNav.setItemBackgroundResource(R.color.brown);
                        mMainNav.getItemIconTintList();
                        setFragment(fragment_chat);
                        return true;
                    case R.id.nav_home:
                        mMainNav.setItemBackgroundResource(R.color.brown);
                        setFragment(fragment_home);
                        return true;
                    case R.id.nav_notification:
                        mMainNav.setItemBackgroundResource(R.color.brown);
                        setFragment(fragment_notification);
                        return true;
                    case R.id.nav_more:
                        mMainNav.setItemBackgroundResource(R.color.brown);
                        setFragment(fragment_more);
                        return true;

                        default:
                            return false;
                }
            }
        });
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame,fragment);
        fragmentTransaction.commit();

    }
}
