package com.kaisikk.servletwork.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Kaisikk
 */
public class GetCookies extends HttpServlet {

    /**
     * Get all cookies
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie[] cookies = req.getCookies();

        PrintWriter writer = resp.getWriter();

        writer.println("<html>");

        for(Cookie cookie : cookies){
        writer.println("<h1>" + cookie.getName() + ":" + cookie.getValue() + "</h1>");
        }

        writer.println("</html>");
    }
}
