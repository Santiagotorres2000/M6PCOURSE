package com.storres.m5p.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.storres.m5p.model.Course;
@Service
public class CourseServiceimpl implements CourseService{

    private Map<Long, Course> courses;
    private AtomicLong consecutive;

    public CourseServiceimpl() {
        this.consecutive = new AtomicLong(1);
        this.courses = new HashMap<>();
    }



    @Override
    public Course createNewCourse(Course course) {
        Long id = consecutive.getAndIncrement();
        course.setId(id);
        courses.put(id, course);
        return course;
 
    }

    @Override
    public Collection<Course> getAllCourses() {
        return courses.values();
    }

    @Override
    public Course getById(Long id) {
        validateId(id);
        Course course = courses.get(id);
        return course;
    }

    @Override
    public Course upgradCourse(Long id, Course course) {
        validateId(id);
        var existing = courses.get(id);
        existing.setName(course.getName());
        existing.setDescription(course.getDescription());
        existing.setCodeCourse(course.getCodeCourse());
        existing.setCredits(course.getCredits());
        existing.setMaxCapacity(course.getMaxCapacity());
        existing.setState(course.getState());
        
        return existing;
    }

    @Override
    public void deletesCourse(Long id) {
        validateId(id);
        courses.remove(id);
    }

    public void validateId(Long id){
        if(id == null){
            throw new IllegalArgumentException("el campo id no puede estar vacio");
        }
        if (id < 0) {
            throw new IllegalArgumentException("el campo id no puede ser negativo");
            
        }
    }
    
}
