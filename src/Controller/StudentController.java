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
public class StudentController {
    public static void Form(String name, String address, String gender, String age) {
        new Model.AddRecord().Form(name, address, gender, age);
 JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull",
         JOptionPane.INFORMATION_MESSAGE);
}
}

