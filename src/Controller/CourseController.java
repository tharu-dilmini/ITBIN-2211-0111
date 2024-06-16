/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Dilmini Tharuka
 */
public class CourseController {
    public static void Form(String courseName, String teacher, String grade, String year) {
        new Model.AddRecordCourses().Form(courseName, teacher, grade, year);
 JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull",
         JOptionPane.INFORMATION_MESSAGE);
}
}
