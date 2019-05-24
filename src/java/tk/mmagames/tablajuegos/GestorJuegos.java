/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.mmagames.tablajuegos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import tk.mmagames.registrovideojuegos.GestorBBDD;

/**
 *
 * @author cice
 */
public class GestorJuegos extends GestorBBDD {
    
    public GestorJuegos() throws ClassNotFoundException, SQLException{
    
    
    super();
    
    }
    public void deleteJuegos(int id) throws SQLException{
    
    String sql = "DELETE FROM tablajuegos WHERE id=?";
    PreparedStatement ps= conexion.prepareStatement(sql);
    ps.setInt (1,id);
    ps.executeUpdate();
    
    
    
    }
    
    public ResultSet getJuegos() throws SQLException{
    
     String sql = "SELECT * FROM tablajuegos";
    Statement sentencia = conexion.createStatement();
    ResultSet resultado = sentencia.executeQuery(sql);
    return resultado;
    
    
    }



    
    }