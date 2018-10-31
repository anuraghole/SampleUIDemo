package com.example.anuraghole.sampleuidemo.adapters;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.anuraghole.sampleuidemo.R;
import com.example.anuraghole.sampleuidemo.modals.UserItem;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecentActivityAdapter extends RecyclerView.Adapter<RecentActivityAdapter.RecentActivityViewHolder> {

    private Context context;
    private ArrayList<UserItem> itemList;

    public RecentActivityAdapter(Context context, ArrayList<UserItem> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public RecentActivityViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_item_recent_activity, viewGroup,false);
        return new RecentActivityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentActivityViewHolder holder, int position) {

        UserItem userItem = itemList.get(position);
        holder.tvDescription.setText(userItem.getDescription());
        holder.tvTime.setText(userItem.getDate());
        holder.userName.setText(userItem.getName());
        holder.civProfile.setImageURI(Uri.parse(userItem.getUrlProfileImage()));



    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    static class RecentActivityViewHolder extends RecyclerView.ViewHolder {

        CircleImageView civProfile;
        TextView userName,tvTime,tvDescription;
        public RecentActivityViewHolder(@NonNull View itemView) {
            super(itemView);
            civProfile=itemView.findViewById(R.id.proPicImage);
            userName=itemView.findViewById(R.id.userName);
            tvTime=itemView.findViewById(R.id.tvTime);
            tvDescription=itemView.findViewById(R.id.tvDescription);
        }
    }
}
