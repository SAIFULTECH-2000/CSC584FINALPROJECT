
package com.mvc.dao;

import Location.Hospital;
import com.mvc.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
     ps = conn.prepareStatement("INSERT INTO HOSPITAL (NAME_HOSPITAL,ADDRESS_HOSPITAL,PIC) values(?,?,?)");
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
    public boolean updateHospital(Hospital hospital,int ID_HOSPITAL){
    boolean status=false;
    Connection conn;
    PreparedStatement ps;
    int num;
    try{
   
     conn=DBConnection.createConnection();
     ps = conn.prepareStatement("UPDATE HOSPITAL SET NAME_HOSPITAL=?,ADDRESS_HOSPITAL=?,PIC=? where ID_HOSPITAL=?");
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
    public boolean deleteHospital(int ID){
     boolean status=false;
    Connection conn;
    PreparedStatement ps;
    int num;
    try{
    conn = DBConnection.createConnection();
    ps = conn.prepareStatement("DELETE FROM HOSPITAL WHERE ID_HOSPITAL=?");
    ps.setInt(1, ID);
    num=ps.executeUpdate();
    if(num==1)
        status=true;
    }catch(Exception e){
    e.printStackTrace();
    }
    return status;
    }
    public boolean checkHospital(String name_hospital){
    boolean status = false;
        Connection conn;
        PreparedStatement ps;
        try{
                conn=DBConnection.createConnection();
                ps = conn.prepareStatement("select * from HOSPITAL where NAME_HOSPITAL=? ");
                ps.setString(1, name_hospital);
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
