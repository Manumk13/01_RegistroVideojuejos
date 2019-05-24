/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.mmagames.validador;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cice
 */
public class ValidadorUsuarios extends GestorBBDD {

    public ValidadorUsuarios() throws ClassNotFoundException, SQLException {

        super();
    }

    public boolean validarUsuario(Usuario u) throws SQLException {

        boolean correcto;
        
        String sql = "SELECT * FROM usuarios WHERE email=? AND password=?";//preparacion consulta bbdd llama tabla
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, u.getEmail());
        ps.setString(2, u.getPassword());

        //ejecución consulta mira tabla
        ResultSet rs=ps.executeQuery();
        
        if(rs.next()==true){
            
            correcto=true;
        }else{
            correcto=false;
        }
        
        
        
        rs.close();//verificacion cierre

        return correcto;

    }

}
