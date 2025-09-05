package TP_3_Introduccion_POO;
import java.util.Scanner;
/**
 *
 * @author Maxi
 */
public class Principal_Libro {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String titulo, autor, str_anio_publicacion, str_anio;
        int anio;
        Libro libro1 = new Libro();
        System.out.println("La informacion inicial del libro: ");
        libro1.getInfo();
        do{
           System.out.print("Ingrese el titulo del libro: ");
           titulo = input.nextLine();
           System.out.print("Ingrese el autor del libro: ");
           autor = input.nextLine();
           System.out.print("Ingrese el anio de publicacion del libro: ");
           str_anio_publicacion = input.nextLine(); 
        }while(titulo == "" || autor == "" || str_anio_publicacion == "");
        anio = Integer.parseInt(str_anio_publicacion);
        System.out.println("Cargamos la informacion en el libro: ");
        libro1.set_crear_libro(titulo, autor, anio);
        System.out.println("Vemos la informacion cargada: ");
        libro1.getInfo();
        System.out.println("Actualizamos el anio de publicacion: ");
        do{
           System.out.print("Ingrese el anio de actualizacion del libro: ");
           str_anio_publicacion = input.nextLine();  
        }while(str_anio_publicacion == "");
        anio = Integer.parseInt(str_anio_publicacion);
        libro1.set_actualizar_anio(anio);
        System.out.println("Vemos la informacion Actualizada: ");
        libro1.getInfo();
    }
}
