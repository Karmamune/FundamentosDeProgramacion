package tema4;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T4_E15_Calificaciones {
    public static void main(String[] args){

        /*
        Cree un arreglo de 10 elementos, asigne valores (calificaciones) en tiempo de
        ejecución con valores dados por el usuario. Calcule el promedio, calificación
        máxima y mínima. Muestre la información solicitada
         */

        Scanner entrada = new Scanner (System.in);
        int x[] = new int[10];
        int max = 0, min = 100, suma = 0;

        System.out.println("Ingrese 10 calificaciones en número entero");
        for(int i = 0; i < x.length; i++) {
            x[i] = entrada.nextInt();
            if(x[i] > max)
                max = x[i];

            if(x[i] < min)
                min = x[i];

            suma += x[i];
        }

        double promedio = suma / x.length;

        System.out.printf("\n%s%10s", "No.", "Cal.\n");
        for(int i = 0; i < x.length; i++)
            System.out.println(i + 1+ "\t\t" +x[i]);

        System.out.println("\nCalificación máxima -> " +max+ "\nCalificación mínima -> " +min+ "\nPromedio -> " +promedio);
    }
}
