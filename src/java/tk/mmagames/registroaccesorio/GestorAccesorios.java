/*
Desarrollado por MMA GAMES
(C)2019
 */
package tk.mmagames.registroaccesorio;

import tk.mmagames.registroconsolas.GestorBBDD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import tk.mmagames.registrovideojuegos.Juego;

/**
 * GESTOR DE Accesorios(registro)
 *
 * @author ATY,MAV,MAL,JMO
 * @since 1.0
 */
public class GestorAccesorios extends GestorBBDD {

    public GestorAccesorios() throws ClassNotFoundException, SQLException {
        super();
    }

    /**
     * Inserta los parametros en la BBDD;TABLA accesorios
     *
     * @param nuevoUsuario Crea un accesorio nuevo de la clase Accesorio con los
     * getter.
     * @throws SQLException
     */
    public void registrar(Accesorio nuevoAccesorio) throws SQLException {
        String sql = "INSERT INTO accesorios(imagen,nombre,plataforma,descripcion,precio) VALUES(?,?, ?, ?,?)";
        PreparedStatement ps = conexion.prepareStatement(sql);

        ps.setString(1, nuevoAccesorio.getImagen());
        ps.setString(2, nuevoAccesorio.getNombre());
        ps.setString(3, nuevoAccesorio.getPlataforma());

        ps.setString(4, nuevoAccesorio.getDescripcion());
        ps.setFloat(5, nuevoAccesorio.getPrecio());
        ps.executeUpdate();
        cerrarConexion();

    }

}
