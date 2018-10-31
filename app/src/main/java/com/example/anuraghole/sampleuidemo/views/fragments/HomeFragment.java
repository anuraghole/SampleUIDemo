package com.example.anuraghole.sampleuidemo.views.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.anuraghole.sampleuidemo.R;
import com.example.anuraghole.sampleuidemo.adapters.ShowHomeListAdapter;
import com.example.anuraghole.sampleuidemo.modals.UserItem;
import com.example.anuraghole.sampleuidemo.utils.AppUtil;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */


public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private ShowHomeListAdapter adapter;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        init(view);

        return view;
    }

    private void init(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new ShowHomeListAdapter(getActivity(), prepareItemList());
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<UserItem> prepareItemList() {
        ArrayList<UserItem> items = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserItem item = new UserItem();
            item.setName("Beverly Bishop");
            item.setDate("22 Aug at 2:15pm");
            item.setDescription(getString(R.string.sample_desc));
            item.setUrlProfileImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.dog_image).toString());
            item.setUrlPostedImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.sample_dog).toString());

            items.add(item);
        }
        return items;
    }

}
