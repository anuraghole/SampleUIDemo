package com.example.anuraghole.sampleuidemo.adapters;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.anuraghole.sampleuidemo.R;
import com.example.anuraghole.sampleuidemo.modals.UserItem;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ShowHomeListAdapter extends RecyclerView.Adapter<ShowHomeListAdapter.ShowListViewHolder> {

    private Context context;
    private ArrayList<UserItem> userItemsList;

    public ShowHomeListAdapter(Context context, ArrayList<UserItem> userItemsList) {
        this.context = context;
        this.userItemsList = userItemsList;
    }

    @NonNull
    @Override
    public ShowListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_item_pet, viewGroup, false);
        return new ShowListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShowListViewHolder holder, int position) {
        UserItem userItem=userItemsList.get(position);
        holder.tvDate.setText(userItem.getDate());
        holder.tvUserName.setText(userItem.getName());
        holder.tvDescription.setText(userItem.getDescription());

        holder.civImgProPic.setImageURI(Uri.parse(userItem.getUrlProfileImage()));
        holder.ivImage.setImageURI(Uri.parse(userItem.getUrlPostedImage()));
    }

    @Override
    public int getItemCount() {
        return userItemsList.size();
    }

    static class ShowListViewHolder extends RecyclerView.ViewHolder {
        CircleImageView civImgProPic, civProPicInComment;
        ImageView ivOption, ivImage, ivOpttionFavorite, ivOpttionComment, ivOpttionShare;
        TextView tvUserName, tvDate, tvComment, tvDescription;

        ShowListViewHolder(@NonNull View itemView) {
            super(itemView);
            civImgProPic = itemView.findViewById(R.id.civImgProPic);
            civProPicInComment = itemView.findViewById(R.id.civProPicInComment);

            ivOption = itemView.findViewById(R.id.ivOption);
            ivImage = itemView.findViewById(R.id.ivImage);
            ivOpttionFavorite = itemView.findViewById(R.id.ivOpttionFavorite);
            ivOpttionComment = itemView.findViewById(R.id.ivOpttionComment);
            ivOpttionShare = itemView.findViewById(R.id.ivOpttionShare);


            tvUserName = itemView.findViewById(R.id.tvUserName);
            tvDate = itemView.findViewById(R.id.tvDate);
            tvComment = itemView.findViewById(R.id.tvComment);
            tvDescription = itemView.findViewById(R.id.tvDescription);


        }
    }
}
