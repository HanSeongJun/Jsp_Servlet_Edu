<%--
  Created by IntelliJ IDEA.
  User: hanseongjun
  Date: 20. 9. 13.
  Time: 오전 2:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.sql.*" %>
<%@page import="javax.sql.*" %>
<%@page import="javax.naming.*" %>

<%
    // 1. JDNI 서버 객체 생성
    InitialContext ic = new InitialContext();

    // 2. lookup()
    DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");

    // 3. getConnection()
    Connection conn = ds.getConnection();

    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("select * from test");

    while(rs.next()){
        out.print("<br>" + rs.getString("id") + ":" + rs.getString(2));
    }

    rs.close();
    stmt.close();
    conn.close();
%>
