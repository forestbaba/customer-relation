package com.forestsoftware;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/TestDbDriver")
public class TestDB  extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        String user = "root";
        String password = "";

        String jdbcUrl = "jdbc:mysql://localhost:3306/bridge?useSSL=false";
        String driver = "com.mysql.jdbc.Driver";

        try{

            PrintWriter printWriter = response.getWriter();
            printWriter.println("Connecting to database: " + jdbcUrl);

            Class.forName(driver);
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
            printWriter.println("Connection successful");

            connection.close();


        }catch (Exception e){
            e.printStackTrace();
            throw new ServletException(e);
        }


    }
}
