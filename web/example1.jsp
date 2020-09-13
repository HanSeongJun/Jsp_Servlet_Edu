<%--
  Created by IntelliJ IDEA.
  User: hanseongjun
  Date: 20. 8. 31.
  Time: 오후 8:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String user = request.getParameter("name");
    if( user == null)
        user = "Gyest";
%>
<h1>
    Hello
<%=user%>!
</h1>

</body>
</html>
