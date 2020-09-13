package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/errorTest2")
public class ErrorTest2Servlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();

        try {
            String getquery = req.getQueryString();
            out.print("Query : " + getquery + "<br>");
            out.print("Query 길이 : " + getquery.length());
        } catch (Exception e){
            out.print("요청을 처리하는 동안 오류가 발생하였습니다 : " + e);
        }

        out.print("<br>Done!");
        out.close();
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
    }
}
