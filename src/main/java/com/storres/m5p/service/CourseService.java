package com.storres.m5p.service;

import java.util.Collection;

import com.storres.m5p.model.Course;

public interface CourseService {
    
    public Course createNewCourse(Course course);

    public Collection<Course> getAllCourses();

    public Course getById(Long id);

    public Course upgradCourse(Long id, Course course);

    public void deletesCourse(Long id);
}
