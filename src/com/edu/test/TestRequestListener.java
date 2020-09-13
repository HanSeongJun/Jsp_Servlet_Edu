package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TestRequestListener implements ServletRequestListener {
    public TestRequestListener() {
        System.out.println("TestRequestListener 생성");
    }

    public void requestInitialized(ServletRequestEvent e){
        System.out.println("HttpServletRequest 객체 초기화");
    }

    public void requestDestroyed(ServletRequestEvent e){
        System.out.println("HttpServletRequest 객체 해제");
    }
}
