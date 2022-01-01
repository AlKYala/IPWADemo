package com.example.ipwademo.IPWA1.Kapitel3.Thema2AberBesser;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Der Wesentliche unterschied sit, dass wir die attribute einfacher der request übergeben
 */
@WebServlet(name = "ipwa132besser", value = "/ipwa132besser")
public class IPWA132Besser extends HttpServlet {

    private String name;
    private String name1;

    public String getName() {
        return this.name;
    }

    public String getName1() {
        return this.name1;
    }

    public void setName(String s) {
        this.name = s;
    }

    public void setName1(String s) {
        this.name1 = s;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        this.name = (checkIsStringInvalid(request.getParameter("name")))
                ? "parameter nicht angegeben"
                : request.getParameter("name");
        this.name1 = (checkIsStringInvalid(request.getParameter("name1")))
                ? "parameter nicht angegeben"
                : request.getParameter("name1");

        request.setAttribute("name", name);
        request.setAttribute("name1", name1);

        String jspFile = "/pages/ipwa132besser.jsp"; //dort befindet sich die datei
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(jspFile); //Einstellen welche .jsp wir haben
        requestDispatcher.forward(request, response); //Anfragen weiterleiten an die .jsp datei
    }

    private boolean checkIsStringInvalid(String s) {
        return s == null || s.isEmpty();
    }
}
