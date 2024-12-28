package tema4;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T4_E6_ArregloDeCadenas {
    public static void main(String[] args){

        String lista[];
        String nombre;
        int longitud, si=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("¿Cuántos nombres desea capturar?: ");
        longitud=teclado.nextInt();
        lista=new String[longitud];
        //guardar datos en el arreglo números
        for(int i=0; i<longitud; i++){
            System.out.println("Proporciona un nombre personal sin espacios: ");
            lista[i]=teclado.next();
        }
        System.out.println("Mostrar los datos del arreglo lista: ");
        for(int i=0; i<lista.length; i++){
            System.out.println((i+1) + ".- " +lista[i]);
        }
        System.out.println("\nProporcione el nombre que desea buscar: ");
        nombre=teclado.next();
        for (String valor : lista)
            if (nombre.equalsIgnoreCase(valor)){
                si=1; break;
            }
        if (si==1)
            System.out.println("El nombre " + nombre.toUpperCase() + " SE ENCUENTRA EN LA LISTA");
        else
            System.out.println("El nombre "+nombre.toUpperCase()+" NO EXISTE");
    }
}
