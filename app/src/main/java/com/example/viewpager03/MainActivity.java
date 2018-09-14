package com.example.viewpager03;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.viewpager03.fragments.Page1Fragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolBar = findViewById(R.id.toolBar);
        setSupportActionBar(toolBar);

        viewPager = findViewById(R.id.viewPager_main);
        setupViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Page1Fragment(), "Page 1");


        viewPager.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {

    }
}
