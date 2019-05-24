/*
Desarrollado por MMA GAMES
(C)2019
*/
package tk.mmagames.registro;

/**Creacion de clase Usuario(clientes)
 * @author ATY,MAV,MAL,JMO
 * @since 1.0
 */
public class Usuario {
    //atributos
    private String nombre;
    private String apellido;
    private String email;
    private String password;
//constructor

    public Usuario(String nombre, String apellido, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
    }
   
//getter setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
}
