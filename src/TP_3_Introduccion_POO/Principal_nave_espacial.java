package TP_3_Introduccion_POO;
import java.util.Scanner;
/**
 *
 * @author Maxi
 */
public class Principal_nave_espacial {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String nombre;
        int combustible, cantidad; 
        double distancia;
        String str_cantidad, str_distancia;
        //Creamos el objeto nuevo Nave_estratosfera
        NaveEspacial Nave_estratosfera = new NaveEspacial();
        System.out.println("Creamos una nave nueva");        
        System.out.print("Ingresa El nombre de la nave: ");
        nombre = input.next();
        System.out.print("Ingresa la cantidad de combustible de la nave: ");
        combustible = Integer.parseInt(input.next());
        Nave_estratosfera.setCrear_Nave(nombre, combustible);
        //Vemos el estado de la nave recien creada
        Nave_estratosfera.mostrar_estado();
        //Cargamos combustibles
        System.out.print("Ingrese la cantidad de combustible que desea cargar en litros: ");
        str_cantidad = input.next();
        cantidad = Integer.parseInt(str_cantidad);
        Nave_estratosfera.recargar_combustible(cantidad);
        System.out.print("Ingrese la distancia que desea recorrer: ");
        str_distancia = input.next();
        distancia = Double.parseDouble(str_distancia);
        Nave_estratosfera.avanzar(distancia);
        
    }
}
