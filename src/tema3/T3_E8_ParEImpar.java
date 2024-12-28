package tema3;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T3_E8_ParEImpar {
    public static void main(String[] args){

        /*
        Este programa tiene la función de leer
        un número del 1 al 10 y mostrar si el
        número es par o impar
        */

        Scanner entrada = new Scanner (System.in);
        int numero;

        System.out.println("Ingrese un número del 1 al 10");
        numero = entrada.nextInt();

        switch(numero){
            case 1, 3, 5, 7, 9 -> System.out.println("El número ingresado es impar");
            case 2, 4, 6, 8, 10 -> System.out.println("El número ingresado es par");
            default -> System.out.println("Por favor ingrese un número del 1 al 10");
        }
    }
}
