
package schoolsystem;

import java.sql.*;
import javax.swing.*;
public class connection {
    Connection conn = null;
    public static Connection connecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\YOGA\\Desktop\\java\\SchoolSystem\\schooldb1.db");
//            JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
