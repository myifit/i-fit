package com.example.ifit.entity;

public class Plan {
    private long id;
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

    public void setVideo_id(int videoId) {
        this.videoId = videoId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(int user_id) {
        this.userId = userId;
    }


}
