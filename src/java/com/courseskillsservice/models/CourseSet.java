/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.courseskillsservice.models;

import com.courseskillsservice.courseservice.Course;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bjw
 */
public class CourseSet implements Serializable {
    private List<Course> courseList;
    public CourseSet() {
        courseList = new ArrayList<Course>();
    }
    
    public void addCourse(Course course) {
        this.courseList.add(course);
    }
    
    public List<Course> getCourseList() {
        return this.courseList;
    }
    
}
