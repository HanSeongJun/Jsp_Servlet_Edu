package com.edu.test;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FlowFilterTwo implements Filter {
    String charset;
    public void init(FilterConfig config) {
        System.out.println("init() 호출 .......... two");
        charset = config.getInitParameter("en");
    }

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
        throws java.io.IOException, ServletException {
        req.setCharacterEncoding(charset);
        System.out.println("doFilter() 호출 전 .......... two");
        chain.doFilter(req, res);
        System.out.println("doFilter() 호출 후 .......... two");
    }

    public void destroy() {
        System.out.println("destroy() 호출 .......... two");
    }
}
