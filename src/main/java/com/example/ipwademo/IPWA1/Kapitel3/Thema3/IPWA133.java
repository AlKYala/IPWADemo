package com.example.ipwademo.IPWA1.Kapitel3.Thema3;

import org.json.JSONObject;

import java.io.*;
import java.util.stream.Collectors;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ipwa133", value = "/ipwa133")
public class IPWA133 extends HttpServlet {
    private String message;

    public void init() {
        message = "JSP ist outdated";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        String jspFile = "/pages/ipwa133.jsp"; //dort befindet sich die datei
        request.setAttribute("data", IPWA133Data.getData());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(jspFile); //Einstellen welche .jsp wir haben
        requestDispatcher.forward(request, response); //Anfragen weiterleiten an die .jsp datei
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {


        String jsonString = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));


        String name = new JSONObject(jsonString).getString("name");
        String saenger = new JSONObject(jsonString).getString("saenger");
        String gitarrist = new JSONObject(jsonString).getString("gitarrist");
        String bassist = new JSONObject(jsonString).getString("bassist");
        String drummer = new JSONObject(jsonString).getString("drummer");

        Band band = new Band(name, saenger, gitarrist, bassist, drummer);


        IPWA133Data.getData().add(band);
    }

    public void destroy() {
    }
}

/**
 * Erklearung:
 * Ich hab ne liste mit strings mittels singleton muster in ner anderen klasse
 * mit post requests sollen strings in die liste geschmissen werden
 * dann refresh
 *
 * Eig. gehts hier im Unterkapitel ja hauptsächlich nur drum irgendwelche http-requests zu feuern mittels
 * js
 *
 * Da solls nen textfeld geben, die daten via json
 */