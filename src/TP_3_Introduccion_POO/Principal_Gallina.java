
package TP_3_Introduccion_POO;
import java.util.Scanner;
/**
 *
 * @author Maxi
 */
public class Principal_Gallina {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String str_edad, str_id, str_huevos;
        int idGallina, edad, huevos_puestos;
        //Creamos los objetos
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        //Informacion inicial de las gallinas
        System.out.println("Gallina-1: ");
        gallina1.getInfo();
        System.out.println("Gallina-2: ");
        gallina2.getInfo();
        //Cargamos la informacion de las gallinas
        System.out.println("Cargamos los datos de la Gallina-1");
        do{
            System.out.print("Ingrese el Id del have: ");
            str_id = input.nextLine();
            System.out.print("Ingrese la edad del have: ");
            str_edad = input.nextLine();
            System.out.print("Ingrese la produccion de huevos del have: ");
            str_huevos = input.nextLine();
        }while(str_edad == "" || str_id == "" || str_huevos == "");
        idGallina = Integer.parseInt(str_id);
        edad = Integer.parseInt(str_edad);
        huevos_puestos = Integer.parseInt(str_huevos);
        gallina1.setCreate_Gallina(idGallina, edad, huevos_puestos);
        System.out.println("Cargamos los datos de la Gallina-2");
        do{
            System.out.print("Ingrese el Id del have: ");
            str_id = input.nextLine();
            System.out.print("Ingrese la edad del have: ");
            str_edad = input.nextLine();
            System.out.print("Ingrese la produccion de huevos del have: ");
            str_huevos = input.nextLine();
        }while(str_edad == "" || str_id == "" || str_huevos == "");
        idGallina = Integer.parseInt(str_id);
        edad = Integer.parseInt(str_edad);
        huevos_puestos = Integer.parseInt(str_huevos);
        gallina2.setCreate_Gallina(idGallina, edad, huevos_puestos);
        //Actualizamos la edad de las gallinas
        System.out.print("Que gallina cumple anios, escriba el id: ");
        idGallina = Integer.parseInt(input.nextLine());
        if(idGallina == gallina1.getIdGallina()){
            gallina1.setEnvejecer();
        }else if(idGallina == gallina2.getIdGallina()){
            gallina2.setEnvejecer();
        }else{
            System.out.println("Debe ingresar id validos");
        }
        //Actualizamos la cantidad de huevos
        System.out.print("A que gallina se le actualiza la produccion, escriba el id: ");
        idGallina = Integer.parseInt(input.nextLine());
        if(idGallina == gallina1.getIdGallina()){
            System.out.print("Ingrese cuantos huevos mas se produjeron: ");
            huevos_puestos = Integer.parseInt(input.nextLine());
            gallina1.setHuevos_puestos(huevos_puestos);
            gallina1.getInfo();
        }else if(idGallina == gallina2.getIdGallina()){
            System.out.print("Ingrese cuantos huevos mas se produjeron: ");
            huevos_puestos = Integer.parseInt(input.nextLine());
            gallina2.setHuevos_puestos(huevos_puestos);
            gallina2.getInfo();
        }else{
            System.out.println("Debe ingresar id validos");
        }
    }
}
