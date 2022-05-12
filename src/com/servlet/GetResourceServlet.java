package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class GetResourceServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        PrintWriter printWriter = resp.getWriter();
        String url = this.getServletContext().getRealPath("/WEB-INF/classes/data.properties");
        Properties pro = new Properties();
        pro.load(new FileInputStream(url));
        printWriter.println("地址："+pro.getProperty("address"));
        printWriter.println("学校："+pro.getProperty("school"));
    }
}
