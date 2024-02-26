package com.kaisikk.servletwork.servlets;

import java.io.*;
import javax.servlet.http.*;

/**
 * @author Kaisikk
 *
 * Main servlet class of the application.
 * Configuration in web.xml
 */
public class MainServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hi!";
    }

    public void doGet(final HttpServletRequest request, final HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        if(name == null){
            name = "anonim";
        }
        if(surname == null){
            surname = "anonimovich";
        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Hello, " + name + " " + surname + "</h1>");
        out.println("</body></html>");
    }

    public void doPost(final HttpServletRequest request, final HttpServletResponse response) throws IOException {

    }

    public void destroy() {
    }
}