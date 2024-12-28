package tema3;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T3_EV1 {
    public static void main(String[] args){
        
        /* Este programa imprime números del 1 al 100
        sin imprimir los múltiplos de 5 */

        Scanner entrada = new Scanner (System.in);
        int c = 0, mul_5;

        System.out.println("Ingrese (0) para comenzar");

        int comenzar = entrada.nextInt();

        switch (comenzar){
            case 0:
                do {
                    c++;
                    mul_5=(c%5);
                    if (mul_5!=0){
                        System.out.println(c);
                    }
                }
                while (c<100);
                break;
            default:
                System.out.println("Por favor ingrese (0)");

        }
    }
}
