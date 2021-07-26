package com.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mvc.dao.AuthDao;
import java.io.IOException;
import java.io.PrintWriter;
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
 * @author saifultech/syakir
 * Auth.java for handle login when user when to login into system
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
          List errorMsgs = new LinkedList();
        try{
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(password.length() != 0 || username.length() != 0)
        {
            AuthDao obj = new AuthDao();
           if(obj.auth(username,password)){
           //successful login
           //Load the session driver
            HttpSession session=request.getSession();  
            //set the session
            session.setAttribute("username",username);
            session.setAttribute("ID", obj.getID(username, password));
            session.setAttribute("role_id",obj.getRole_ID(username,password));
            //redirect dashboard
            RequestDispatcher view = request.getRequestDispatcher("/Dashboard.jsp");
            view.forward(request, response);
           }else{
           //unsuccess login
           errorMsgs.add("Password or Username not correct");
           request.setAttribute("errorMsgs", errorMsgs);
           RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
           view.forward(request, response);
           }
        }
        }catch(IOException e ){
            PrintWriter out = response.getWriter();
            out.println("error:"+e);
        }
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
