package tema3;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T3_E2_NumeroMayor {
    public static void main(String[] args){

        /*
        este programa tiene la función de
        leer 5 números y mostrar el mayor
        */

        Scanner entrada = new Scanner (System.in);
        double n1, n2, n3, n4, n5, mayor;

        System.out.println("Ingrese 5 números");
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        n3 = entrada.nextDouble();
        n4 = entrada.nextDouble();
        n5 = entrada.nextDouble();

        mayor = n1;

        if(mayor < n2)
            mayor = n2;

        if(mayor < n3)
            mayor = n3;

        if(mayor < n4)
            mayor = n4;

        if(mayor < n5)
            mayor = n5;

        System.out.println("\nEl número mayor es: " +mayor);
    }
}
