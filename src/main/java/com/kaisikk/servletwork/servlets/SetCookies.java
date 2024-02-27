package com.kaisikk.servletwork.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

/**
 * @author Kaisikk
 */
public class SetCookies extends HttpServlet {

    /**
     * Set new cookie
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie cookie = new Cookie("simple_id", "123");

        Cookie secondCookie = new Cookie("name", "Kaisikk");

        Cookie thirdCookie = new Cookie("randomInt", String.valueOf(new Random().nextInt()));

        cookie.setMaxAge(24 * 60 * 60);
        secondCookie.setMaxAge(24 * 60 * 60);

        resp.addCookie(cookie);
        resp.addCookie(secondCookie);
        resp.addCookie(thirdCookie);
    }
}
