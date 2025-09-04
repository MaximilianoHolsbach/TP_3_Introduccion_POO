package TP_3_Introduccion_POO;

/**
 *
 * @author Maxi
 * 
 * Atributos:
 *  nombre
 *  apellido
 *  curso
 *  calificacion
 * Metodos: 
 *  getInfo()
 *  setSubirCalificacion(puntos)
 *  setBajarCalificacion(puntos)
 */
public class Estudiante {
   private String nombre;
   private String apellido;
   private int curso;
   private int calificacion;
   
   public void getInfo(){
       System.out.println("Estudiante:\n"
               + "Nombre: "+nombre+"\n"
               + "Apellido: "+apellido+"\n"
               + "Curso: "+curso+"\n"
               + "Calificacion: "+calificacion);
   }
   public void setData(String nombre, String apellido, int curso, int calificacion){
       if(nombre != null & apellido != null & curso >= 1 & calificacion >= 1){
           this.nombre = nombre;
           this.apellido = apellido;
           this.curso = curso;
           this.calificacion = calificacion;
       }else{
           System.out.println("Ingrese valores validos");
       }
   }
   public void setSubirCalificacion(int puntos){
       if(puntos > 0){
           calificacion += puntos;
           System.out.println("La calificación actual es: "+ calificacion);
       }else{
           System.out.println("Los puntos ingresados no son validos");
       }
   }
   public void setBajarCalificacion(int puntos){
       if(calificacion > 0 & puntos > 0 & calificacion > puntos){
           calificacion -= puntos;
           System.out.println("La calificación actual es: "+ calificacion);
       }else{
           System.out.println("Los puntos ingresados no son validos");
       }
   }
}

