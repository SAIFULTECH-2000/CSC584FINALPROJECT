/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import Person.Donator;
import com.mvc.dao.DonatorDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SAIFULTECH
 */
public class DonationControl extends HttpServlet {

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
         try{
         List errorMsgs = new LinkedList();
       
        String gender = request.getParameter("gender");
        String name = request.getParameter("Name");
        String ic = request.getParameter("IC");
        String address = request.getParameter("address");
        String tel = request.getParameter("tel");
        String bloodtype = request.getParameter("bloodtype");
        String hh = request.getParameter("hh");
        HttpSession session=request.getSession();  
        int id =(Integer) session.getAttribute("ID");
        if (gender == null || name.length() == 0 || ic.length() == 0 || address.length() == 0 || tel.length() == 0 || bloodtype.length() == 0 ) {
            if (gender != null) {
                request.setAttribute("gender", gender);
            } else {
                errorMsgs.add("Please choose gender");
            }
            if(name.length()!=0){
                request.setAttribute("name", name);
            }else{
                errorMsgs.add("Please insert name");
            }
            if(ic.length()!=0){
                request.setAttribute("ic", ic);
            }else{
                errorMsgs.add("Please insert ic");
            }
            if(address.length()!=0){
                request.setAttribute("address", address);
            }else{
                errorMsgs.add("Please insert address");
            }
            if(tel.length()!=0){
             request.setAttribute("tel", tel);
            }else{
                errorMsgs.add("Please insert Phone");
            }
            if(bloodtype.length()!=0){
            request.setAttribute("bloodtype",bloodtype);
            }else{
                errorMsgs.add("Please insert bloodtype");
            }
            
             request.setAttribute("errorMsgs", errorMsgs);
             RequestDispatcher view = request.getRequestDispatcher("register_donation.jsp");
             view.forward(request, response);
        } else {
                //insert Donation
                Donator donator = new Donator(gender,name,ic,address,tel,bloodtype,hh); 
                DonatorDao dao = new DonatorDao();
                if(dao.insertDonator(donator,id )){
                RequestDispatcher view = request.getRequestDispatcher("donation_information.jsp");
                view.forward(request, response);
                }else{
                 errorMsgs.add("Please contact your developer");
                  PrintWriter out = response.getWriter();
                  out.println("Please contact your developer");
                }
                       
        }
       
       }catch(Exception e){
       
       
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
