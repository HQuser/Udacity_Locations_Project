package com.example.abdur.lahorelocations;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Abdur on 22-Sep-17.
 */

public class LocationFragmentAdapter extends FragmentPagerAdapter {

    private static String[] fragmentPageTitle = {"Parks", "Hospitals", "Restaurants", "History"};

    public LocationFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ParkFragment();
            case 1:
                return new HospitalFragment();
            case 2:
                return new RestaurantFragment();
            case 3:
                return new HistoryFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentPageTitle[position];
    }
}
