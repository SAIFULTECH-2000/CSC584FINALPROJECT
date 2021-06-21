package com.mvc.dao;

import Person.Staff;
import com.mvc.util.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author: Syakir
 */
public class AuthDao {
    
    public boolean auth(Staff staff,String password)
    {
        boolean status = false;
        Connection conn;
        PreparedStatement ps;
        
        String username;
        username = staff.getName();
        
        
        try{
                conn=DBConnection.createConnection();
                ps = conn.prepareStatement("select * from USERS where USERNAME=? and PASSWORD=?");
                ps.setString(1, username);
                ps.setString(2, password);
                ResultSet rs =ps.executeQuery();
                status = rs.next();
            }
        catch(Exception ex)
            {
                 ex.printStackTrace();
            }
        return status;
    }
    
}
