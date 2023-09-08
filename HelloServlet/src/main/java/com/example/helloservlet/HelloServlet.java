package com.example.helloservlet;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<table>");
        out.println("<tr><th>" + "Number" + "<th/>");
        out.println("<th>" + "Factorial" + "<th/><tr/>");
        for(int i = 0 ; i <= 10 ; i++) {
            int returnValue = 1 ;
            for(int j = 1 ; j <= i ; j++) {
                returnValue*=j;
            }
            out.println("<tr><td>" + i + "<td/>");
            out.println("<td>" + returnValue + "<td/><tr/>");
        }
        out.println("<table>");

//        int num1 = Integer.parseInt(request.getParameter("num1"));
//        int num2 = Integer.parseInt(request.getParameter("num2"));
//        int result = num1 * num2 ;
//        request.setAttribute("result", result);
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/sqr-servlet");
//
//        // Hello
////        PrintWriter out = response.getWriter();
////        out.println("<html><body>");
////        out.println("<h1>" + message + "</h1>");
////        out.println("<h1>" + " The result is : " + result + "</h1>");
////        out.println("</body></html>");
    }

}