/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.dao;

import Person.Donator;
import com.mvc.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author SAIFULTECH/syakir
 */
public class DonatorDao {
    public boolean insertDonator(Donator donator){
    boolean status=false;
    Connection conn;
    PreparedStatement ps;
    int num;
    try{
   
     conn=DBConnection.createConnection();
     ps = conn.prepareStatement("INSERT INTO DONATOR (GENDER,NAME,IC,ADDRESS,PHONE,BLOODTYPE,HISTORY) values(?,?,?,?,?,?,?)");
     ps.setString(1, donator.getGender());
     ps.setString(2, donator.getName());
     ps.setString(3, donator.getIc());
     ps.setString(4, donator.getAddress());
     ps.setString(5, donator.getPhone());
     ps.setString(6,donator.getBloodtype());
     ps.setString(7,donator.getHistory());
     num =ps.executeUpdate();
     if(num==1)
        status=true;
    }catch(Exception e){
    e.printStackTrace();
    }
    return status;
    }
    public boolean updateDonator(Donator donator,int ID){
    boolean status=false;
    Connection conn;
    PreparedStatement ps;
    int num;
    try{
   
     conn=DBConnection.createConnection();
     ps = conn.prepareStatement("UPDATE  DONATOR SET GENDER=?,NAME=?,IC=?,ADDRESS=?,PHONE=?,BLOODTYPE=?,HISTORY=? where ID=?");
     ps.setString(1, donator.getGender());
     ps.setString(2, donator.getName());
     ps.setString(3, donator.getIc());
     ps.setString(4, donator.getAddress());
     ps.setString(5, donator.getPhone());
     ps.setString(6,donator.getBloodtype());
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
    public boolean deleteDonator(int ID){
     boolean status=false;
    Connection conn;
    PreparedStatement ps;
    int num;
    try{
    conn = DBConnection.createConnection();
    ps = conn.prepareStatement("DELETE FROM DONATOR WHERE ID=?");
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
