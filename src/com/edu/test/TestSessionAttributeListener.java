package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class TestSessionAttributeListener implements HttpSessionAttributeListener {
    public TestSessionAttributeListener() {
        System.out.println("TestSessionAttributeListener 객체 생성");
    }

    public void attributeAdded(HttpSessionBindingEvent e){
        System.out.println("세선 객체에 속성 추가");
    }

    public void attributeRemoved(HttpSessionBindingEvent e){
        System.out.println("세션 객체에 추가된 속성 삭제");
    }

    public void attributeReplaced(HttpSessionBindingEvent e){
        System.out.println("세션 객체에 추가된 속성 대체");
    }
}
