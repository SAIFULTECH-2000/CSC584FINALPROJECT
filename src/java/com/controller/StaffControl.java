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
import javax.servlet.http.HttpSession;

/**
 *
 * @author SAIFULTECH StaffControl for handle insert, update, and delete
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        List errorMsgs = new LinkedList();
        try {
            String username = request.getParameter("username");
            String name = request.getParameter("name");
            String password = request.getParameter("pass");
            String ic = request.getParameter("IC");
            String position = request.getParameter("position");
            String email = request.getParameter("email");
            String id = request.getParameter("ID");
            String role = request.getParameter("role");
            StaffDao staffDao = new StaffDao();
            String method = request.getParameter("method");
            if (id == null) {
                //Insert 
                if (username.length() != 0 || name.length() != 0 || password.length() != 0 || ic.length() != 0 || position.length() != 0 || email.length() != 0) {
                    //check username valid or not
                    if (staffDao.checkusername(username)) {
                        errorMsgs.add("username is take please try again");
                        request.setAttribute("name", name);
                        request.setAttribute("ic", ic);
                        request.setAttribute("position", position);
                        request.setAttribute("email", email);
                        request.setAttribute("role", role);
                        request.setAttribute("errorMsgs", errorMsgs);
                        //redirect back to registerstaff page
                        RequestDispatcher view = request.getRequestDispatcher("RegisterStaff.jsp");
                        view.forward(request, response);
                    } else {
                        Staff staff = new Staff(username, name, email, ic, position, Integer.parseInt(role));
                        if (staffDao.insertStaff(staff, password)) {
                            //Sucessful to insert
                            request.setAttribute("staff", staff);
                            RequestDispatcher view = request.getRequestDispatcher("SuccessfulStaff.jsp");
                            view.forward(request, response);
                        } else {
                            //The system can't insert when have something mistake at database.
                            errorMsgs.add("Please contact Developer");
                            request.setAttribute("errorMsgs", errorMsgs);
                            RequestDispatcher view = request.getRequestDispatcher("RegisterStaff.jsp");
                            view.forward(request, response);
                        }
                    }
                }
            } else {
                if (method.equals("delete")) {
                    //At form will send method.When method delete the system will carry id and delete
                    if (staffDao.deleteStaff(Integer.parseInt(id))) {
                        HttpSession session = request.getSession();
                        session.setAttribute("md", "delete");
                        session.setAttribute("mdname", name);
                        request.getRequestDispatcher("ViewStaff.jsp").forward(request, response);
                    } else {
                        RequestDispatcher view = request.getRequestDispatcher("ViewStaff.jsp");
                        view.forward(request, response);
                    }
                }
                if (method.equals("update")) {
                    //At form will send method when method is update the system will carry data when to update .
                    Staff staff = new Staff();
                    staff.setName(name);
                    staff.setEmail(email);
                    staff.setIc(ic);
                    staff.setPosition(position);
                    if (staffDao.updateStaff(staff, Integer.parseInt(id))) {
                        HttpSession session = request.getSession();
                        session.setAttribute("md", "update");
                        session.setAttribute("mdname", name);
                        request.getRequestDispatcher("ViewStaff.jsp").forward(request, response);
                    } else {
                        request.getRequestDispatcher("ViewStaff.jsp").forward(request, response);
                    }
                }
            }
        } catch (Exception e) {
            out.println("error:" + e);
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
