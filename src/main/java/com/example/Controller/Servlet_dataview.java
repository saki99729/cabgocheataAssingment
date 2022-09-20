package com.example.Controller;

import com.example.Service.BookingService;
import com.example.Service.viewAllservice;
import com.example.model.Admin;
import com.example.model.Booking;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "Servlet_dataview", value = "/Servlet_dataview")
public class Servlet_dataview extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String  action = request.getParameter("action");
if(action.equals("all"))
{
    getall(request,response);
}else if(action.equals("Dll")){
    getDriveAll(request,response);
}

    }

    private void getDriveAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        viewAllservice viewAllservice = new viewAllservice();
        try {
            List<Admin> Admin = viewAllservice.AdminDriver();
            request.setAttribute("bookingList",Admin);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        RequestDispatcher rd = request.getRequestDispatcher("DriverViewAll.jsp");
        rd.forward(request,response);
    }

    private void getall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        viewAllservice viewAllservice = new viewAllservice();
        try {
            List<Admin> Admin = viewAllservice.AdminAd();
            request.setAttribute("bookingList",Admin);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        RequestDispatcher rd = request.getRequestDispatcher("adminviewAll.jsp");
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
