package com.kaisikk.servletwork.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class DbServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter pw = resp.getWriter();
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java_ee_db", "kaisik", "123");
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("select title from books");

            while(res.next()){
                pw.println(res.getString("title"));
                statement.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
