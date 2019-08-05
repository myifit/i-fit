package com.example.ifit.entity;

public class Video {
    private long id;
    private String name;
    private String intro;
    private long authorId;
    private long courseId;
    private int lik;
    private int unlike;
    private int difficulty;
    private int recommend;
    private String videopath;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public int getLike() {
        return lik;
    }

    public void setLike(int lik) {
        this.lik = lik;
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
        this.difficulty = difficulty;
    }

    public int getRecommend() {
        return recommend;
    }

    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }

    public String getVediopath() {
        return videopath;
    }

    public void setVediopath(String videopath) {
        this.videopath = videopath;
    }
}
