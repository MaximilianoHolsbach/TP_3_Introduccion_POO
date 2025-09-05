package TP_3_Introduccion_POO;
import java.util.Scanner;
/**
 *
 * @author Maxi
 */
public class Principal_Mascota {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String nombre, especie, str_edad;
        int edad, anios;
        Mascota mascota1 = new Mascota();
        do{
           System.out.print("Ingrese el nombre de la mascota: ");
           nombre = input.nextLine();
           System.out.print("Ingrese la especie de la mascota: ");
           especie = input.nextLine();
           System.out.print("Ingrese la edad de la mascota: ");
           str_edad = input.nextLine();
        }while(nombre == "" || especie == "" || str_edad == "");
        edad = Integer.parseInt(str_edad);
        System.out.println("La información actual de la mascota es: ");
        mascota1.getInfo();
        mascota1.setData(nombre, especie, edad);
        System.out.println("Cargamos la informacion en la mascota: ");
        mascota1.getInfo();
        System.out.print("Cuantos años más tiene la mascota: ");
        anios = Integer.parseInt(input.nextLine());
        mascota1.setCumplirAnios(anios);
        System.out.println("La información de la mascota actualizada es: ");
        mascota1.getInfo();
    }
}
