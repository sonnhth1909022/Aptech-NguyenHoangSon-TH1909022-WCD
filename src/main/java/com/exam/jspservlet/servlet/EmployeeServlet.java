package com.exam.jspservlet.servlet;

import com.exam.jspservlet.dao.EmployeeDao;
import com.exam.jspservlet.entity.EmployeeEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EmployeeServlet", urlPatterns = {"/add"})
public class EmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullname = request.getParameter("fullname");
        String bday = request.getParameter("bday");
        String address = request.getParameter("address");
        String position = request.getParameter("position");
        String department = request.getParameter("department");

        EmployeeDao dao = new EmployeeDao();
        EmployeeEntity employee = new EmployeeEntity(fullname,bday,address,position,department);
        dao.addEmployee(employee);
        response.sendRedirect("home");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("add.jsp").forward(request, response);
    }
}
