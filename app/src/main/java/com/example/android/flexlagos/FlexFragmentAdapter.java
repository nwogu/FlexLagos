package com.example.android.flexlagos;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by TEST on 6/19/2017.
 */

public class FlexFragmentAdapter extends FragmentPagerAdapter {

    public FlexFragmentAdapter (FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new CoolFragment();
        }
        else if (position == 1) {
            return new ChilledFragment();
        }
        else
            return new FunkyFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return "Cool";
        }
        else if (position == 1){
            return "Chilled";
        }
        else return "Funky";
    }
}
