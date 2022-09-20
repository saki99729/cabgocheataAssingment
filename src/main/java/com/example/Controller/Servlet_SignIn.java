package com.example.Controller;

import com.example.Service.AdminService;
import com.example.Service.DriverService;
import com.example.Service.VehicleService;
import com.example.Service.customerService;
import com.example.model.Admin;
import com.example.model.Vehicle;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Servlet_SignIn", value = {"/Servlet_SignIn","/driver_SignIn","/registervehic","/admin"})
public class Servlet_SignIn extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
                if(action.equals("reg"))
                {
                    cusreg(request,response);
                }else if(action.equals("Dri")) {
                    Drv(request, response);
                } else if (action.equals("vehicle")) {
                    vehicle(request,response);
                } else if (action.equals("ad")) {
                    admin(request,response);
                }
    }

    private void admin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = "";
        Admin admin = new Admin();
        admin.setUname(request.getParameter("uname"));
        admin.setPass(request.getParameter("pass"));
        admin.setName(request.getParameter("name"));
        admin.setTnbr(request.getParameter("pnbr"));

        System.out.println(admin.getUname()+""+admin.getPass()+""+admin.getName()+""+admin.getTnbr() );

        AdminService service = new AdminService();

        boolean result = false;
        try {
            result = service.RegisterAdmin(admin);
            if(result)
            {
                message="Driver Registation successfull";
            }else {
                message="Driver Registation unsuccessfull";
            }
            request.setAttribute("message",message);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        RequestDispatcher rd = request.getRequestDispatcher("adminRegister.jsp");
        rd.forward(request,response);
    }

    private void vehicle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message="";
        Vehicle vehicle = new Vehicle();
        vehicle.setVetype(request.getParameter("vtype"));
        vehicle.setVnbr(request.getParameter("vnbr"));
        vehicle.setDname(request.getParameter("dname"));
        vehicle.setLicense(request.getParameter("license"));
        vehicle.setRegisterbranch(request.getParameter("branch"));

        System.out.println(vehicle.getVetype()+""+vehicle.getVnbr()+" "+vehicle.getDname()+" "+vehicle.getLicense()+" "+vehicle.getRegisterbranch());
        VehicleService service = new VehicleService();
        try {
            boolean result = service.regVehicle(vehicle);
            if(result)
            {
            message="adding successfull";
            }else {
                message="somthing wrongs";
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);

        }

        request.setAttribute("message",message);
        RequestDispatcher rd = request.getRequestDispatcher("newVehicle.jsp");
        rd.forward(request,response);
    }


    private void Drv(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = "";
        Admin admin = new Admin();
        admin.setUname(request.getParameter("uname"));
        admin.setPass(request.getParameter("pass"));
        admin.setName(request.getParameter("name"));
        admin.setTnbr(request.getParameter("pnbr"));
        admin.setLisence(request.getParameter("license"));

        System.out.println(admin.getUname()+""+admin.getPass()+""+admin.getName()+""+admin.getTnbr() );

            DriverService   service = new DriverService();

        boolean result = false;
        try {
            result = service.RegisterDriver(admin);
            if(result)
            {
                message="Driver Registation successfull";
            }else {
                message="Driver Registation unsuccessfull";
            }
            request.setAttribute("message",message);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        RequestDispatcher rd = request.getRequestDispatcher("newDriver.jsp");
        rd.forward(request,response);

    }

    private void cusreg(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = "";
        Admin admin = new Admin();
        admin.setUname(request.getParameter("uname"));
        admin.setPass(request.getParameter("pass"));
        admin.setName(request.getParameter("name"));
        admin.setTnbr(request.getParameter("pnbr"));

        System.out.println(admin.getUname()+""+admin.getPass()+""+admin.getName()+""+admin.getTnbr() );

        customerService  service = new customerService();

        boolean result = false;
        try {
            result = service.RegisterCustomer(admin);
            if(result)
            {
                message="Driver Registation successfull";
            }else {
                message="Driver Registation unsuccessfull";
            }
            request.setAttribute("message",message);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        RequestDispatcher rd = request.getRequestDispatcher("newCustomer.jsp");
        rd.forward(request,response);

    }
}
