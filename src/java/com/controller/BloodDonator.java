/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.mvc.util.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SAIFULTECH
 */
public class BloodDonator extends HttpServlet {

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

        PrintWriter out = response.getWriter();
        int ID = Integer.parseInt( request.getParameter("ID"));
        if (insert(ID)) {
            request.setAttribute("name", getName(ID));
            RequestDispatcher view = request.getRequestDispatcher("SuccessfulDonation.jsp");
            view.forward(request, response);
        } else {
            RequestDispatcher view = request.getRequestDispatcher("blooddonation.jsp");
            view.forward(request, response);
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

    public boolean insert(int ID) {
        boolean status = false;
        Connection conn;
        PreparedStatement ps;
        int num;
        try {

            conn = DBConnection.createConnection();
            ps = conn.prepareStatement("INSERT INTO BLOOD_IN (ID_DONATION) values(?)");
            ps.setInt(1, ID);
            num = ps.executeUpdate();
            if (num == 1) {
                status = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
    
    public String getName(int ID) {
         String name="";
    try{
        Connection conn = DBConnection.createConnection();
        PreparedStatement ps = conn.prepareStatement("select * from DONATION where ID_DONATION=?");
         ps.setInt(1,ID);
         ResultSet rs =ps.executeQuery();
        while(rs.next()){
        name=rs.getString("NAME");
        }
    }catch(Exception ex)
    {
     ex.printStackTrace();
    }
    return name;
    }
}
