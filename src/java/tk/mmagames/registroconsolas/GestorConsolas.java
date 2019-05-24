/*
Desarrollado por MMA GAMES
(C)2019
 */
package tk.mmagames.registroconsolas;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import tk.mmagames.registroaccesorio.Accesorio;

/**
 * Gestor de Consolas(registro)
 *
 * @author ATY,MAV,MAL,JMO
 * @since 1.0
 */
public class GestorConsolas extends GestorBBDD {

    public GestorConsolas() throws ClassNotFoundException, SQLException {
        super();
    }

  /**
   * Inserta los parametros en la BBDD;TABLA consolas
   * @param nuevaConsola Crea una consola nueva de la clase Consola,cogiendo los datos con los
     * getter y lo almacena.
   * @throws SQLException 
   */
    public void registrar(Consola nuevaConsola) throws SQLException {
        String sql = "INSERT INTO consolas(imagen,nombre,plataforma,descripcion,precio) VALUES(?,?,?,?,?)";
        PreparedStatement ps = conexion.prepareStatement(sql);

        ps.setString(1, nuevaConsola.getImagen());
        ps.setString(2, nuevaConsola.getNombre());
        ps.setString(3, nuevaConsola.getPlataforma());

        ps.setString(4, nuevaConsola.getDescripcion());
        ps.setFloat(5, nuevaConsola.getPrecio());
        ps.executeUpdate();
        cerrarConexion();

    }

}
