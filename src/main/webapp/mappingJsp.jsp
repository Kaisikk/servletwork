<%--
  Created by IntelliJ IDEA.
  User: Kaisikk
  Date: 25.02.2024
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JspServlet</title>
</head>
<body>
<h1>Simple JSP servlet (mapped in web.xml)</h1>

<p>

    <%
        String name = request.getParameter("name");

    %>
    <%= "Hello, " + name %>

</p>


</body>
</html>
