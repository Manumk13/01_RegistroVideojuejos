<%-- 
    Document   : index
    Created on : 08-may-2019, 12:43:16
    Author     : cice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String mensaje = (String) request.getAttribute("mensaje");
    if (mensaje == null) {
        mensaje = "";
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
    <center>
        <h1>Validar usuario</h1><br>
        <div>
            <form action="ValidadorServlet" method="GET">

                <input type="email" name="email" placeholder="Email"><br><br>
                <input type="password" name="password" placeholder="Contraseña"><br><br>
                <input type="submit" value="Aceptar">


            </form>
            <%=mensaje%>


        </div>
    </center>
</body>
</html>