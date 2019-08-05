package com.example.ifit.mapper;

import com.example.ifit.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMapper {

    List<Course> findAllCourse();

    boolean insertCourse(Course course);

    List<Course> findCourseByName(String name);

    boolean deleteCourse(Long id);

}
