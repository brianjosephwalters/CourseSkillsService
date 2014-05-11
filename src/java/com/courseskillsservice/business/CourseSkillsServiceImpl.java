/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.courseskillsservice.business;

import com.courseskillsservice.courseservice.Course;
import com.courseskillsservice.courseservice.NonexistentCourseException;
import com.courseskillsservice.courseservice.NonexistentCourseException_Exception;
import com.courseskillsservice.db.CourseSkillsDB;
import com.courseskillsservice.dol.NonexistentSkillException_Exception;
import com.courseskillsservice.dol.Skill;
import com.courseskillsservice.models.CourseSet;
import com.courseskillsservice.queries.SkillQueries;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bjw
 */
public class CourseSkillsServiceImpl {
    
    
    public List<Skill> getCourseSkills(String courseCode) 
            throws NonexistentCourseException_Exception {
        List<Skill> skills = new ArrayList<Skill>();
        SkillQueries queries = new SkillQueries(CourseSkillsDB.dbConnection());
        
        List<String> skillCodes = null;
        try {
            skillCodes = queries.getCourseSkillCodes(courseCode);
        } catch (SQLException e) {
            NonexistentCourseException exception = new NonexistentCourseException();
            exception.setCourseCode(courseCode);
            exception.setMessage("Course does not exist: " + courseCode);
            throw new NonexistentCourseException_Exception(
                    "Error from supporting service: CourseService",
                    exception);
        }
        
        for (String code : skillCodes) {
            try {
                Skill skill = getSkill(code);
                skills.add(skill);
            } catch (NonexistentSkillException_Exception e) {
                // Report error to current service.
                System.out.println(e.getMessage());
            }
        }
        return skills;
    }
    
    public List<CourseSet> recommendCourses(List<Skill> skills) {
        List<CourseSet> list = new ArrayList<CourseSet>();
        SkillQueries queries = new SkillQueries(CourseSkillsDB.dbConnection());
        List<List<String>> courseCodeSets = queries.getRecommendedCourses(skills);
        for (List<String> codeSet: courseCodeSets){
            CourseSet set = new CourseSet();
            for (String courseCode : codeSet) {
                if (courseCode != null && courseCode != "") {
                    Course course = null;
                    try {
                        course = getCourse(courseCode);
                    } catch (NonexistentCourseException_Exception e) {
                        course = new Course();
                        course.setCourseCode(courseCode);
                        course.setCourseTitle(e.getFaultInfo().getMessage());
                    }
                    set.addCourse(course);
                }
            }
            list.add(set);
        }
        return list;
    }

    private static Skill getSkill(java.lang.String skillID) throws NonexistentSkillException_Exception {
        com.courseskillsservice.dol.DOLService_Service service = new com.courseskillsservice.dol.DOLService_Service();
        com.courseskillsservice.dol.DOLService port = service.getDOLServicePort();
        return port.getSkill(skillID);
    }

    private static Course getCourse(java.lang.String courseID) throws NonexistentCourseException_Exception {
        com.courseskillsservice.courseservice.CourseService_Service service = new com.courseskillsservice.courseservice.CourseService_Service();
        com.courseskillsservice.courseservice.CourseService port = service.getCourseServicePort();
        return port.getCourse(courseID);
    }
    
    
}
