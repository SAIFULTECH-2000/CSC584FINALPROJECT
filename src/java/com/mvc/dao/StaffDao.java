
package com.mvc.dao;

import Person.Staff;
import com.mvc.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author SAIFULTECH/syakir
 */
public class StaffDao {
    public boolean insertStaff(Staff staff,String password){
    boolean status=false;
    Connection conn;
    PreparedStatement ps;
    int num;
    try{
   
     conn=DBConnection.createConnection();
     ps = conn.prepareStatement("INSERT INTO STAFF (NAME,USERNAME,PASSWORD,IC,POSITION,EMAIL,ID_ROLE) values(?,?,?,?,?,?,?)");
     ps.setString(1, staff.getName());
     ps.setString(2, staff.getUsername());
     ps.setString(3, password);
     ps.setString(4, staff.getIc());
     ps.setString(5, staff.getPosition());
     ps.setString(6, staff.getEmail());
     ps.setInt(7,staff.getRole());
  
     num =ps.executeUpdate();
     if(num==1)
        status=true;
    }catch(Exception e){
    e.printStackTrace();
    }
    return status;
    }
    public boolean updateStaff(Staff staff,int ID){
    boolean status=false;
    Connection conn;
    PreparedStatement ps;
    int num;
    try{
   
     conn=DBConnection.createConnection();
     ps = conn.prepareStatement("UPDATE  STAFF SET NAME=? ,IC=?,POSITION=?,EMAIL=? where ID_USER=?");
     ps.setString(1, staff.getName());
     ps.setString(2, staff.getIc());
     ps.setString(3, staff.getPosition());
     ps.setString(4, staff.getEmail());
     ps.setInt(5, ID);
     num =ps.executeUpdate();
     if(num==1)
        status=true;
    }catch(Exception e){
    e.printStackTrace();
    }
    return status;
    }
    public boolean deleteStaff(int ID){
     boolean status=false;
    Connection conn;
    PreparedStatement ps;
    int num;
    try{
    conn = DBConnection.createConnection();
    ps = conn.prepareStatement("DELETE FROM STAFF WHERE ID_USER=?");
    ps.setInt(1, ID);
    num=ps.executeUpdate();
    if(num==1)
        status=true;
    }catch(Exception e){
    e.printStackTrace();
    }
    return status;
    }
    public boolean checkusername(String username){
    boolean status = false;
        Connection conn;
        PreparedStatement ps;
        try{
                conn=DBConnection.createConnection();
                ps = conn.prepareStatement("select * from STAFF where USERNAME=? ");
                ps.setString(1, username);
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
