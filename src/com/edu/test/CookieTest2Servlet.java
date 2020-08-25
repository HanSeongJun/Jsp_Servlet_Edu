package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cookie2")
public class CookieTest2Servlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();

        Cookie[] list = req.getCookies();
        for(int i = 0; list != null && i < list.length; i++) {
            out.println(list[i].getName() + ":" + list[i].getValue() + "<br>");
        }

        out.close();
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
    }
}
