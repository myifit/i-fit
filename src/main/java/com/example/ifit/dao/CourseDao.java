package com.example.ifit.dao;

import com.example.ifit.entity.Course;
import com.example.ifit.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDao {
    @Autowired
    CourseMapper courseMapper;

    public List<Course> findAllCourse(){return courseMapper.findAllCourse();}

    public boolean insertCourse(Course course){return courseMapper.insertCourse(course);}

    public List<Course> findCourseByName(String name){return courseMapper.findCourseByName(name);}

    public boolean deleteCourse(Long id){return courseMapper.deleteCourse(id);}
}
