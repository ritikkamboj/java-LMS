/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class dbconnect {
    
    public static Connection connect()
    {
            
            Connection con=null;
    try{
    
    
    Class.forName("com.mysql.jdbc.Driver");
   con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library?","root","");
    JOptionPane.showMessageDialog(null,"connection successful");
}
    catch(Exception e)
    {
        System.out.println("inter.DBConnect.connect");
        JOptionPane.showMessageDialog(null,e);
    }
        return con;
    
}
    
}
