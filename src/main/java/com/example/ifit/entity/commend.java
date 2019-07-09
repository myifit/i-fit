package com.example.ifit.entity;

public class commend {
    private long id;
    private long user_id;
    private long video_id;
    private String text;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getVideo_id() {
        return video_id;
    }

    public void setVideo_id(int video_id) {
        this.video_id = video_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getText() {return text;}

    public void setText(String text) {this.text=text;}
}
