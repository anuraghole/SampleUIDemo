package com.example.anuraghole.sampleuidemo.adapters;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.anuraghole.sampleuidemo.R;
import com.example.anuraghole.sampleuidemo.modals.UserItem;

import java.util.ArrayList;

public class ShowSearchListAdapterMain extends RecyclerView.Adapter<ShowSearchListAdapterMain.SearchListViewHolder> {

    Context context;
    ArrayList<UserItem> itemsList;

    public ShowSearchListAdapterMain(Context context, ArrayList<UserItem> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public SearchListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.rv_item_show_search_list_main,viewGroup,false);
        return new SearchListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchListViewHolder holder, int position) {
        final UserItem item=itemsList.get(position);

        holder.ivItemImg.setImageURI(Uri.parse(item.getUrlPostedImage()));
        holder.ivItemImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, item.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    static class SearchListViewHolder extends RecyclerView.ViewHolder{
        ImageView ivItemImg;
        SearchListViewHolder(@NonNull View itemView) {
            super(itemView);
            ivItemImg=itemView.findViewById(R.id.ivItemImg);
        }
    }
}
