package com.example.android.flexlagos;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager listView = (ViewPager) findViewById(R.id.viewpager);
        FlexFragmentAdapter flexFragmentAdapter = new FlexFragmentAdapter(getSupportFragmentManager());

        listView.setAdapter(flexFragmentAdapter);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(listView);

    }
}
