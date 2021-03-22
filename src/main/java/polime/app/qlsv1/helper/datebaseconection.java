/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polime.app.qlsv1.helper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class datebaseconection {
    public static Connection openConnection() throws Exception{
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
        String connectionUrl = "jdbc:sqlserver://localhost;database=AppQL;" ; 
        String username="demo";
        String password="123";
        java.sql.Connection con = DriverManager.getConnection(connectionUrl,username,password);
        return con;
    }
}
