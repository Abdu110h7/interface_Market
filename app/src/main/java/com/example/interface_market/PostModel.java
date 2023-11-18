package com.example.interface_market;

public class PostModel {
    int avatar;
    String personName;
    String action_time;
    int like;
    int comment;
    int main_picture;
    boolean isLiked;

    public PostModel(int avatar, String personName, String action_time, int like, int comment, int main_picture, boolean isLiked) {
        this.avatar = avatar;
        this.personName = personName;
        this.action_time = action_time;
        this.like = like;
        this.comment = comment;
        this.main_picture = main_picture;
        this.isLiked = isLiked;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getAction_time() {
        return action_time;
    }

    public void setAction_time(String action_time) {
        this.action_time = action_time;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public int getMain_picture() {
        return main_picture;
    }

    public void setMain_picture(int main_picture) {
        this.main_picture = main_picture;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }
}
