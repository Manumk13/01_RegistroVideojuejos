/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.mmagames.tablaconsolas;

/**
 *
 * @author cice
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import tk.mmagames.registrovideojuegos.GestorBBDD;

/**
 *
 * @author cice
 */
public class GestorConsolas extends GestorBBDD {
    
    public GestorConsolas() throws ClassNotFoundException, SQLException{
    
    
    super();
    
    }
    public void deleteConsola(int id) throws SQLException{
    
    String sql = "DELETE FROM consolas WHERE id=?";
    PreparedStatement ps= conexion.prepareStatement(sql);
    ps.setInt (1,id);
    ps.executeUpdate();
    
    
    
    }
    
    public ResultSet getConsola() throws SQLException{
    
     String sql = "SELECT * FROM consolas ";
    Statement sentencia = conexion.createStatement();
    ResultSet resultado = sentencia.executeQuery(sql);
    return resultado;
    
    
    }



    
    }