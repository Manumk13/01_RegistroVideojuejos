/*
Desarrollado por MMA GAMES
(C)2019
*/
package tk.mmagames.registroconsolas;

/**Creacion de clase Consola
 * @author ATY,MAV,MAL,JMO
 * @since 1.0
 */
public class Consola {
    private String imagen;
    private String nombre;
    private String plataforma;
    private String descripcion;
    private float precio;
/**
 * constara de los siguientes atributos con el siguiente constructor
 * @param imagen
 * @param nombre
 * @param plataforma
 * @param descripcion
 * @param precio 
 */
    public Consola(String imagen, String nombre, String plataforma, String descripcion, float precio) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Consola(String imagen, String nombre, String company, String desarrollador, String genero, String plataforma, float precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


}