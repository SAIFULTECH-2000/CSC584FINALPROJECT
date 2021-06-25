package com.mvc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author: Syakir/saifultech
 */
public class DBConnection 
{
    public static Connection createConnection() throws SQLException
    {
        Connection conn = null;
        String url = "jdbc:derby://localhost:1527/BloodManagement";
        String username ="root";
        String password ="root";
        try
        {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        conn = DriverManager.getConnection(url, username, password);
        System.out.println("Printing connection object"+conn);
        } catch (Exception e)
        {
            e.printStackTrace();
            System.out.println(e);
        }
        return conn;
    }
}
