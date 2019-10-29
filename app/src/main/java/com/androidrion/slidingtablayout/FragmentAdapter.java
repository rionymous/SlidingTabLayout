package com.androidrion.slidingtablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FragmentAdapter extends FragmentStatePagerAdapter {

    private int TabCount;

    FragmentAdapter(FragmentManager fragmentManager, int CountTabs) {

        super(fragmentManager);

        this.TabCount = CountTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TabChat();

            case 1:
                return new TabStatus();

            case 2:
                return new TabCall();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return TabCount;
    }
}
