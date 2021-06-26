package com.mvc.dao;

import com.mvc.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author: Syakir/saifultech
 */
public class AuthDao {
    
    public boolean auth(String username,String password)
    {
        boolean status = false;
        Connection conn;
        PreparedStatement ps;
        try{
                conn=DBConnection.createConnection();
                ps = conn.prepareStatement("select * from STAFF where USERNAME=? and PASSWORD=?");
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
    public int getID(String username,String password){
    int id=0;
    try{
        Connection conn = DBConnection.createConnection();
        PreparedStatement ps = conn.prepareStatement("select * from STAFF where USERNAME=? and PASSWORD=?");
         ps.setString(1, username);
         ps.setString(2, password);
         ResultSet rs =ps.executeQuery();
        while(rs.next()){
        id=rs.getInt("ID_USER");
        }
    }catch(Exception ex)
    {
     ex.printStackTrace();
    }
    return id;
    }

    public int getRole_ID(String username, String password) {
         int role_id=0;
    try{
        Connection conn = DBConnection.createConnection();
        PreparedStatement ps = conn.prepareStatement("select * from STAFF where USERNAME=? and PASSWORD=?");
         ps.setString(1, username);
         ps.setString(2, password);
         ResultSet rs =ps.executeQuery();
        while(rs.next()){
        role_id=rs.getInt("ID_ROLE");
        }
    }catch(Exception ex)
    {
     ex.printStackTrace();
    }
    return role_id;
    }
}
