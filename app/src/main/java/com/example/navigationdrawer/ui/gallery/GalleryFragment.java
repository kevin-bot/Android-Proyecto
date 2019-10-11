package com.example.navigationdrawer.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.navigationdrawer.PageAdapter;
import com.example.navigationdrawer.R;
import com.google.android.material.tabs.TabLayout;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel = ViewModelProviders.of(this).get(GalleryViewModel.class);

        View root = inflater.inflate(R.layout.fragment_gallery, container, false);

        TabLayout myTabLayout=root.findViewById(R.id.tab_layout);
        myTabLayout.addTab(myTabLayout.newTab().setText("Arte"));
        myTabLayout.addTab(myTabLayout.newTab().setText("Deporte"));
        myTabLayout.addTab(myTabLayout.newTab().setText("Exi Acade"));
        myTabLayout.addTab(myTabLayout.newTab().setText("Otros"));
        myTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager=root.findViewById(R.id.pager);
        PageAdapter mypagAdapter=new PageAdapter(getFragmentManager(),myTabLayout.getTabCount());
        viewPager.setAdapter(mypagAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(myTabLayout));
        myTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return root;
    }
}