package TP_3_Introduccion_POO;

/**
 *
 * @author Maxi
 * 
 * Atributos:
 *  nombre
 *  especie
 *  edad
 * Metodos:
 *  getInfo()
 *  setAnios()
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    public void getInfo(){
        System.out.println("DATOS DE LA MASCOTA: \n"
                + "Nombre: "+nombre+"\n"
                + "Especie: "+especie+"\n"
                + "Edad: "+edad);
    }
    public void setData(String nombre, String especie, int edad){
      if(nombre != null & especie != null & edad >= 1){
          this.nombre = nombre;
          this.especie = especie;
          this.edad = edad;
      }else{
          System.out.println("Ingrese valores validos");
      }
    }
    public void setCumplirAnios(int anio){
        if(anio > 0){
            edad += anio; 
        }else{
            System.out.println("Ingrese una cantidad de años valida");
        }
    }
}
