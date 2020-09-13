package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class TestSessionListener implements HttpSessionListener {
    public TestSessionListener() {
        System.out.println("TestSessionListener 생성");
    }

    public void sessionCreated(HttpSessionEvent e){
        System.out.println("세션 객체 생성");
    }

    public void sessionDestroyed(HttpSessionEvent e) {
        System.out.println("세션 객체 해제");
    }

}
