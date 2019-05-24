/*
Desarrollado por MMA GAMES
(C)2019
*/
package tk.mmagames.registrovideojuegos;

/**Creacion de clase Juego
 * @author ATY,MAV,MAL,JMO
 * @since 1.0
 */
public class Juego {
    private String imagen;
    private String nombre;
    private String company;
    private String desarrollador;
    private String genero;
    private String plataforma;
    private float precio;
/**
 * constara de los siguientes atributos con el siguiente constructor
 * @param imagen
 * @param nombre
 * @param company
 * @param desarrollador
 * @param genero
 * @param plataforma
 * @param precio 
 */
    public Juego(String imagen, String nombre, String company, String desarrollador, String genero, String plataforma, float precio) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.company = company;
        this.desarrollador = desarrollador;
        this.genero = genero;
        this.plataforma = plataforma;
        this.precio = precio;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}