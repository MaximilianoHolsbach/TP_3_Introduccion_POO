package TP_3_Introduccion_POO;
/**
 *
 * @author Maxi
 * 
 * Atributos:
 *  titulo
 *  autor
 *  anio_Publicacion
 * Metodos:
 *  crear_Libro
 *  actualizar_Anio
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anio_Publicacion;
    
    public void getInfo(){
        System.out.println("Libro: "+titulo+"\n"
                        + "Autor: "+autor+"\n"
                        + "Publicacion: "+anio_Publicacion);
    }
    public void set_crear_libro(String titulo,String autor,int anio_Publicacion){
        this.anio_Publicacion = anio_Publicacion;
        this.autor = autor;
        this.titulo = titulo;
    }
    private int get_validar_anio(int anio){
        if(anio > anio_Publicacion){
            return anio;
        }
        return anio_Publicacion;
    }
    public void set_actualizar_anio(int anio){
        anio_Publicacion = get_validar_anio(anio);
    }
}
