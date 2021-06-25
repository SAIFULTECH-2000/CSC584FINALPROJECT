/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.dao;

import Person.Donator;
import Person.Submission;
import com.mvc.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author SAIFULTECH/syakir
 */
public class SubmissionDao {
    public boolean insertSubmission(Submission submission){
    boolean status=false;
    Connection conn;
    PreparedStatement ps;
    int num;
    try{
   
     conn=DBConnection.createConnection();
     ps = conn.prepareStatement("INSERT INTO SUBMISSION (personincas,quantity,hospitalcode,date) values(?,?,?,?)");
     ps.setString(1, submission.getPersonincas());
     ps.setString(2, submission.getQuantity());
     ps.setString(3, submission.getHospitalcode());
     ps.setString(4, submission.getDate());
     num =ps.executeUpdate();
     if(num==1)
        status=true;
    }catch(Exception e){
    e.printStackTrace();
    }
    return status;
    }
    public boolean updateSubmission(Submission submission,int ID){
    boolean status=false;
    Connection conn;
    PreparedStatement ps;
    int num;
    try{
   
     conn=DBConnection.createConnection();
     ps = conn.prepareStatement("UPDATE  SUBMISSION SET personincas=?,quantity=?,hospitalcode=?,date=? where ID=?");
     ps.setString(1, submission.getPersonincas());
     ps.setString(2, submission.getQuantity());
     ps.setString(3, submission.getHospitalcode());
     ps.setString(4, submission.getDate());
     ps.setInt(5, ID);
     num =ps.executeUpdate();
     if(num==1)
        status=true;
    }catch(Exception e){
    e.printStackTrace();
    }
    return status;
    }
    public boolean deleteSubmission(int ID){
     boolean status=false;
    Connection conn;
    PreparedStatement ps;
    int num;
    try{
    conn = DBConnection.createConnection();
    ps = conn.prepareStatement("DELETE FROM SUBMISSION WHERE ID=?");
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
