package com.example.interface_market;

public class StoryModel {
    int picture;
    boolean hasStory;

    public StoryModel(int picture, boolean hasStory) {
        this.picture = picture;
        this.hasStory = hasStory;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public boolean isHasStory() {
        return hasStory;
    }

    public void setHasStory(boolean hasStory) {
        this.hasStory = hasStory;
    }
}
