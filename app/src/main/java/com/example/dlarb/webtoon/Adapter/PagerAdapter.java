package com.example.dlarb.webtoon.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.dlarb.webtoon.Fragment.FineWebToonFragment;
import com.example.dlarb.webtoon.Fragment.FridayFragment;
import com.example.dlarb.webtoon.Fragment.MondayFragment;
import com.example.dlarb.webtoon.Fragment.NewWebToonFragment;
import com.example.dlarb.webtoon.Fragment.SaturdayFragment;
import com.example.dlarb.webtoon.Fragment.SundayFragment;
import com.example.dlarb.webtoon.Fragment.ThursdayFragment;
import com.example.dlarb.webtoon.Fragment.TuesdayFragment;
import com.example.dlarb.webtoon.Fragment.WednesdayFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new MondayFragment();
            case 1:return new TuesdayFragment();
            case 2:return new WednesdayFragment();
            case 3:return new ThursdayFragment();
            case 4:return new FridayFragment();
            case 5:return new SaturdayFragment();
            case 6:return new SundayFragment();
            case 7:return new NewWebToonFragment();
            case 8:return new FineWebToonFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 9;
    }
}
