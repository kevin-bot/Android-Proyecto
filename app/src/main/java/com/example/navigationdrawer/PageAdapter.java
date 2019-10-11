package com.example.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {

    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0 :

                TabOne myTabOne=new TabOne();
                return myTabOne;
            case 1 :

                TabTwo myTabTwo=new TabTwo();
                return myTabTwo;
            case 2 :

                TabThree myTabThree=new TabThree();
                return myTabThree;
            case 3 :

                TabFour myTabFour=new TabFour();
                return myTabFour;
             default:
                 return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
