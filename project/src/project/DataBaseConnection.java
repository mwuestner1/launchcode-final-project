/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author mattw
 */
public class DataBaseConnection {
    Connection con;
    Statement st;
    public DataBaseConnection()
    {
        String s = "jdbc:sqlite:C:\\Users\\mattw\\OneDrive\\Documents\\EmployeeData.sqlite";
        try
        {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(s);
            st = con.createStatement();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "No connection");
        }
    }
}