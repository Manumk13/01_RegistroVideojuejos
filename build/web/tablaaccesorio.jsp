<%@page import="java.sql.ResultSet"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ResultSet accesorios = (ResultSet) request.getAttribute("datos");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TABLA ACCESORIOS</title>
    </head>
    <body>
        <table border="1">
            <%
                while (accesorios.next()) {
            %>


            <tr>
                <td>ID</td>
                <td>IMAGEN</td>

                <td>NOMBRE</td>
                <td>PLATAFORMA</td>
                <td>DESCRIPCION</td>

                <td>PRECIO</td>

            </tr>
            <tr>
                <td><%=accesorios.getInt("id")%></td>
                <td><img width="100px" src="<%=accesorios.getString("imagen")%>"</td>

                <td><%=accesorios.getString("nombre")%></td>
                <td><%=accesorios.getString("plataforma")%></td>
                <td><%=accesorios.getString("descripcion")%></td>
                <td><%=accesorios.getFloat("precio")%>€</td>
                <td><a href="BorradoAccesoriosServlet?idAccesorios=<%=accesorios.getInt("id")%>">Borrar</a></td>

            </tr>
            <% }%>
        </table>
    </body>
</html>

