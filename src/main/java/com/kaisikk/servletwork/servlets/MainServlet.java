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
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void doPost(final HttpServletRequest request, final HttpServletResponse response) throws IOException {

    }

    public void destroy() {
    }
}