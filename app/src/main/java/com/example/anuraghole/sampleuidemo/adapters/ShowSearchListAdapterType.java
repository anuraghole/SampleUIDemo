package com.example.anuraghole.sampleuidemo.adapters;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.anuraghole.sampleuidemo.R;
import com.example.anuraghole.sampleuidemo.modals.UserItem;

import java.util.ArrayList;

public class ShowSearchListAdapterType extends RecyclerView.Adapter<ShowSearchListAdapterType.SearchTypeViewHolder> {
    private Context context;
    private ArrayList<UserItem> itemList;

    public ShowSearchListAdapterType(Context context, ArrayList<UserItem> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public SearchTypeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_item_show_search_list_type, viewGroup, false);
        return new SearchTypeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchTypeViewHolder holder, final int position) {
        final UserItem userItem=itemList.get(position);
        holder.ivItemType.setImageURI(Uri.parse(userItem.getUrlPostedImage()));
        holder.tvItemType.setText(userItem.getName());
        holder.itemType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, userItem.getName()+" "+position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    static class SearchTypeViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout itemType;
        ImageView ivItemType;
        TextView tvItemType;
        public SearchTypeViewHolder(@NonNull View itemView) {
            super(itemView);
            init(itemView);
        }
        private void init(View itemView) {
            itemType=itemView.findViewById(R.id.itemType);
            tvItemType=itemView.findViewById(R.id.tvItemType);
            ivItemType=itemView.findViewById(R.id.ivItemType);
        }
    }
}
