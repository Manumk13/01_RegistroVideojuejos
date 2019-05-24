
package tk.mmagames.validador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cice
 */
public class GestorBBDD {
    protected Connection conexion;
    
    public GestorBBDD () throws ClassNotFoundException, SQLException{
    
    Class.forName("com.mysql.jdbc.Driver");//8889 puerto servidor conectado
    conexion=DriverManager.getConnection("jdbc:mysql://localhost:8889/bbdd_mma","marlonspark","marlonsaurio");//conexion con la bbdd
    }
    
    public void cerrarConexion() throws SQLException{
    
    conexion.close();
    
    }
   /* public static void main(String[] args) {
        
        try {
            GestorBBDD gb = new GestorBBDD();
            gb.cerrarConexion();
            System.out.println("CONEXION OK");
        } catch (Exception e) {
            e.printStackTrace();
            
        } 
    }*/
}
