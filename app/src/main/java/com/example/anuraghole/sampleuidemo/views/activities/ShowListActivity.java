package com.example.anuraghole.sampleuidemo.views.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.anuraghole.sampleuidemo.R;
import com.example.anuraghole.sampleuidemo.views.fragments.FavouritesFragment;
import com.example.anuraghole.sampleuidemo.views.fragments.HomeFragment;
import com.example.anuraghole.sampleuidemo.views.fragments.InboxFragment;
import com.example.anuraghole.sampleuidemo.views.fragments.SearchFragment;

public class ShowListActivity extends AppCompatActivity {

    private FrameLayout mainContainer;
    private BottomNavigationView bottomNavigationView;

    private Fragment homeFragment, searchFragment, favouritesFragment, inboxFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list);
        init();
        initListeners();
        if (homeFragment != null)
            setFragment(new HomeFragment());

    }

    private void initListeners() {
        setBottomNavigation();
    }

    private void setBottomNavigation() {
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                disableAllMenuItems();
                menuItem.setChecked(true);
                switch (menuItem.getItemId())
                {
                    case R.id.action_home:
                        setFragment(homeFragment);
                        menuItem.setIcon(R.drawable.ic_home_active_black_24dp);
                        return true;

                    case R.id.action_search:
                        setFragment(searchFragment);
                        menuItem.setIcon(R.drawable.ic_search_active_black_24dp);

                        return true;
                    case R.id.action_favourites:
                        setFragment(favouritesFragment);
                        menuItem.setIcon(R.drawable.ic_favourite_active);
                        return true;

                    case R.id.action_inbox:
                        setFragment(inboxFragment);
                        menuItem.setIcon(R.drawable.ic_inbox_active);
                        return true;
                }
                return false;
            }
        });
    }

    private void disableAllMenuItems() {
        bottomNavigationView.getMenu().getItem(0).setIcon(R.drawable.ic_home_inactive_black_24dp);
        bottomNavigationView.getMenu().getItem(1).setIcon(R.drawable.ic_search_inactive_black_24dp);
        bottomNavigationView.getMenu().getItem(2).setIcon(R.drawable.ic_favourite_inactive);
        bottomNavigationView.getMenu().getItem(3).setIcon(R.drawable.ic_inbox_inactive);

    }

    private void bottomNavigationViewSelection(MenuItem menuItem, int itemId) {
        switch (itemId) {
            case R.id.action_home:
                if (menuItem.isChecked()) {
                    menuItem.setIcon(R.drawable.ic_home_active_black_24dp);
                } else {
                    menuItem.setIcon(R.drawable.ic_home_inactive_black_24dp);

                }
                break;

            case R.id.action_search:
                if (menuItem.isChecked()) {
                    menuItem.setIcon(R.drawable.ic_search_active_black_24dp);
                } else {
                    menuItem.setIcon(R.drawable.ic_search_inactive_black_24dp);

                }
                break;
            case R.id.action_favourites:
                if (menuItem.isChecked()) {
                    menuItem.setIcon(R.drawable.ic_favourite_active);
                } else {
                    menuItem.setIcon(R.drawable.ic_favourite_inactive);

                }
                break;
            case R.id.action_inbox:
                if (menuItem.isChecked()) {
                    menuItem.setIcon(R.drawable.ic_inbox_active);
                } else {
                    menuItem.setIcon(R.drawable.ic_inbox_inactive);

                }
                break;


        }


    }



    private void init() {
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        mainContainer = findViewById(R.id.container_main);

        homeFragment = new HomeFragment();
        searchFragment = new SearchFragment();
        favouritesFragment = new FavouritesFragment();
        inboxFragment = new InboxFragment();

    }

    protected void setFragment(Fragment fragment) {
        android.support.v4.app.FragmentTransaction t = getSupportFragmentManager().beginTransaction();
        t.replace(R.id.container_main, fragment);
        t.commit();
    }

}
