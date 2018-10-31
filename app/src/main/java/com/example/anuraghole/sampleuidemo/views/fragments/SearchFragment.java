package com.example.anuraghole.sampleuidemo.views.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.anuraghole.sampleuidemo.R;
import com.example.anuraghole.sampleuidemo.adapters.ShowSearchListAdapterMain;
import com.example.anuraghole.sampleuidemo.adapters.ShowSearchListAdapterType;
import com.example.anuraghole.sampleuidemo.modals.UserItem;
import com.example.anuraghole.sampleuidemo.utils.AppUtil;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {
    private RecyclerView recyclerViewMainList, recyclerViewTypes;
    private RecyclerView.LayoutManager layoutManagerMain, layoutManagerType;
    private ShowSearchListAdapterMain adapterMain;
    private ShowSearchListAdapterType adapterType;


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        setMainRecyclerView(view);
        setTypeRecyclerView(view);


    }

    private void setMainRecyclerView(View view) {
        recyclerViewMainList = view.findViewById(R.id.recyclerViewMainList);
        layoutManagerMain = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        ((StaggeredGridLayoutManager) layoutManagerMain).setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS);
        recyclerViewMainList.setHasFixedSize(true);
        recyclerViewMainList.setLayoutManager(layoutManagerMain);
        adapterMain = new ShowSearchListAdapterMain(getActivity(),prepareItemListMain());
        recyclerViewMainList.setAdapter(adapterMain);
    }

    private void setTypeRecyclerView(View view) {
        recyclerViewTypes = view.findViewById(R.id.recyclerViewTypes);
        layoutManagerType = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerViewTypes.setHasFixedSize(true);
        recyclerViewTypes.setLayoutManager(layoutManagerType);
        adapterType = new ShowSearchListAdapterType(getActivity(), prepareItemListType());
        recyclerViewTypes.setAdapter(adapterType);
    }

    private ArrayList<UserItem> prepareItemListType() {
        ArrayList<UserItem> items = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserItem item = new UserItem();
            item.setName("Type " + i);
            if (i % 2 == 0){
                item.setUrlPostedImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.sample_dog).toString());
            }else if (i % 3==2){
                item.setUrlPostedImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.fish_image).toString());

            }else {
                item.setUrlPostedImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.sample_dog2).toString());
            }

            items.add(item);
        }
        return items;
    }
    private ArrayList<UserItem> prepareItemListMain() {
        ArrayList<UserItem> items = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            UserItem item = new UserItem();
            item.setName("Type " + i);
            if (i == 0 || i==10){
                item.setUrlPostedImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img1).toString());
            }
            if (i == 1 || i==11){
                item.setUrlPostedImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img2).toString());
            }
            if (i == 2 || i==12){
                item.setUrlPostedImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img3).toString());
            }
            if (i == 3|| i==13){
                item.setUrlPostedImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img4).toString());
            }
            if (i == 4|| i==14){
                item.setUrlPostedImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img5).toString());
            }
            if (i == 5|| i==15){
                item.setUrlPostedImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img6).toString());
            }
            if (i == 6|| i==16){
                item.setUrlPostedImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img7).toString());
            }
            if (i == 7|| i==17){
                item.setUrlPostedImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img8).toString());
            }
            if (i == 8|| i==18){
                item.setUrlPostedImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img9).toString());
            }
            if (i == 9|| i==19){
                item.setUrlPostedImage(AppUtil.getUriToDrawable(getActivity(), R.drawable.img10).toString());
            }
            items.add(item);

        }
        return items;
    }
}
