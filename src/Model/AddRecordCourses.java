/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dilmini Tharuka
 */
public class AddRecordCourses {
     Statement stmt;

public void Form(String courseName, String teacher, String grade, String year) {
 try {
stmt = DBConnection.getStatementConnection();
stmt.executeUpdate
("INSERT INTO course VALUES('"+courseName+"', '"+teacher+"','"+grade+"', '"+year+"')");
 } catch (SQLException e) {
 e.printStackTrace();
 }

}
}

