<%--
  Created by IntelliJ IDEA.
  User: hanseongjun
  Date: 20. 9. 1.
  Time: 오전 1:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>application</title>
</head>
<body>
서버명 : <%= application.getServerInfo() %> <br>
서블릿 버전 : <%= application.getMajorVersion() %>.<%= application.getMinorVersion() %> <br>
<h3>/edu 리스트</h3>
<%
    java.util.Set<String> list = application.getResourcePaths("/");
    if( list != null) {
        Object[] obj = list.toArray();
        for( int i = 0; i < obj.length; i++) {
            out.print(obj[i] + "<br>");
        }
    }
%>
</body>
</html>
