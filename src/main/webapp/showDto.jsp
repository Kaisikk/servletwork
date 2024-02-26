<%@ page import="com.kaisikk.servletwork.dto.SimpleDto" %><%--
  Created by IntelliJ IDEA.
  User: Илья
  Date: 26.02.2024
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Dto</title>
</head>
<body>

    <%@ page import="com.kaisikk.servletwork.dto.SimpleDto" %>
    <%@ page import="java.lang.Integer" %>
    <% SimpleDto dto = (SimpleDto) session.getAttribute("dto"); %>

    <% Integer count = (Integer) session.getAttribute("count"); %>

    <p>
    FirstName:  <%= dto.getFirstName()%>
    </p>

<p>

    LastName <%= dto.getLastName()%>
</p>

<p>
    Counter: <%= count %>

</p>

</body>
</html>
