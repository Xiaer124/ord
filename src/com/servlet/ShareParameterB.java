package com.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ShareParameterB extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        PrintWriter printWriter = resp.getWriter();
        ServletContext servletContext=this.getServletContext();
        String value=(String) servletContext.getAttribute("name");
        if(value==null){
            printWriter.println("该对象不能使用！");
        }else {
            printWriter.println(value);
        }
    }
}
