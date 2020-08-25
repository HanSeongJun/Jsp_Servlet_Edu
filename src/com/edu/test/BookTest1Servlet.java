package com.edu.test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/bookReg")
public class BookTest1Servlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();

    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();

        req.setCharacterEncoding("UTF-8");

        String title = req.getParameter("title");
        String author = req.getParameter("author");
        String publisher = req.getParameter("publisher");

        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setPublisher(publisher);

        req.setAttribute("book", book);

        RequestDispatcher rd = req.getRequestDispatcher("bookOutput");
        rd.forward(req, resp);

        out.close();
    }
}
