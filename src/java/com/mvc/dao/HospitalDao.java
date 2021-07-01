/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.dao;

import Location.Hospital;
import com.mvc.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author SAIFULTECH/syakir
 */
public class HospitalDao {
     public boolean insertHospital(Hospital hospital){
    boolean status=false;
    Connection conn;
    PreparedStatement ps;
    int num;
    try{
   
     conn=DBConnection.createConnection();
     ps = conn.prepareStatement("INSERT INTO HOSPITAL (NAME,ADDRESS,PIC) values(?,?,?)");
     ps.setString(1, hospital.getName());
     ps.setString(2, hospital.getAddress());
     ps.setString(3, hospital.getPIC());
     num =ps.executeUpdate();
     if(num==1)
        status=true;
    }catch(Exception e){
    e.printStackTrace();
    }
    return status;
    }
    public boolean updateHospital(Hospital hospital,int ID){
    boolean status=false;
    Connection conn;
    PreparedStatement ps;
    int num;
    try{
   
     conn=DBConnection.createConnection();
     ps = conn.prepareStatement("UPDATE  HOSPITAL SET NAME=?,ADDRESS=?,PIC=? where ID=?");
     ps.setString(1, hospital.getName());
     ps.setString(2, hospital.getAddress());
     ps.setString(3, hospital.getPIC());
     ps.setInt(5, ID);
     num =ps.executeUpdate();
     if(num==1)
        status=true;
    }catch(Exception e){
    e.printStackTrace();
    }
    return status;
    }
    public boolean deleteHospital(int ID){
     boolean status=false;
    Connection conn;
    PreparedStatement ps;
    int num;
    try{
    conn = DBConnection.createConnection();
    ps = conn.prepareStatement("DELETE FROM HOSPITAL WHERE ID=?");
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
