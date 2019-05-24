/*
Desarrollado por MMA GAMES
(C)2019
*/
package tk.mmagames.tablaaccesorios;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tk.mmagames.tablajuegos.GestorJuegos;

/**
 * CONSULTA DE ACCESORIOS
 *
 * @author ATY,MAV,MAL,JMO
 * @since 1.0
 */
public class ConsultaAccesoriosServlet extends HttpServlet {

     /**
     *
     * @param request Instanciar GestorAcc y que haga la funcion getAcc.
     * @param response Te manda a la tablaaacsesorios.jsp si se ejecuta bien o al incorrecto.html si no se ejecuta.
     * @throws IOException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                try{
            
          GestorAcc gestor = new GestorAcc();
            ResultSet accesorios = gestor.getAcc();
            System.out.println("TODO CORRECTOO");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/tablaaccesorio.jsp");
            request.setAttribute("datos",accesorios);
            dispatcher.forward(request,response);
        }catch (Exception e){
            e.printStackTrace();
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/incorrecto.html");
            dispatcher.forward(request,response);
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
