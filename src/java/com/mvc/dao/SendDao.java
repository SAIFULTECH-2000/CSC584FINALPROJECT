
package com.mvc.dao;
import Location.Send;
import com.mvc.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Syakir
 */
public class SendDao {
    public boolean insertBlood(Send send){
    boolean status=false;
    Connection conn;
    PreparedStatement ps;
    int num;
    try
    {
     conn=DBConnection.createConnection();
     ps = conn.prepareStatement("INSERT INTO BLOOD_OUT (TYPE_BLOOD,QUANTITY) values(?,?)");
     ps.setInt(1, send.getId_hospital());
     ps.setInt(2, send.getQuantity());
     ps.setString(3, send.getBloodtype());
  
     num =ps.executeUpdate();
     if(num==1)
        status=true;
    }catch(Exception e){
    e.printStackTrace();
    }
        return status;
    }
}
