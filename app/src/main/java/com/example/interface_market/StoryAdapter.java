package com.example.interface_market;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryViewHolder> {

    List<StoryModel> list;

    public StoryAdapter(List<StoryModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public StoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.iteam_story,parent,false);
        return new StoryViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull StoryViewHolder holder, int position) {
        holder.story_Avatar.setImageResource(list.get(position).getPicture());
        if (!list.get(position).isHasStory()) {
            holder.mainMaterial.setStrokeWidth(1);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class StoryViewHolder extends  RecyclerView.ViewHolder {
        ImageView story_Avatar;
        MaterialCardView mainMaterial;

        public StoryViewHolder(@NonNull View itemView) {
            super(itemView);
            story_Avatar = itemView.findViewById(R.id.story_Avatar);
            mainMaterial = itemView.findViewById(R.id.mainMaterial);
        }
    }
}
