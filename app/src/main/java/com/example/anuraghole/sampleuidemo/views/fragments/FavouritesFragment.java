package com.example.anuraghole.sampleuidemo.views.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.anuraghole.sampleuidemo.R;
import com.example.anuraghole.sampleuidemo.adapters.ViewPagerAdapter;

public class FavouritesFragment extends Fragment {
    private ViewPager viewPager;
    TabLayout tabLayout;
    View view;
    ViewPagerAdapter adapter;
    public FavouritesFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_favourites, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        viewPager=view.findViewById(R.id.viewPager);
        setupViewPager(viewPager);
        tabLayout=view.findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);


    }

    private void setupViewPager(ViewPager viewPager) {
        adapter = new ViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new RecentActivityYouFragment(), "You");
        adapter.addFragment(new RecentActivityOthersFragment(), "Others");
        viewPager.setAdapter(adapter);
    }


}
