<%--
  Created by IntelliJ IDEA.
  User: hanseongjun
  Date: 20. 9. 11.
  Time: 오후 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    String p = request.getParameter("p");
%>
<jsp:forward page="<%=p%>" />
</body>
</html>
