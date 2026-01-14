package com.storres.m5p.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.storres.m5p.model.Course;
import com.storres.m5p.service.CourseService;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public Course newCourse(@RequestBody Course course) {
        return courseService.createNewCourse(course);
    }

    @GetMapping
    public Collection<Course> listCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course courseByid(@PathVariable Long id) {
        return courseService.getById(id);
    }

    @PutMapping("/update/{id}")
    public Course updateOneCourse(@PathVariable Long id,@RequestBody Course course) {
        return courseService.upgradCourse(id, course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deletesCourse(id);
    }

}
