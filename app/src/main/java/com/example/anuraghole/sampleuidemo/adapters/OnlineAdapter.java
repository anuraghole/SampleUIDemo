package com.example.anuraghole.sampleuidemo.adapters;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.anuraghole.sampleuidemo.R;
import com.example.anuraghole.sampleuidemo.modals.UserItem;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class OnlineAdapter  extends RecyclerView.Adapter<OnlineAdapter.OnlineViewHolder> {


    private Context context;
    private ArrayList<UserItem> itemsList;

    public OnlineAdapter(Context context, ArrayList<UserItem> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public OnlineViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.rv_item_online,viewGroup,false);
        return new OnlineViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OnlineViewHolder holder, int position) {
        UserItem item=itemsList.get(position);
        holder.circleImageView.setImageURI(Uri.parse(item.getUrlProfileImage()));

    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    static class OnlineViewHolder extends RecyclerView.ViewHolder{

        CircleImageView circleImageView;
        public OnlineViewHolder(@NonNull View itemView) {
            super(itemView);
            circleImageView=itemView.findViewById(R.id.civImgProPicOnline);

        }
    }
}
