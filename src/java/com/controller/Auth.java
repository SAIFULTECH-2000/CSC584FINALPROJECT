package com.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author saifultech
 */
public class Auth extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List errorMsgs = new LinkedList();
        
        try{
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(password.length() == 0 || username.length() == 0)
        {
           errorMsgs.add("Please insert username and password");
           request.setAttribute("errorMsgs", errorMsgs);
           RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
           view.forward(request, response);
        }
        else
        {
           if(login(username,password)){
           //successful login
           // out.println("successful login .");
            //Load the driver
           //set the session
            HttpSession session=request.getSession();  
            session.setAttribute("username",username);
            //redirect dashboard
            RequestDispatcher view = request.getRequestDispatcher("/Dashboard.jsp");
            view.forward(request, response);
            
           }else{
           errorMsgs.add("password or username not correct");
           request.setAttribute("errorMsgs", errorMsgs);
           RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
           view.forward(request, response);
           }
        }
        }catch(IOException e ){
            PrintWriter out = response.getWriter();
            out.println("error:"+e);
        errorMsgs.add("An unexpected error: " + e.getMessage());
       // request.setAttribute("errorMsgs", errorMsgs);
        //RequestDispatcher view = request.getRequestDispatcher("/error.view");
       // view.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    private boolean login(String username,String password){
     boolean status= false;
     try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/BloodManagement;create=true;user=root;password=root");
                PreparedStatement ps = conn.prepareStatement("select * from USERS where USERNAME=? and PASSWORD=?");
                ps.setString(1, username);
                ps.setString(2, password);
                ResultSet rs =ps.executeQuery();
                status = rs.next();   
            }catch(ClassNotFoundException | SQLException ex){
            }
     return status;
    }

}
