package com.example.ipwademo.IPWA1.Kapitel3.Thema2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ipwa132", value = "/ipwa132")
public class IPWA132 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        String jspFile = "/pages/ipwa132.jsp"; //dort befindet sich die datei
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(jspFile); //Einstellen welche .jsp wir haben
        requestDispatcher.forward(request, response); //Anfragen weiterleiten an die .jsp datei
    }
}
