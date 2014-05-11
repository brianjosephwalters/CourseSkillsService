/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.courseskillsservice.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bjw
 */
public class CourseSkillsDB {
    //connection
    public static Connection dbConnection() {
        Connection conn = null;
        String url = "jdbc:oracle:thin:@dbsvcs.cs.uno.edu:1521:orcl";
        String driver = "oracle.jdbc.driver.OracleDriver";
        String userName = "bwalters"; 
        String password = "TZZQGkMQ";
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url,userName, password);
        } catch (ClassNotFoundException | 
                 InstantiationException | 
                 IllegalAccessException | 
                 SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
