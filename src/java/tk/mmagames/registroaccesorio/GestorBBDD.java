/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.mmagames.registroaccesorio;


import tk.mmagames.registroconsolas.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorBBDD {
   
    protected Connection conexion;
    
    public GestorBBDD () throws ClassNotFoundException, SQLException{
    
    Class.forName("com.mysql.jdbc.Driver");
    conexion=DriverManager.getConnection("jdbc:mysql://localhost:8889/bbdd_mma","marlonspark","marlonsaurio");
    }
    
    public void cerrarConexion() throws SQLException{
    
    conexion.close();
    
    }
}
