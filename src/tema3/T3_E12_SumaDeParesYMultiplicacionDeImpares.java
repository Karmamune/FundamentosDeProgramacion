package tema3;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T3_E12_SumaDeParesYMultiplicacionDeImpares {
    public static void main(String[] args){

        /*
        Este programa tiene la función de sumar los
        números pares y multiplicar los números
        impares que se ingresen, hasta alcanzar
        el máximo permitido por la condición

        suma > 150
        multiplicación > 350
        */

        Scanner entrada = new Scanner (System.in);
        int numero, suma = 0, multiplicacion = 1;
        boolean uno_ingresado = false;

        System.out.println("Ingrese números enteros, este programa sumará los números pares y multiplicará los números impares hasta que alguno supere la condición");

        do{
            numero = entrada.nextInt();
            if(numero%2==0) {
                suma = suma + numero;
            }
            else if (numero == 1) {
                uno_ingresado = true;
            }
            else {
                multiplicacion = multiplicacion * numero;
            }
        }while(suma <= 150 && multiplicacion <= 350);

        if(multiplicacion==1 && uno_ingresado) {
            multiplicacion = 1;
        }
        else if (multiplicacion == 1 && !uno_ingresado) {
            multiplicacion = 0;
        }

        System.out.println("\nLos resultados son:\nSuma -> " +suma+ "\nMultiplicación -> " +multiplicacion);
    }
}
