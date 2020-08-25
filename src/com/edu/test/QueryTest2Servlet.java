package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/queryTest2")
public class QueryTest2Servlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.print("<html><head><title>Query 문자열 테스트</title></head>");
        out.print("<body>");
        out.print("<h1>POST 방식 질의 문자열 추출</h1>");

        ServletInputStream input = request.getInputStream();
        // 요청정보의 몸체와 서블릿 프로그램 간에 연결된 입력스트림을 생성하여 반환.

        int len = request.getContentLength(); // 요청정보에 몸체에 담겨있는 문자열의 길이를 반환
        byte[] buf = new byte[len]; // 배열의 시작 주솟값

        input.readLine(buf, 0 , len); // input 입력스트림에서 readLine()메소드로 한 줄 읽어서 buf 배열에 저장.
        // 배열의 0번지부터 시작해서 len 변수에 지정된 길이만큼 저장해라.

        String s = new String(buf);

        out.print("전체 문자열 : " + s);
        out.println("</body></html>");
        out.close();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
