/*
Desarrollado por MMA GAMES
(C)2019
*/
package tk.mmagames.registroconsolas;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * REGISTRADOR DE CONSOLAS
 *
 * @author ATY,MAV,MAL,JMO
 * @since 1.0
 */
public class RegistroConsolaServlet extends HttpServlet {

   /**
     *
     * @param request Pide los valores del formulario y hace la funcion registrar para la instancia Consola=c.
     * @param response Te pide una respuesta "correcto.html o incorrecto.html" despues de hacer el request.
     * @throws ServletException
     * @throws IOException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String imagen = request.getParameter("imagen");
        String nombre = request.getParameter("nombre");
        String plataforma = request.getParameter("plataforma");
        String descripcion = request.getParameter("descripcion");

        float precio = Float.parseFloat(request.getParameter("precio"));
        Consola c = new Consola(imagen, nombre, plataforma, descripcion, precio);

        try {
            GestorConsolas gc = new GestorConsolas();
          gc.registrar(c);

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
        processRequest(request, response);
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
        processRequest(request, response);
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
