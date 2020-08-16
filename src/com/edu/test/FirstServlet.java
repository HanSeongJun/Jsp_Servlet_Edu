package com.edu.test;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/hello2")
public class FirstServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init() 실행 됨!");
        // init() 메소드는 서블릿이 최초로 호출되었을 때 서블릿 컨테이너가 자동으로 실행된다.
    }

    @Override
    public void service(ServletRequest arg0, ServletResponse arg1) throws
            ServletException, IOException {
        System.out.println("service() 실행 됨!");
        // service() 메소드는 클라이언트의 요청이 있을 때 마다 매번 서블릿 컨테이너가 자동으로 실행된다.
    }
}
