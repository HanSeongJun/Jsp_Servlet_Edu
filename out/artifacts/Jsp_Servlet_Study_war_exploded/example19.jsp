<%--
  Created by IntelliJ IDEA.
  User: hanseongjun
  Date: 20. 9. 13.
  Time: 오후 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL</title>
</head>
<body>
${param.id} / ${param.pwd} <br>
${param["id"]} / ${param["pwd"]}
</body>
</html>
