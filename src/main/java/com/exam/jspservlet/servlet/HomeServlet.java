package com.exam.jspservlet.servlet;

import com.exam.jspservlet.dao.EmployeeDao;
import com.exam.jspservlet.entity.EmployeeEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet", urlPatterns = {"/"})
public class HomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EmployeeDao dao = new EmployeeDao();
        List<EmployeeEntity> employees = dao.getAllEmployee();
        request.setAttribute("employees", employees);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
