package tema3;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T3_E7_NumeroFraccionario {
    public static void main(String[] args){

        /*
        Este programa sirve para detectar si un
        número ingresado tiene parte fraccionaria
        */

        Scanner entrada = new Scanner (System.in);
        double numero, verificacion;

        System.out.println("Ingrese un número");
        numero = entrada.nextDouble();

        verificacion = numero % 1;

        if(verificacion==0)
            System.out.println("El número ingresado no tiene parte fraccionaria");
        else
            System.out.println("El número ingresado tiene parte fraccionaria");
    }
}
