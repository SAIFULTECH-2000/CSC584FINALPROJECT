/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import Person.Staff;
import com.mvc.dao.StaffDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SAIFULTECH
 */
@WebServlet(name = "StaffControl", urlPatterns = {"/StaffControl"})
public class StaffControl extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
           PrintWriter out = response.getWriter();
      List errorMsgs = new LinkedList();
      try{
      String username = request.getParameter("username");
      String password = request.getParameter("password");
      String ic = request.getParameter("ic");
      String position = request.getParameter("position");
      String  email = request.getParameter("email");
      String id = request.getParameter("ID");
      StaffDao staffDao = new StaffDao();
      if(id!=null){
       if( ic!=null||position!=null||email!=null){   
        Staff staff = new Staff(username,email,ic,position);
        if(staffDao.updateStaff(staff, Integer.parseInt(id))){
        request.removeAttribute("username");
        request.setAttribute("update", "update");
        RequestDispatcher view = request.getRequestDispatcher("ViewStaff.jsp");
        view.forward(request, response);
        }else{
        out.println("gagal update");
        }
       
       }else{
       if(staffDao.deleteStaff(Integer.parseInt(id))){
      request.setAttribute("name",username);
      RequestDispatcher view = request.getRequestDispatcher("ViewStaff.jsp");
      view.forward(request, response);
      }else{
      //error delete
      }
       }    
      
       
      }
    
      
      if(username.length()==0 || password.length()==0 || ic.length()==0||position.length()==0||email.length()==0){   
      errorMsgs.add("Please insert all details");
      request.setAttribute("errorMsgs", errorMsgs);
      RequestDispatcher view = request.getRequestDispatcher("RegisterStaff.jsp");
      view.forward(request, response);
      }else{   
      Staff staff = new Staff(username,email,ic,position);
      if(staffDao.insertStaff(staff, password)){
        request.setAttribute("staff", staff);
        RequestDispatcher view = request.getRequestDispatcher("SuccessfulStaff.jsp");
        view.forward(request, response);
      }else{
      //Error
      }
      
      }
      
      
   
      }catch(Exception e){
      e.printStackTrace();
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

}
