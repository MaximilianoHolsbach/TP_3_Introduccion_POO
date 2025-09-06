package TP_3_Introduccion_POO;
import java.util.Scanner;
/**
 *
 * @author Maxi
 * 
 * Atributos:
 *  idGallina
 *  edad
 *  huevos_puestos
 * 
 * Metodos:
 *  poner_huevo()
 *  envejecer()
 *  mostrar_estado()
 * 
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevos_puestos;
    
    Scanner input = new Scanner(System.in);

    public void getInfo() {
        System.out.println("Datos de la gallina: \n"
                        + "Id de gallina: "+idGallina+"\n"
                        + "Edad: "+edad+"\n"
                        + "Produccion: "+huevos_puestos);
    }
    
    public int getIdGallina() {
        return idGallina;
    }

    private int setIdGallina(int idGallina){
        if(idGallina > 0){
            return this.idGallina = idGallina;
        }else{
            return this.idGallina = 0;
        }
    }

    private int setEdad(int edad) {
        if(edad > 0){
            return this.edad = edad;
        }else{
            return this.edad = 1;
        }
    }
    
    public int setHuevos_puestos(int huevos_puestos) {
        if(huevos_puestos > 0){
            return this.huevos_puestos += huevos_puestos;
        }else{
            return this.huevos_puestos = 0;
        }
    }
    
    public void setCreate_Gallina(int idGallina, int edad, int huevos_puestos){
        this.idGallina = setIdGallina(idGallina);
        this.edad = setEdad(edad);
        this.huevos_puestos = setHuevos_puestos(huevos_puestos);
        getInfo();
    }
    
    public void setEnvejecer(){
        String str_anio;
        int anio;
        do{
            System.out.print("Ingrese Cuantos anios envejecera el have: ");
            str_anio = input.nextLine();
        }while(str_anio == "");
        anio = Integer.parseInt(str_anio);
        if(anio > 0){
            this.edad += anio;
        }else{
            this.edad = this.edad;
        }
        getInfo();
    }
}
