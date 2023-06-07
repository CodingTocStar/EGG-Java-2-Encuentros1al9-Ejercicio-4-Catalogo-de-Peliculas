/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. 
ENTIDAD
Para esto, tendremos una clase Pelicula con 
    el título, 
    director y 
    duración de la película (en horas).

SERVICIOS
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
    1)En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
    todos sus datos y guardándolos en el objeto Pelicula.
    2)Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
    crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Main;

import Entidades.Pelicula;
import Servicios.ServicioPelicula;
import java.util.ArrayList;

/**
 *
 * @author MiriamNahuel
 */
public class Java2Encuentros1Al9Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioPelicula servicioPelicula = new ServicioPelicula();     //creo la variable que va a usar el servicio       
        
        ArrayList<Pelicula> listaPeliculas = servicioPelicula.crearPelicula();      //guardo en el arraylist la lista de peliculas que creo
        
        servicioPelicula.mostrarPeliculas(listaPeliculas);      //muestro la lista de peliculas
        
        servicioPelicula.mostrarPeliculasMas1Hora(listaPeliculas);      //muestra las que duran mas de una hora
        
        servicioPelicula.ordenDescendenteDuracion(listaPeliculas);
        
        servicioPelicula.ordenAscendenteDuracion(listaPeliculas);
        
        servicioPelicula.ordenarPorDirector(listaPeliculas);
        
        servicioPelicula.ordenarPorTitulo(listaPeliculas);
    }
    
}
