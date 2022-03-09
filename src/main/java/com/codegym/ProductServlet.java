package com.codegym;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductServlet", value = "/display-discount")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));
        int discont = Integer.parseInt(request.getParameter("discount"));
        double discountAmount = price * discont * 0.01;
        double discountPrice = price - discountAmount;
        PrintWriter printWriter = response.getWriter();
        printWriter.write("<html>");
        printWriter.println("<h3>Discount Amount: "+discountAmount+"</h3>");
        printWriter.println("<h3>Discount Price: "+discountPrice+"</h3>");
        printWriter.write("</html>");

    }
}
