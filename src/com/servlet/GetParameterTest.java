package com.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetParameterTest extends HttpServlet {

    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        PrintWriter printWriter = resp.getWriter();
        String qwer = config.getInitParameter("qwer");
        String school = config.getInitParameter("school");
        String servletname = config.getServletName();
        printWriter.println("school:" + school + "<br>");
        printWriter.println("author:" + qwer + "<br>");
        printWriter.println("Servlet名:" + servletname + "<br>");
    }

}
