package com.example.anuraghole.sampleuidemo.modals;

import android.support.annotation.NonNull;

public class UserItem {
    private String name;
    private String date;
    private String urlProfileImage;
    private String urlPostedImage;
    private String description;

    public UserItem() {
    }

    public UserItem(String name, String date, String urlProfileImage, String urlPostedImage, String description) {
        this.name = name;
        this.date = date;
        this.urlProfileImage = urlProfileImage;
        this.urlPostedImage = urlPostedImage;
        this.description = description;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrlProfileImage() {
        return urlProfileImage;
    }

    public void setUrlProfileImage(String urlProfileImage) {
        this.urlProfileImage = urlProfileImage;
    }

    public String getUrlPostedImage() {
        return urlPostedImage;
    }

    public void setUrlPostedImage(String urlPostedImage) {
        this.urlPostedImage = urlPostedImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NonNull
    @Override
    public String toString() {
        return "UserItem{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", urlProfileImage='" + urlProfileImage + '\'' +
                ", urlPostedImage='" + urlPostedImage + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
