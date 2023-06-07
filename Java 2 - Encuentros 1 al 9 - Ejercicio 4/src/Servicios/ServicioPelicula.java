/*
SERVICIOS
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
    1)En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
    todos sus datos y guardándolos en el objeto Pelicula.
        Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
        crear otra Pelicula o no.

2)Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */
public class ServicioPelicula {

    /*1)En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
    todos sus datos y guardándolos en el objeto Pelicula.
        Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
        crear otra Pelicula o no.*/
    public ArrayList<Pelicula> crearPelicula() {        //quiero crear un arrray list y para devolver eso tiene que ser un array list mi metodo

        Scanner lector = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Pelicula> listaPeliculas = new ArrayList();
        String respuesta;

        do {
            Pelicula nuevaPelicula = new Pelicula();

            System.out.println("¿Qué película quieres agregar?");
            String pelicula = lector.next();
            nuevaPelicula.setTitulo(pelicula);

            System.out.println("¿Quién es el director de esta película?");
            String director = lector.next();
            nuevaPelicula.setDirector(director);

            double duracion;
            boolean duracionValida = false;
            do {
                System.out.println("¿Cuánto dura la película?");
                if (lector.hasNextDouble()) {
                    duracion = lector.nextDouble();
                    nuevaPelicula.setDuracion(duracion);
                    duracionValida = true;
                } else {
                    System.out.println("Valor inválido. Por favor, ingresa un número decimal.");
                    lector.next(); // Descarta el valor no válido
                }
            } while (!duracionValida);

            listaPeliculas.add(nuevaPelicula);

            System.out.println("¿Quieres agregar otra película más? S/N");
            respuesta = lector.next();

            System.out.println("");

        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println();

        return listaPeliculas;
    }


    /*2)Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     */
 /*
    Mostrar en pantalla todas las películas.
     */
    public void mostrarPeliculas(ArrayList<Pelicula> peliculas) {

        //VARIABLES
        //LOGICA
        if (peliculas.isEmpty()) {
            System.out.println("No hay películas para mostrar.");
            return;
        }

        System.out.println("CATALOGO COMPLETO");

        for (Pelicula pelicula : peliculas) {
            System.out.println("El titulo es: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Dura " + pelicula.getDuracion() + " horas.");
        }

        System.out.println("");

    }


    /*
    • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
     */
    public void mostrarPeliculasMas1Hora(ArrayList<Pelicula> peliculas) {

        if (peliculas.isEmpty()) {
            System.out.println("No hay películas para mostrar.");
            return;
        }

        System.out.println("PELICULAS DE DURACION MAYOR A 1 HORA");

        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println("El titulo es: " + pelicula.getTitulo());
                System.out.println("Director: " + pelicula.getDirector());
                System.out.println("Dura " + pelicula.getDuracion() + " horas.");
            }
        }
        System.out.println("");
    }

    /*
    Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
     */
    public void ordenDescendenteDuracion(ArrayList<Pelicula> peliculas) {

        System.out.println("Ordenadas descendentemente:");

        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {      // es public int porque el compare te devuelve 1, o, -1
                // Ordenar en forma descendente según la duración
                return Double.compare(p2.getDuracion(), p1.getDuracion());
            }
        });

        // Mostrar las películas ordenadas
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas.");
            System.out.println("--------------------------");
        }
    }

    /*
    Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
     */
    public void ordenAscendenteDuracion(ArrayList<Pelicula> peliculas) {

        System.out.println("PELICULAS ORDENADAS POR DURACION (ASCENDENTE):");

        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                // Ordenar en forma ascendente según la duración
                return Double.compare(p1.getDuracion(), p2.getDuracion());
            }
        });

        // Mostrar las películas ordenadas
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas.");
            System.out.println("--------------------------");
        }
    }

    /*
    • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
     */
    public void ordenarPorTitulo(ArrayList<Pelicula> peliculas) {

        System.out.println("PELICULAS ORDENADAS POR TITULO:");

        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                // Ordenar alfabéticamente por título
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        });

        // Mostrar las películas ordenadas
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas.");
            System.out.println("--------------------------");
        }
    }

    /*
    • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     */

    public void ordenarPorDirector(ArrayList<Pelicula> peliculas) {

        System.out.println("PELICULAS ORDENADAS POR DIRECTOR:");

        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                // Ordenar alfabéticamente por director
                return p1.getDirector().compareTo(p2.getDirector());
            }
        });

        // Mostrar las películas ordenadas
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas.");
            System.out.println("--------------------------");
        }
    }
//================================================================    
}
