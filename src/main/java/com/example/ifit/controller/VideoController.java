package com.example.ifit.controller;

import com.example.ifit.entity.Video;
import com.example.ifit.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin
@RestController
@RequestMapping("/videos")
public class VideoController {
    @Autowired
    private VideoMapper videoMapper;

    @GetMapping("/listfindByAuthorId")
    @ResponseBody
    public List<Video> listfindByAuthorId(@RequestParam("Author_id") long author_id) {
        List<Video> videos = videoMapper.listfindByAuthorId(author_id);
        return videos;
    }

    @GetMapping("/listfindByVideoId")
    @ResponseBody
    public List<Video> listfindByVideoId(@RequestParam("Video_id") long video_id) {
        List<Video> videos = videoMapper.listfindByVideoId(video_id);
        return videos;
    }

    @PutMapping("/name/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> updatenameById(@PathVariable("id") long id, @RequestParam("Name") String name){
        return ResponseEntity.ok(videoMapper.updateNameById(name, id));
    }

    @PutMapping("/like/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> updatelikeById(@PathVariable("id") long id, @RequestParam("Like") int like){
        return ResponseEntity.ok(videoMapper.updateLikeById(like,id));
    }

    @PutMapping("/unlike/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> updateunlikeById(@PathVariable("id") long id, @RequestParam("Unlike") int unlike){
        return ResponseEntity.ok(videoMapper.updateUnlikeById(unlike, id));
    }

    @PutMapping("/recommend/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> updaterecommendById(@PathVariable("id") long id, @RequestParam("Recommend") int recommend){
        return ResponseEntity.ok(videoMapper.updateRecommendById(recommend, id));
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") long id){
        return ResponseEntity.ok(videoMapper.deleteById(id));
    }

    @PostMapping("/insert")
    @ResponseBody
        public ResponseEntity<Integer> addByVideo(@RequestParam("Name") String Name,@RequestParam("Intro") String intro,@RequestParam("Like") int like,@RequestParam("Unlike") int unlike,@RequestParam("Recommend") int recommend,@RequestParam("AuthorId") long authorid,@RequestParam("CourseId") long courseid,@RequestParam("Difficulty") int difficulty)
    {
        Video video=new Video();
        video.setAuthor_Id(authorid);
        video.setCourse_Id(courseid);
        video.setDifficulty(difficulty);
        video.setLike(like);
        video.setUnlike(unlike);
        video.setRecommend(recommend);

        return ResponseEntity.ok(videoMapper.insertVideo(video));
    }

}
