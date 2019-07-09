package com.example.ifit.entity;

public class Favorite {
    private long id;
    private String name;
    private long videoId;
    private long userId;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUser_id(int userId) {
        this.userId = userId;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name=name;}


}
