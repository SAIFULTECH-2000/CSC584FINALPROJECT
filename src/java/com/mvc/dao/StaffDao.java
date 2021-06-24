/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.dao;

import Person.Staff;
import com.mvc.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author SAIFULTECH
 */
public class StaffDao {
    public boolean insertStaff(Staff staff,String password){
    boolean status=false;
    Connection conn;
    PreparedStatement ps;
    int num;
    try{
   
     conn=DBConnection.createConnection();
     ps = conn.prepareStatement("INSERT INTO USERS (USERNAME,PASSWORD,IC,POSITION,EMAIL) values(?,?,?,?,?)");
     ps.setString(1, staff.getName());
     ps.setString(2, password);
     ps.setString(3, staff.getIc());
     ps.setString(4, staff.getPosition());
     ps.setString(5, staff.getEmail());
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
     ps = conn.prepareStatement("UPDATE  STAFF SET USERNAME=? ,IC=?,POSITION=?,EMAIL=? where ID=?");
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
    ps = conn.prepareStatement("DELETE FROM STAFF WHERE ID=?");
    ps.setInt(1, ID);
    num=ps.executeUpdate();
    if(num==1)
        status=true;
    }catch(Exception e){
    e.printStackTrace();
    }
    return status;
    }
}
