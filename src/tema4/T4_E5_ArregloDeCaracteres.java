package tema4;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T4_E5_ArregloDeCaracteres {
    public static void main(String[] args){

        char letras[];
        char vocales[]={'a','e','i','o','u'};
        int cuantos[]=new int[5];
        int longitud;
        String frase;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Proporciona una frase: ");
        frase = teclado.nextLine();
        longitud = frase.length();
        letras = new char[longitud];
        System.out.println("Longitud de la frase: " +longitud);
        //Guardar datos en el arreglo n�meros
        for(int i=0; i<letras.length; i++){
            letras[i]=frase.charAt(i);
            //verificar si es una vocal y contabilizar
            for (int j=0; j<vocales.length; j++){
                if(vocales[j]==letras[i]){
                    cuantos[j]++;
                    break;
                }
            }
        }

        //leer datos del arreglo letras
        System.out.println("Mostrar los datos del arreglo letras: ");
        for(int i=0; i<letras.length; i++){
            System.out.print(letras[i]);
        }
        System.out.println();
        //leer datos de las vocales
        System.out.println("Estad�stica de aparici�n de vocales: ");
        for(int i=0; i<vocales.length; i++){
            System.out.print(vocales[i]+ ": "+cuantos[i]+"->\t");
            for(int j=0; j<cuantos[i]; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
