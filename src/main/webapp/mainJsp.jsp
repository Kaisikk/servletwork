<%--
  Created by IntelliJ IDEA.
  User: Kaisikk
  Date: 25.02.2024
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Jsp</title>
</head>
<body>
    <h1>First work with JSP</h1>
    <p>
    <%= "First String in JSP"%>
    </p>
    <p>
        <% java.util.Date dateNow = new java.util.Date();
        String str = "Date now : " + dateNow;
        %>
        <%= str %>
    </p>
    <p>
        <%
            for(int i = 0; i < 10; i++){
               out.println(i);
            }
        %>
    </p>

    <p>
        <%@ page import="com.kaisikk.servletwork.logic.SimpleLogicClass" %>

        <% SimpleLogicClass simpleClass = new SimpleLogicClass(); %>

        <%=
        simpleClass.getString()
        %>
    </p>
<p>
    <%@ page import="java.util.Date" %>

    <%=
    new Date()
    %>
</p>

</body>
</html>
