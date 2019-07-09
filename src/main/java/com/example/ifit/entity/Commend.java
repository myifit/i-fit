package com.example.ifit.entity;

public class Commend {
    private long id;
    private long userId;
    private long videoId;
    private String text;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getVideo_id() {
        return videoId;
    }

    public void setVideo_id(int videoId) {
        this.videoId = videoId;
    }

    public long getUser_id() {
        return userId;
    }

    public void setUser_id(int userId) {
        this.userId = userId;
    }

    public String getText() {return text;}

    public void setText(String text) {this.text=text;}
}
