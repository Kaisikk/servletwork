package com.kaisikk.servletwork.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Kaisikk
 */
public class DeleteCookies extends HttpServlet {

    /**
     * Delete cookie
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    // add new cookies
    Cookie cookie = new Cookie("randomInt", "");
    // set max lifetime
    cookie.setMaxAge(0);
    resp.addCookie(cookie);
    }
}
