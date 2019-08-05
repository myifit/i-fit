package com.example.ifit.service;

import com.example.ifit.dao.CourseDao;
import com.example.ifit.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseDao courseDao;

    public List<Course> findAllCourse(){return courseDao.findAllCourse();}

    public boolean insertCourse(String name){
        Course course = new Course();
        course.setName(name);
        return courseDao.insertCourse(course);
    }

    public List<Course> findCourseByName(String name){return courseDao.findCourseByName(name);}

    public boolean deleteCourse(Long id){return courseDao.deleteCourse(id);}
}
