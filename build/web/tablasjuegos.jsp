<%@page import="java.sql.ResultSet"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ResultSet juegos = (ResultSet) request.getAttribute("datos");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TABLA JUEGOS</title>
    </head>
    <body>
        <table border="1">
            <%
                while (juegos.next()) {
            %>
            
            
            <tr>
                <td>ID</td>
                <td>IMAGEN</td>

                <td>NOMBRE</td>
                <td>COMPAÑIA</td>
                <td>DESARROLLADOR</td>
                <td>GENERO</td>
                <td>PLATAFORMA</td>

                <td>PRECIO</td>

            </tr>
            <tr>
                <td><%=juegos.getInt("id")%></td>
                <td><img width="100px" src="<%=juegos.getString("imagen")%>"</td>

                <td><%=juegos.getString("nombre")%></td>
                <td><%=juegos.getString("compañia")%></td>
                <td><%=juegos.getString("desarrollador")%></td>
                <td><%=juegos.getString("genero")%></td>
                <td><%=juegos.getString("plataforma")%></td>

                <td><%=juegos.getInt("precio")%>€</td>
                 <td><a href="BorradoJuegosServlet?idCamiseta=<%=juegos.getInt("id")%>">Borrar</a></td>

            </tr>
            <% }%>
        </table>
    </body>
</html>
