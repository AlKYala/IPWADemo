package com.example.ipwademo.IPWA1.Kapitel3.Thema1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ipwa131", value = "/ipwa131")
public class IPWA13_Servlets extends HttpServlet {
    private String message;

    public void init() {
        message = "JSP ist outdated";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println(String.format("<h1> %s <h1>", message));
        out.println("</body></html>");
    }

    public void destroy() {
    }
}

/**
 * Erklearung:
 * betrachte @WebServlet
 * Mit ipwa131 wird die referenz diese File hergestellt. - das heisst mit href wird direkt mittels
 * namen (siehe attribut value der Annotation @WebServlet) verwiesen.
 * Ansonsten ist das ganze eigentlich ziemlich langweilig.
 *
 * HttpServletRequest request nimmt nunmal die Anfrage entgegen
 * und HttpServletResponse response ist im Grunde die Ausgabe (wenn wir das so bezeichnen moegen ...
 *
 * Es gibt hierzu eigentlich nicht viel zu sagen.
 */