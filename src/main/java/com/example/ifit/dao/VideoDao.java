package com.example.ifit.dao;

import com.example.ifit.entity.Video;
import com.example.ifit.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class VideoDao {
    @Autowired
    VideoMapper videoMapper;
    public boolean uploadVideo(String name,String intro, Integer like, Integer unlike,
                               Integer recommend, Long authorid, Long courseId, Integer difficulty,String videoPath){
        Video video = new Video();
        video.setName(name);
        video.setIntro(intro);
        video.setLike(like);
        video.setUnlike(unlike);
        video.setRecommend(recommend);
        video.setAuthorId(authorid);
        video.setCourseId(courseId);
        video.setDifficulty(difficulty);
        video.setVediopath(videoPath);
        return videoMapper.insertVideo(video);
    }
}
