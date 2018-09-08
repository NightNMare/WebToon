package com.example.dlarb.webtoon;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dlarb.webtoon.Adapter.WeekPagerAdapter;

public class MainActivity extends AppCompatActivity {

    TabLayout WeekTab;
    ViewPager MainViewPager;
    ViewPager WebToonViewPager;
    WeekPagerAdapter mWeekPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WeekTab = findViewById(R.id.Week_TabLayout);
        MainViewPager = findViewById(R.id.Main_ViewPager);
        WebToonViewPager = findViewById(R.id.WebToon_ViewPager);

        mWeekPagerAdapter = new WeekPagerAdapter(getSupportFragmentManager());
        WebToonViewPager.setAdapter(mWeekPagerAdapter);

        WeekTab.addTab(WeekTab.newTab().setText("월"));
        WeekTab.addTab(WeekTab.newTab().setText("화"));
        WeekTab.addTab(WeekTab.newTab().setText("수"));
        WeekTab.addTab(WeekTab.newTab().setText("목"));
        WeekTab.addTab(WeekTab.newTab().setText("금"));
        WeekTab.addTab(WeekTab.newTab().setText("토"));
        WeekTab.addTab(WeekTab.newTab().setText("일"));
        WeekTab.addTab(WeekTab.newTab().setText("신작"));
        WeekTab.addTab(WeekTab.newTab().setText("완결"));

        WebToonViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(WeekTab));

        WeekTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                WebToonViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
