<%--
  Created by IntelliJ IDEA.
  User: hanseongjun
  Date: 20. 8. 31.
  Time: 오후 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>덧셈</title>
</head>
<body>
<h3>선언문으로 구현한 덧셈</h3>
<%!
    public int sum(int a, int b) {
        return a+b;
    }
%>

덧셈의 결과 : <%= this.sum(20, 30)%>
</body>
</html>
