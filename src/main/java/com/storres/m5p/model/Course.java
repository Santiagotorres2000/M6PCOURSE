package com.storres.m5p.model;

public class Course {
    private Long id;
    private String name;
    private String codeCourse;
    private String description;
    private Integer credits;
    private Integer maxCapacity;
    private State state;

    public Course (){

    }

    public Course(String codeCourse, Integer credits, String description, Long id, Integer maxCapacity, String name, State state) {
        this.codeCourse = codeCourse;
        this.credits = credits;
        this.description = description;
        this.id = id;
        this.maxCapacity = maxCapacity;
        this.name = name;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeCourse() {
        return codeCourse;
    }

    public void setCodeCourse(String codeCourse) {
        this.codeCourse = codeCourse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }






}
