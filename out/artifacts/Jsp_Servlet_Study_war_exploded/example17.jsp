<%--
  Created by IntelliJ IDEA.
  User: hanseongjun
  Date: 20. 9. 11.
  Time: 오후 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Java Bean</title>
</head>
<body>
<jsp:useBean class="com.edu.beans.HelloBean" id="hello" />

<jsp:getProperty name="hello" property="name"/><br>
<jsp:getProperty name="hello" property="number"/><br>

<jsp:setProperty name="hello" property="*"/>

<hr>

<jsp:getProperty name="hello" property="name"/><br>
<jsp:getProperty name="hello" property="number"/><br>
</body>
</html>
