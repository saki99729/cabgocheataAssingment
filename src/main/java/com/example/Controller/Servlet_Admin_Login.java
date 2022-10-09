package com.example.Controller;

import com.example.Service.AdminService;
import com.example.model.Admin;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Servlet_Admin_Login", value = "/Servlet_Admin_Login")
public class Servlet_Admin_Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname =request.getParameter("uname");
                String pass=request.getParameter("pass");

        Admin admin = new Admin();
        admin.setUname(uname);
        admin.setPass(pass);

        AdminService service = new AdminService();
        System.out.println("---------------------------------------------------");
        System.out.println(admin.getUname() +"   "+admin.getPass());
        System.out.println("---------------------------------------------------");

        try {
           admin= service.loginAdmin(uname,pass);
           if(admin.getJrole().equals("cu"))
           {
               HttpSession session = request.getSession();
               session.putValue("uname",admin.getUname());
               session.putValue("name",admin.getName());
               session.putValue("tpnbr",admin.getTnbr());
               session.putValue("role",admin.getJrole());

               response.sendRedirect("CustomerDash.jsp");
           } else if (admin.getJrole().equals("Dr")) {
               HttpSession session = request.getSession();
               session.putValue("uname",admin.getUname());
               session.putValue("name",admin.getName());
               session.putValue("tpnbr",admin.getTnbr());
               session.putValue("lisence",admin.getLisence());
               session.putValue("role",admin.getJrole());
               response.sendRedirect("DriverDash.jsp");
               
           } else if (admin.getJrole().equals("Ad")) {
               HttpSession session = request.getSession();
               session.putValue("uname",admin.getUname());
               session.putValue("name",admin.getName());
               session.putValue("tpnbr",admin.getTnbr());
               session.putValue("role",admin.getJrole());

               response.sendRedirect("adminDash.jsp");
           }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
