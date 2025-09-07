package TP_3_Introduccion_POO;
import java.util.Scanner;
/**
 *
 * @author Maxi
 */
public class Principal_Estudiante {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Estudiante estudiante1 = new Estudiante(); 
        int puntos;
        String nombre;
        String apellido;
        String str_curso, str_calificacion, str_puntos;
        int curso;
        int calificacion;
        System.out.println("Datos del estudiante: ");
        estudiante1.getInfo();
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = input.nextLine();
        System.out.print("Ingrese el apellido del estudiante: ");
        apellido = input.nextLine();
        System.out.print("Ingrese el numero del curso del estudiante: ");
        str_curso = input.nextLine();
        curso = Integer.parseInt(str_curso);
        System.out.print("Ingrese el calificacion del estudiante: ");
        str_calificacion = input.nextLine();
        calificacion = Integer.parseInt(str_calificacion);
        estudiante1.setData(nombre, apellido, curso, calificacion);
        estudiante1.getInfo();
        System.out.println("Cuantos puntos subira al estudiante? ");
        str_puntos = input.nextLine();
        puntos = Integer.parseInt(str_puntos);
        estudiante1.setSubirCalificacion(puntos);
        estudiante1.getInfo();
        System.out.println("Cuantos puntos bajara al estudiante? ");
        str_puntos = input.nextLine();
        puntos = Integer.parseInt(str_puntos);
        estudiante1.setBajarCalificacion(puntos);
        estudiante1.getInfo();
    }
}
