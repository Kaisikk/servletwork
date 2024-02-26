package com.kaisikk.servletwork.servlets;

import com.kaisikk.servletwork.dto.SimpleDto;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Kaisikk
 */
public class SessionServlet extends HttpServlet {

    /**
     * Work with HttpSessions
     *
     * You can set objects in sessions
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        SimpleDto dto = (SimpleDto) session.getAttribute("dto");

        String firstName = request.getParameter("firstName");

        String lastName = request.getParameter("lastName");

        if(dto == null){
            dto = new SimpleDto();
            dto.setFirstName(firstName);
            dto.setLastName(lastName);
        }

        session.setAttribute("dto", dto);
        Integer count = (Integer) session.getAttribute("count");
        if(count == null){
           session.setAttribute("count", 1);
           count = 1;
        } else {
            session.setAttribute("count", count + 1);
        }

        getServletContext().getRequestDispatcher("/showDto.jsp").forward(request, response);

    }
}
