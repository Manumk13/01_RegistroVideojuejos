/*
Desarrollado por MMA GAMES
(C)2019
*/
package tk.mmagames.registro;

import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * GESTOR DE USUARIOS(CLIENTES)
 * @author ATY,MAV,MAL,JMO
 * @since 1.0
 */
public class GestorUsuario extends GestorBBDD {

    public GestorUsuario() throws ClassNotFoundException, SQLException {
        super();
    }
   /**
    * Inserta los parametros en la BBDD;TABLA usuarios
    * @param nuevoUsuario Crea un usuario nuevo de la clase Usuario con los getter.
    * @throws SQLException 
    */
    public void registrar(Usuario nuevoUsuario) throws SQLException {
        String sql = "INSERT INTO usuarios(nombre,apellido,email,password) VALUES(?,?,?,?)";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, nuevoUsuario.getNombre());
        ps.setString(2, nuevoUsuario.getApellido());
        ps.setString(3, nuevoUsuario.getEmail());
        ps.setString(4, nuevoUsuario.getPassword());
        ps.executeUpdate();
        cerrarConexion();

    }

}
