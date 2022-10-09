package com.example.Controller;

import com.example.Service.BookingService;
import com.example.model.Booking;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "Servlet_booking", value = {"/Servlet_booking","/addbooking","/deletebooking","/updatebooking"})
public class Servlet_booking extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action.equals("call"))
        {
            Cgetall(request,response);
        } else if (action.equals("gell")) {
            Dgetall(request,response);
        }
    }

    private void Dgetall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String cname=session.getValue("name").toString();
        Booking booking = new Booking();
        booking.setCname(cname);
        BookingService service = new BookingService();
        System.out.println(booking.getCname());
        try {
            List<Booking>bookings = service.bookingsList(booking);
            if(bookings.isEmpty())
            {
                System.out.println("No Records founds");
            }else {
                request.setAttribute("bookingList",bookings);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        RequestDispatcher rd = request.getRequestDispatcher("BookingDriver.jsp");
        rd.forward(request,response);
    }

    private void Cgetall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        String cname=session.getValue("name").toString();
        Booking booking = new Booking();
        booking.setCname(cname);
        BookingService service = new BookingService();
        System.out.println(booking.getCname());
        try {
            List<Booking>bookings = service.bookingsList(booking);
            if(bookings.isEmpty())
            {
                System.out.println("No Records founds");
            }else {
                request.setAttribute("bookingList",bookings);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        RequestDispatcher rd = request.getRequestDispatcher("cusBookView.jsp");
        rd.forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   String action = request.getParameter("action");
        if(action.equals("cbook"))
        {
            regbook(request,response);
        }else if(action.equals("dview"))
        {
                delbook(request,response);
        } else if (action.equals("update")) {
        updatBooking(request,response);
        }

    }

    private void updatBooking(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message="";
        Booking booking = new Booking();
        booking.setDname(request.getParameter("dname"));
        booking.setDnbr(request.getParameter("dpnbr"));
        booking.setAmount(Double.parseDouble(request.getParameter("amount")));
        booking.setTo(request.getParameter("cto"));
        booking.setFrom(request.getParameter("cfrom"));
        booking.setCpnber(request.getParameter("cnbr"));
        booking.setCname(request.getParameter("cname"));
        booking.setId(Integer.parseInt(request.getParameter("id")));

        BookingService service = new BookingService();
        try {
            boolean result =service.updateBooking(booking);
            if(result)
            {
                message = " record deleted";
            }
            else {
                message="somthing wrong";
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        request.setAttribute("message",message);
        RequestDispatcher rd =request.getRequestDispatcher("updateDriverBooking.jsp");
        rd.forward(request,response);
    }

    private void delbook(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String message="";
         int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);

        BookingService service = new BookingService();
        try {
            boolean result = service.deleteBook(id);
            if(result)
            {
                message = " record deleted";
            }
            else {
                message="somthing wrong";
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        HttpSession session = request.getSession();
        session.setAttribute("message",message);
        response.sendRedirect("/demo_war_exploded/Servlet_booking?action=call");

    }

    private void regbook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message="";
        Booking booking = new Booking();
        booking.setCname(request.getParameter("name"));
        booking.setCpnber(request.getParameter("pnbr"));
        booking.setTo(request.getParameter("to"));
        booking.setFrom(request.getParameter("from"));

        BookingService service = new BookingService();
        System.out.println("-----------------data in new book------------------------------");
        System.out.println(booking.getCname()+" "+booking.getCpnber()+" "+booking.getTo()+" "+booking.getFrom());
        System.out.println("-----------------------------------------------");

        try {
            boolean result =service.RegisterBook(booking);
            if(result)
            {
                message="Booking Successfull";
            }else {
                message="Somthig wrong";
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        request.setAttribute("message",message);
        RequestDispatcher rd =request.getRequestDispatcher("NewBooking.jsp");
        rd.forward(request,response);
    }
}
