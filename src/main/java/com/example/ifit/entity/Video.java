package com.example.ifit.entity;

public class Video {
    private long id;
    private String name;
    private String intro;
    private long authorId;
    private long courseId;
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

    public long getAuthor_Id() {
        return authorId;
    }

    public void setAuthor_Id(long authorId) {
        this.authorId = authorId;
    }

    public long getCourse_Id() {
        return courseId;
    }

    public void setCourse_Id(long courseId) {
        this.courseId = courseId;
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

    public String getName() {return  name;}

    public void setName(String name) {this.name=name;}

    public String getIntro() {return intro;}

    public void setIntro(String intro){this.intro=intro;}
}
