/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. 
ENTIDAD
Para esto, tendremos una clase Pelicula con 
    el título, 
    director y 
    duración de la película (en horas).

 */
package Entidades;

/**
 *
 * @author MiriamNahuel
 */
public class Pelicula {

    //atributos
    private String titulo;
    private String director;
    private double duracion;

    //constructores
    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    //GETTER Y SETTER
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

}
