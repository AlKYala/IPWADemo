<%--
  Created by IntelliJ IDEA.
  User: ali
  Date: 04.01.22
  Time: 00:54
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <h1>
            ${data}

        </h1>
        <h3>Name der Band:</h3>
        <input type="text" id="nameBand" name="name">
        <h3>Name des Saengers:</h3>
        <input type="text" id="saenger" name="name">
        <h3>Name des Gitarristen:</h3>
        <input type="text" id="gitarrist" name="name">
        <h3>Name des Bassisten:</h3>
        <input type="text" id="bassist" name="name">
        <h3>Name des Drummers:</h3>
        <input type="text" id="drummer" name="name">
        <button id="knopf">submit</button>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script>
            /*$( "#knopf" ).on("click" , function() {
                console.log($( "#dreck" ).val())
            });*/

            $( "#knopf" ).on("click" , function() {
                let band = {};
                band.name = $( "#nameBand" ).val();
                band.saenger = $( "#saenger" ).val();
                band.gitarrist = $( "#gitarrist" ).val();
                band.bassist = $( "#bassist" ).val();
                band.drummer = $( "#drummer" ).val();
                $.ajax({
                    type: 'POST',
                    contentType: 'application/json',
                    data: JSON.stringify(band),
                    success: function() { alert($( "#nameBand" ).val()) },
                    error: function(){ alert("failure") },
                    url: 'http://localhost:8080/IPWADemo_war_exploded/ipwa133',
                    cache:false
                });
            });


        </script>
    </body>
</html>
