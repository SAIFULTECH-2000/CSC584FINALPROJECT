/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.dao;

import Person.Donator;
import Person.Staff;
import com.mvc.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author SAIFULTECH/syakir
 */
public class DonatorDao {
    public boolean insertDonator(Donator donator,int ID){
    boolean status=false;
    Connection conn;
    PreparedStatement ps;
    int num;
    try{
   
     conn=DBConnection.createConnection();
     ps = conn.prepareStatement("INSERT INTO DONATION (TYPE_BLOOD,NAME,IC,GENDER,ADDRESS,PHONENUM,HEALTHHISTORY,ID_USER) values(?,?,?,?,?,?,?,?)");
     ps.setString(1, donator.getBloodtype());
     ps.setString(2, donator.getName());
     ps.setString(3, donator.getIc());
     ps.setString(4, donator.getGender());
     ps.setString(5, donator.getAddress());
     ps.setString(6, donator.getPhone());
     ps.setString(7,donator.getHistory());
     ps.setInt(8, ID);
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
