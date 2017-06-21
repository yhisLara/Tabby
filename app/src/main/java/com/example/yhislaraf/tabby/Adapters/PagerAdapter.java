package com.example.yhislaraf.tabby.Adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.yhislaraf.tabby.Fragments.FormFragment;
import com.example.yhislaraf.tabby.Fragments.ListFragment;

/**
 * Created by yhislaraf on 09-06-17.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int numberTabs;

    public PagerAdapter(FragmentManager fm, int numberTabs) {
        super(fm);
        this.numberTabs = numberTabs;
    }



    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0:
                return new FormFragment();
            case 1:
                return new ListFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberTabs;
    }
}
