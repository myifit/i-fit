package com.example.ifit.entity;

public class Video {
    private long id;
    private String name;
    private String intro;
    private long author_id;
    private long course_id;
    private int like;
    private int unlike;
    private int difficulty;
    private int recommend;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getUnlike() {
        return unlike;
    }

    public void setUnlike(int unlike) {
        this.unlike = unlike;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty= difficulty;
    }

    public int getRecommend() {
        return recommend;
    }

    public void setRecommend(int recommend) {
        this.recommend= recommend;
    }
}
