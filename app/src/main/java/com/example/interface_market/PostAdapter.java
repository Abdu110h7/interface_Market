package com.example.interface_market;

import android.animation.Animator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder>  {

    List<PostModel> list ;

    public PostAdapter(List<PostModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.like.setText(String.valueOf(list.get(position).getLike()));
        holder.comment.setText(String.valueOf(list.get(position).getComment()));
        holder.personName.setText(list.get(position).getPersonName());
        holder.actionTime.setText(list.get(position).getAction_time());
        holder.Image.setImageResource(list.get(position).getAvatar());
        holder.mainPicture.setImageResource(list.get(position).getMain_picture());
        holder.itemView.setOnClickListener(new DoubleClickHandler(new DoubleClickHandler.DoubleClickCallback() {
            @Override
            public void onDoubleClick() {

                if (list.get(holder.getAdapterPosition()).isLiked){
                    list.get(holder.getAdapterPosition()).setLike(list.get(holder.getAdapterPosition()).getLike() - 1);
                    holder.like.setText(String.valueOf(list.get(holder.getAdapterPosition()).getLike()));
                    holder.lottieAnimationView.pauseAnimation();
                    holder.imageLike.setImageResource(R.drawable.ic_heart);
                }else {
                    list.get(holder.getAdapterPosition()).setLike(list.get(holder.getAdapterPosition()).getLike() + 1);
                    holder.like.setText(String.valueOf(list.get(holder.getAdapterPosition()).getLike()));
                    holder.lottieAnimationView.setVisibility(View.VISIBLE);
                holder.lottieAnimationView.playAnimation();
                holder.lottieAnimationView.setSpeed(1.5f);
                holder.imageLike.setImageResource(R.drawable.heart);
                holder.lottieAnimationView.addAnimatorListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(@NonNull Animator animation) {
                    }

                    @Override
                    public void onAnimationEnd(@NonNull Animator animation) {
                        holder.lottieAnimationView.setVisibility(View.GONE);
                    }

                    @Override
                    public void onAnimationCancel(@NonNull Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(@NonNull Animator animation) {

                    }
                });
                }
                list.get(holder.getAdapterPosition()).setLiked(!list.get(holder.getAdapterPosition()).isLiked());

            }
        }));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PostViewHolder extends  RecyclerView.ViewHolder {

        CircleImageView Image;
        ImageView mainPicture;
        LottieAnimationView lottieAnimationView;
        TextView like, comment, personName, actionTime;
        ImageView imageLike;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            Image = itemView.findViewById(R.id.circleImageView);
            like = itemView.findViewById(R.id.like);
            comment = itemView.findViewById(R.id.comment);
            personName = itemView.findViewById(R.id.personName);
            actionTime = itemView.findViewById(R.id.actionTime);
            lottieAnimationView = itemView.findViewById(R.id.like_lottie);
            mainPicture = itemView.findViewById(R.id.main_Picture);
            imageLike = itemView.findViewById(R.id.image_like);

        }
    }
}
