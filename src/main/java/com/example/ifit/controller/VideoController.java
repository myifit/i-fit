package com.example.ifit.controller;

import com.example.ifit.entity.Video;
import com.example.ifit.mapper.VideoMapper;
import com.example.ifit.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

//@CrossOrigin
@RestController
@RequestMapping("/videos")
public class VideoController {
    @Autowired
    private VideoMapper videoMapper;
    @Autowired
    VideoService videoService;

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
    public boolean addByVideo(HttpServletRequest request, @RequestParam("Name") String name, @RequestParam("Intro") String intro,
                                              @RequestParam("Like") Integer like, @RequestParam("Unlike") Integer unlike,
                                              @RequestParam("Recommend") Integer recommend, @RequestParam("AuthorId") Long authorId,
                                              @RequestParam("CourseId") Long courseId, @RequestParam("Difficulty") Integer difficulty, MultipartFile file)
    {
       return videoService.uploadVideo(request,name,intro,like,unlike,recommend,authorId,courseId,difficulty,request.getServletContext().getRealPath("/upload/video/"),file);
    }

}
