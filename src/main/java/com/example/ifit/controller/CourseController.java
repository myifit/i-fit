package com.example.ifit.controller;

import com.example.ifit.entity.Course;
import com.example.ifit.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping("")
    public List<Course> findAllCourse(){return courseService.findAllCourse();}

    @PostMapping("/insertCourse")
    public boolean insertCourse(@RequestParam("name") String name){return courseService.insertCourse(name);}

    @GetMapping("findCourseByName")
    public List<Course> findCourseById(@RequestParam("name") String name){
        return courseService.findCourseByName(name);
    }

    @GetMapping("deleteCourse")
    public boolean deleteCourse(@RequestParam("id") Long id){
        return courseService.deleteCourse(id);
    }
}
