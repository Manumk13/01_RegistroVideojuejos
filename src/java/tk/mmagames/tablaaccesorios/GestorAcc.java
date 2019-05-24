/*
Desarrollado por MMA GAMES
(C)2019
*/
package tk.mmagames.tablaaccesorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import tk.mmagames.registrovideojuegos.GestorBBDD;

/**
 * GESTOR DE ACCESORIOS
 *
 * @author ATY,MAV,MAL,JMO
 * @since 1.0
 */
public class GestorAcc extends GestorBBDD {
    
    public GestorAcc() throws ClassNotFoundException, SQLException{
    
    
    super();
    
    }
    /**
     * BORRADO DE UN REGISTRO DE LA TABLA ACCESORIOS
     * @param id BORRADO POR ID
     * @throws SQLException 
     */
    public void deleteAcc(int id) throws SQLException{
    
    String sql = "DELETE FROM accesorios WHERE id=?";
    PreparedStatement ps= conexion.prepareStatement(sql);
    ps.setInt (1,id);
    ps.executeUpdate();
    
    
    
    }
    /**
     * SELECCION DE UN REGISTRO DE LA TABLA ACCESORIOS
     * @return  Te devuelve resultado
     * @throws SQLException 
     */
    public ResultSet getAcc() throws SQLException{
    
     String sql = "SELECT * FROM accesorios";
    Statement sentencia = conexion.createStatement();
    ResultSet resultado = sentencia.executeQuery(sql);
    return resultado;
    
    
    }



    
    }