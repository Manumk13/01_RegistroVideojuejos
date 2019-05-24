/*
Desarrollado por MMA GAMES
(C)2019
*/
package tk.mmagames.registrovideojuegos;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * REGISTRADOR DE JUEGOS
 *
 * @author ATY,MAV,MAL,JMO
 * @since 1.0
 */

public class RegistroServlet extends HttpServlet {

    /**
     *
     * @param request Pide los valores del formulario y hace la funcion registrar para la instancia juego1.
     * @param response Te pide una respuesta "correcto.html o incorrecto.html" despues de hacer el request.
     * @throws ServletException
     * @throws IOException
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        String imagen = request.getParameter("imagen");
        String nombre = request.getParameter("nombre");
        String company = request.getParameter("compañia");
        String desarrollador = request.getParameter("desarrollador");
        String genero = request.getParameter("genero");
        String plataforma = request.getParameter("plataforma");

        float precio = Float.parseFloat(request.getParameter("precio"));
        Juego juego1 = new Juego(imagen, nombre, company, desarrollador, genero, plataforma, precio);

        try {
            GestorJuegos gj = new GestorJuegos();
            gj.registrar(juego1);
            
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/correcto.html");
            dispatcher.forward(request, response);
            
        } catch (Exception e) {
            
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/incorrecto.html");
            dispatcher.forward(request, response);

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegistroServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegistroServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
