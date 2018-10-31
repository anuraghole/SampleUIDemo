package com.example.anuraghole.sampleuidemo.views.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.anuraghole.sampleuidemo.R;
import com.example.anuraghole.sampleuidemo.adapters.OnlineAdapter;
import com.example.anuraghole.sampleuidemo.adapters.RecentActivityAdapter;
import com.example.anuraghole.sampleuidemo.modals.UserItem;
import com.example.anuraghole.sampleuidemo.utils.AppUtil;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class InboxFragment extends Fragment {

    RecyclerView recyclerViewInbox,recyclerViewOnline;
    RecyclerView.LayoutManager layoutManagerVertical,layoutManagerHorizantal;
    RecentActivityAdapter adapterInbox;
    OnlineAdapter onlineAdapter;
    View view;

    public InboxFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_inbox, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        recyclerViewInbox=view.findViewById(R.id.recyclerViewInbox);
        recyclerViewOnline=view.findViewById(R.id.recyclerViewOnline);
        recyclerViewOnline.setHasFixedSize(true);
        recyclerViewInbox.setHasFixedSize(true);
        layoutManagerHorizantal=new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        layoutManagerVertical=new LinearLayoutManager(getActivity());
        recyclerViewOnline.setLayoutManager(layoutManagerHorizantal);
        recyclerViewInbox.setLayoutManager(layoutManagerVertical);
        adapterInbox=new RecentActivityAdapter(getActivity(),prepareItemList());
        onlineAdapter=new OnlineAdapter(getActivity(),prepareItemList());
        recyclerViewInbox.setAdapter(adapterInbox);
        recyclerViewOnline.setAdapter(onlineAdapter);
    }
    private ArrayList<UserItem> prepareItemList() {
        ArrayList<UserItem> items = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            UserItem item = new UserItem();
            item.setName("Beverly Bishop");
            item.setDate("1hr");
            item.setDescription(getString(R.string.sample_desc));
            //item.setUrlProfileImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.sample_dog).toString());
            if (i == 0 || i==10){
                item.setUrlProfileImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img1).toString());
            }
            if (i == 1 || i==11){
                item.setUrlProfileImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img2).toString());
            }
            if (i == 2 || i==12){
                item.setUrlProfileImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img3).toString());
            }
            if (i == 3|| i==13){
                item.setUrlProfileImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img4).toString());
            }
            if (i == 4|| i==14){
                item.setUrlProfileImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img5).toString());
            }
            if (i == 5|| i==15){
                item.setUrlProfileImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img6).toString());
            }
            if (i == 6|| i==16){
                item.setUrlProfileImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img7).toString());
            }
            if (i == 7|| i==17){
                item.setUrlProfileImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img8).toString());
            }
            if (i == 8|| i==18){
                item.setUrlProfileImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img9).toString());
            }
            if (i == 9|| i==19){
                item.setUrlProfileImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img10).toString());
            }
            items.add(item);
        }
        return items;
    }

}
