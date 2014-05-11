/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.courseskillsservice.queries;

import com.courseskillsservice.db.CourseSkillsDB;
import com.courseskillsservice.dol.Skill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bjw
 */
public class SkillQueries {
    private Connection connection;
    
    public SkillQueries(Connection connection) {
        this.connection = connection;
    }
    
     public List<String> getCourseSkillCodes(String courseCode) 
            throws SQLException {
        List<String> list = new ArrayList<String>();
        PreparedStatement stmt = connection.prepareStatement(
            " SELECT skill_code " +
            " FROM course_skill" +
            " WHERE course_code = ?"
        );
        stmt.setString(1, courseCode);
        ResultSet results = stmt.executeQuery();
        
        while (results.next()) {
            list.add(results.getString("skill_code"));
        }
        return list;
    }
     
    public List<List<String>> getRecommendedCourses(List<Skill> skills) {
        List<List<String>> list = new ArrayList<List<String>>();
        try {
            this.connection.setAutoCommit(false);
            System.out.println("Dropping any residual tables");
            PreparedStatement dropTable = this.connection.prepareStatement(
                    " drop table skill_list "
            );
            dropTable.execute();
            
            System.out.println("Creating temporary table");
            PreparedStatement createTable = this.connection.prepareStatement(
                    " CREATE GLOBAL TEMPORARY TABLE skill_list (" +
                    " skill_code  varchar(25) ) ON COMMIT DELETE ROWS");
            createTable.execute();
            
            System.out.println("Adding data");
            PreparedStatement insertSkills = this.connection.prepareStatement(
                    " INSERT INTO skill_list VALUES (?)"
            );
            for (Skill skill : skills) {
                insertSkills.setString(1, skill.getSkillID());
                insertSkills.execute();
            }
           
            System.out.println("Getting results with the big query");
            ResultSet results = getLeastCoursesToCoverSkills();
            while (results.next()) {
                List<String> combo = new ArrayList<String>();
                String codeA = results.getString("A");
                String codeB = results.getString("B");
                String codeC = results.getString("C");
                if (codeA != null)
                    combo.add(codeA);
                if (codeB != null)
                    combo.add(codeB);
                if (codeC != null)
                    combo.add(codeC);
                list.add(combo);
            }
            this.connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                this.connection.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } 
        return list;
    }
    
    private ResultSet getLeastCoursesToCoverSkills() 
            throws SQLException {
        PreparedStatement stmt = connection.prepareStatement(
            " WITH  " + 
            " required_skills as ( " + 
            "   SELECT skill_code from skill_list ),  " + 
            " course_sets as ( " + 
            "   (SELECT course_code as A, null as B, null as C " + 
            "   FROM course_skill) " + 
            "   UNION " + 
            "   (SELECT A.course_code as A, B.course_code as B, null as C " + 
            "    FROM course_skill A, course_skill B " + 
            "    WHERE a.course_code < b.course_code) " + 
            "    UNION " + 
            "   (SELECT A.course_code as A, B.course_code as B, C.course_code as C " + 
            "    FROM course_skill A, course_skill B, course_skill C " + 
            "    WHERE a.course_code < b.course_code AND " + 
            "          b.course_code < c.course_code ) ), " + 
            " course_set_skills as ( " + 
            "   SELECT A, B, C, skill_code " + 
            "   FROM course_sets, course_skill " + 
            "   WHERE course_sets.A = course_skill.course_code OR " + 
            "         course_sets.B = course_skill.course_code OR " + 
            "         course_sets.C = course_skill.course_code), " + 
            " satisfying_sets as ( " + 
            "   SELECT *  " + 
            "   FROM ( " + 
            "       (SELECT A, B, C from course_set_skills) " + 
            "       MINUS " + 
            "       (SELECT A, B, C " + 
            "        FROM (  SELECT A, B, C, skill_code " + 
            "                FROM (SELECT A, B, C " + 
            "                      FROM course_set_skills), (SELECT * FROM required_skills) " + 
            "                MINUS " + 
            "                SELECT A, B, C, skill_code " + 
            "                FROM course_set_skills) ) ) ), " + 
            " sets_count as ( " + 
            " 					SELECT A, B, C, CASE " + 
            "                   WHEN B is null THEN 1 " + 
            "					WHEN C is null THEN 2 " + 
            "                   ELSE 3 " + 
            "                 END as num_courses " + 
            " FROM satisfying_sets ) " + 
            " SELECT * " + 
            " FROM sets_count WHERE num_courses = (SELECT min(num_courses) FROM sets_count) ",
            ResultSet.TYPE_SCROLL_SENSITIVE,
            ResultSet.CONCUR_UPDATABLE
        );
        ResultSet rset = stmt.executeQuery();
        return rset;
    }
    
    public static void main(String[] args) {
        Connection connection = CourseSkillsDB.dbConnection();
        SkillQueries queries = new SkillQueries(connection);
        List<Skill> skills = new ArrayList<Skill>();
        Skill skill1 = new Skill();
        skill1.setSkillID("1.A.1.a.2");
        skills.add(skill1);
        Skill skill2 = new Skill();
        skill2.setSkillID("3.B.1.c");
        skills.add(skill2);
        Skill skill3 = new Skill();
        skill3.setSkillID("1.A.1.a.4");
        skills.add(skill3);
        Skill skill4 = new Skill();
        skill4.setSkillID("3.B.1.d");
        skills.add(skill4);
        List<List<String>> results = queries.getRecommendedCourses(skills);
        System.out.println(results);
    }
}
