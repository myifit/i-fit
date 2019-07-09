package com.example.ifit.entity;

public class favorite {
    private long id;
    private String name;
    private long video_id;
    private long user_id;

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

    public String getName() {return name;}

    public void setName(String name) {this.name=name;}


}
