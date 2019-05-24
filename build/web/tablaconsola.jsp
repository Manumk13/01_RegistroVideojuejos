<%@page import="java.sql.ResultSet"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ResultSet consolas = (ResultSet) request.getAttribute("datos");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TABLA CONSOLAS</title>
        <style>
            
            .principal{
                
                background-color: teal;
                color: whitesmoke;
                
            }
            table{
                
                
                background-color: gold;
            }
            a{
                
                text-decoration: none;
                color: red;
            }
           
            
            
            
            
            
            
        </style>
        
        
    </head>
    <body>
        <table border="1">
            <%
                while (consolas.next()) {
            %>


            <tr>
                <td class="principal">ID</td>
                <td class="principal">IMAGEN</td>

                <td class="principal">NOMBRE</td>
                <td class="principal">PLATAFORMA</td>
                <td class="principal">DESCRIPCION</td>

                <td class="principal">PRECIO</td>
                 <td class="principal">ELIMINAR</td>

            </tr>
            <tr>
                <td class="id"><%=consolas.getInt("id")%></td>
                <td><img width="100px" src="<%=consolas.getString("imagen")%>"</td>

                <td><%=consolas.getString("nombre")%></td>
                <td><%=consolas.getString("plataforma")%></td>
                <td><%=consolas.getString("descripcion")%></td>
                <td><%=consolas.getFloat("precio")%>€</td>
                <td><a href="BorradoConsolasServlet?idConsolas=<%=consolas.getInt("id")%>">Borrar</a></td>

            </tr>
            <% }%>
        </table>
    </body>
</html>

