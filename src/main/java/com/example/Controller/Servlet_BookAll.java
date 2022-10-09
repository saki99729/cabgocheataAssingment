package com.example.Controller;

import com.example.Service.BookingService;
import com.example.model.Booking;
import com.mysql.cj.protocol.x.XMessage;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "Servlet_BookAll", value = "/Servlet_BookAll")
public class Servlet_BookAll extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action.equals("all")) {
            getall(request, response);
        } else if (action.equals("allBook")) {
            getallBook(request,response);


        }else {
            getbook(request,response);
        }
    }
//update Booking
    private void getbook(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String message = "";
        int id =Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        Booking booking = new Booking();
        BookingService service = new BookingService();
        try {
            booking = service.getview(id);
            if(booking.getCname()==null)
            {
                message = "no any Records";
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        HttpSession session = request.getSession();
        session.putValue("cname",booking.getCname());
        session.putValue("cnbr",booking.getCpnber());
        session.putValue("cto",booking.getTo());
        session.putValue("cfrom",booking.getFrom());
        session.putValue("cid",booking.getId());
        response.sendRedirect("updateDriverBooking.jsp");

    }
//booking Driver
    private void getall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookingService service = new BookingService();
        try {
            List<Booking>bookings = service.bookingsListDriver();
            request.setAttribute("bookingList",bookings);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        RequestDispatcher rd = request.getRequestDispatcher("BookingDriver.jsp");
        RequestDispatcher Ad = request.getRequestDispatcher("AllBooking.jsp");
        rd.forward(request,response);
        Ad.forward(request,response);
    }

    private void getallBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookingService service = new BookingService();
        try {
            List<Booking>bookings = service.bookingsListDriver();
            request.setAttribute("bookingList",bookings);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        RequestDispatcher Ad = request.getRequestDispatcher("AllBooking.jsp");

        Ad.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
