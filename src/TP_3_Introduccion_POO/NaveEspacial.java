package TP_3_Introduccion_POO;
import java.util.Scanner;
/**
 *
 * @author Maxi
 * 
 * Atributos:
 *  nombre
 *  combustible
 * 
 * Metodos:
 *  despegar()
 *  avanzar(double distancia)
 *  recargar_combustible(int cantidad)
 *  mostrar_estado()
 */
public class NaveEspacial {
    Scanner input = new Scanner(System.in);
    //Declaracion de los atributos
    private String nombre;
    private int combustible;
    
    //Declaracion de los metodos
    
    public void mostrar_estado(){
        String en_el_aire = despegar()?"En el aire":"En la pista";  
        System.out.println("Estado de la nave \n" 
                        +   "Nombre: "+nombre+"\n"
                        + "Cantidad de combustible en litros: "+combustible+"\n"
                                        + "Ubicacion: "+en_el_aire);
    }
    public void setCrear_Nave(String nombre, int combustible){
        this.nombre = nombre;
        this.combustible = recargar_combustible(combustible);
        System.out.println("Nave creada!");
    }
    public boolean despegar(){
        if(combustible != 0){
            System.out.print("Para despegar ingrese 1: ");
            int despegar = Integer.parseInt(input.nextLine());
            if(despegar == 1){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public int recargar_combustible(int cantidad){
        int capacidad_disponible = 50 - combustible;
        if(cantidad <= capacidad_disponible){
            combustible += cantidad;
            System.out.println("Carga realizada!");
            return combustible; 
        }else{
            System.out.println("La cantidad excede el limite de carga, el tanque permanece con su nivel de carga");
            return combustible;
        }
    }
    public void avanzar(double distancia){
        double desplazamiento = 0.0;
        boolean habilita = despegar();
        if(habilita){
            desplazamiento += distancia;
            System.out.println("La distancia recorrida es de: "+desplazamiento);
        }else{
            System.out.println("No se puede realizar el recorrido, controle el estado del equipo antes de continuar");
            mostrar_estado();
        }
    }
    
}
