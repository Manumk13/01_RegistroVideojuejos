/*
Desarrollado por MMA GAMES
(C)2019
 */
package tk.mmagames.registrovideojuegos;

import java.io.FileNotFoundException;// este y el de debajo son los de almacenar
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * Gestor de Juegos(registro)
 *
 * @author ATY,MAV,MAL,JMO
 * @since 1.0
 */
public class GestorJuegos extends GestorBBDD {

     public GestorJuegos() throws ClassNotFoundException, SQLException {
        super();
    }
    /**
   * Inserta los parametros en la BBDD;TABLA tablajuegos
   * @param nuevaConsola Crea un juego nuevo de la clase Juego,cogiendo los datos con los
     * getter y lo almacena.
   * @throws SQLException 
   */

    public void registrar(Juego nuevoJuego) throws SQLException {
        String sql = "INSERT INTO tablajuegos(imagen,nombre,compañia,desarrollador,genero,plataforma,precio) VALUES(?,?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, nuevoJuego.getImagen());
        ps.setString(2, nuevoJuego.getNombre());
        ps.setString(3, nuevoJuego.getCompany());

        ps.setString(4, nuevoJuego.getDesarrollador());
        ps.setString(5, nuevoJuego.getGenero());
        ps.setString(6, nuevoJuego.getPlataforma());
        ps.setFloat(7, nuevoJuego.getPrecio());
        ps.executeUpdate();
        cerrarConexion();

    }
/*
 public void almacenar(Juego nuevoJuego) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("d:/manuelveiga/" + nuevoJuego.getNombre() + ".starknoquieroirme");
        pw.print(nuevoJuego.getImagen());
        pw.print(nuevoJuego.getNombre());
        pw.print(nuevoJuego.getCompany());
        pw.print(nuevoJuego.getDesarrollador());
        pw.print(nuevoJuego.getGenero());
        pw.print(nuevoJuego.getPlataforma());
        pw.print(nuevoJuego.getPrecio());
        pw.close();
    }*/
}

