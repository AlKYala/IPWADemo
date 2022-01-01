<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<html>
    <head>
        <title>JSP Beispiel</title>
    </head>
    <body>
        <h1> Dein parameter fuer name - name1 lautet:
        <%

            String name = (request.getParameter("name") == null || request.getParameter("name").isEmpty())
                    ? "Parameter nicht angegeben"
                    : request.getParameter("name");
            out.print(name); //fuer out musste man noch eine dependency importen, siehe: javax.servlet.jsp mit jsp-api artifact
        %>
            <%

                String name1 = (request.getParameter("name1") == null || request.getParameter("name1").isEmpty())
                        ? "Parameter nicht angegeben"
                        : request.getParameter("name1");
                out.print(name1); //fuer out musste man noch eine dependency importen, siehe: javax.servlet.jsp mit jsp-api artifact
            %></h1>
    </body>

</html>

<!-- bsp: http://localhost:8080/IPWADemo_war_exploded/ipwa132?name=Hallo&name1=Hallo1
http://localhost:8080/IPWADemo_war_exploded/ipwa132?name=Hallo
http://localhost:8080/IPWADemo_war_exploded/ipwa132?name1=Hallo1
http://localhost:8080/IPWADemo_war_exploded/ipwa132-->

