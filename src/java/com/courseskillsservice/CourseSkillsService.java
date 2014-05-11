package com.courseskillsservice;

import com.courseskillsservice.business.CourseSkillsServiceImpl;
import com.courseskillsservice.courseservice.NonexistentCourseException_Exception;
import com.courseskillsservice.dol.Skill;
import com.courseskillsservice.models.CourseSet;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bjw
 */
@WebService(serviceName = "CourseSkillsService")
public class CourseSkillsService {
    CourseSkillsServiceImpl impl;
    
    public CourseSkillsService() {
        this.impl = new CourseSkillsServiceImpl();
    }
    
    @WebMethod(operationName = "getCourseSkills")
    public List<Skill> getCourseSkills(
            @WebParam(name = "courseCode") String courseCode)
            throws NonexistentCourseException_Exception {
        return impl.getCourseSkills(courseCode);
    }
    
    @WebMethod(operationName = "recommendCourses")
    public List<CourseSet> recommendCourses(
            @WebParam(name = "skills") List<Skill> skills) {
        List<CourseSet> list = this.impl.recommendCourses(skills);
        System.out.println(list);
        return list;
    }
}
