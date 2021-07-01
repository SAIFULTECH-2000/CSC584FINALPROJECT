/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import Location.Hospital;
import com.mvc.dao.HospitalDao;
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
 * @author SAIFULTECH
 */
@WebServlet(name = "HospitalControl", urlPatterns = {"/HospitalControl"})
public class HospitalControl extends HttpServlet {

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
            String name_hospital = request.getParameter("name_hospital");
            String address_hospital = request.getParameter("address_hospital");
            String pic = request.getParameter("pic");
            String id_hospital = request.getParameter("id_hospital");
            HospitalDao hospitalDao = new HospitalDao();
            Hospital hospital = new Hospital();
            String method = request.getParameter("method");
            
            if (id_hospital == null) {
                if (name_hospital.length() == 0 || name_hospital.length() == 0 || address_hospital.length() == 0 || pic.length() == 0) {
                    if (name_hospital.length() != 0) {
                        request.setAttribute("name_hospital", name_hospital);
                    } else {
                        errorMsgs.add("Please insert Hospital Name");
                    }
                    if (address_hospital.length() != 0) {
                        request.setAttribute("address_hospital", address_hospital);
                    } else {
                        errorMsgs.add("Please insert Hospital Address");
                    }
                    if (pic.length() == 0) {
                        errorMsgs.add("Please insert Person In Charge(PIC)");
                    }
                    
                    errorMsgs.add("Please insert all details");
                    request.setAttribute("errorMsgs", errorMsgs);
                    RequestDispatcher view = request.getRequestDispatcher("RegisterStaff.jsp");
                    view.forward(request, response);
                } else {
                    //insert
                    if (hospitalDao.insertHospital(hospital)) {
                        errorMsgs.add("username is take please try again");
                        request.setAttribute("name_hospital", name_hospital);
                        request.setAttribute("address_hospital", address_hospital);
                        request.setAttribute("pic", pic);
                        request.setAttribute("errorMsgs", errorMsgs);
                        RequestDispatcher view = request.getRequestDispatcher("RegisterHospital.jsp");
                        view.forward(request, response);
                    } else {
                        //insert method here
                        hospital = new Hospital(name_hospital, address_hospital, pic);
                        if (hospitalDao.insertHospital(hospital)) {
                            request.setAttribute("hospital", hospital);
                            RequestDispatcher view = request.getRequestDispatcher("SuccessfulHospital.jsp");
                            view.forward(request, response);
                        } else {
                            errorMsgs.add("Please contact Developer");
                            request.setAttribute("errorMsgs", errorMsgs);
                            RequestDispatcher view = request.getRequestDispatcher("RegisterHospital.jsp");
                            view.forward(request, response);
                        }
                    }
                }
            }else{
             if (method.equals("delete")){
             //delete
             if(hospitalDao.deleteHospital(Integer.parseInt(id_hospital))){
              HttpSession session=request.getSession();  
              session.setAttribute("md","delete");
              session.setAttribute("mdname",name_hospital);
              request.getRequestDispatcher("Hospital.jsp").forward(request, response);
             }else{
              RequestDispatcher view = request.getRequestDispatcher("Hospital.jsp");
              view.forward(request, response);
             }
             
             }else if(method.equals("update")){
                hospital = new Hospital(name_hospital, address_hospital, pic);
                if(hospitalDao.updateHospital(hospital,Integer.parseInt(id_hospital))){
                    HttpSession session=request.getSession();  
 
                 session.setAttribute("md","update");
              session.setAttribute("mdname",name_hospital);
              RequestDispatcher view = request.getRequestDispatcher("Hospital.jsp");
              view.forward(request, response);
                }else{
                RequestDispatcher view = request.getRequestDispatcher("Hospital.jsp");
                view.forward(request, response);
                }
             }
            }

        } catch (Exception e) {
            e.printStackTrace();
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
