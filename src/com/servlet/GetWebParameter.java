package com.servlet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetWebParameter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        PrintWriter printWriter = resp.getWriter();
        String first = this.getServletContext().getInitParameter("first");
        String second = this.getServletContext().getInitParameter("second");
        printWriter.println("Web项目的所有参数如下：");
        printWriter.println(first+"<br>");
        printWriter.println(second+"<br>");
    }
}
