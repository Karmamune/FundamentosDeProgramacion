package tema4;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Manuel
 */
public class T4_EV1 {
    public static void main(String[] args){

        /*
        1 crear un arreglo inicializado con 5 nombres propios, declarado de 5x3

        2 ordenar el arreglo utilizando el método Sort()

        3 solicitar ventas de cada persona

        4 obtener el total de ventas por persona

        5 obtener el total de ventas por personas
        */

        String empleados[] = {"Manuel", "Axel", "Daniel", "Aldo", "Carlos"};
        int filas = empleados.length;
        double suma;
        double ventas[][] = new double[5][3];
        double total[] = new double[filas];
        Scanner entrada = new Scanner(System.in);
        Arrays.sort(empleados);

        for (int i=0; i<ventas.length; i++){
            suma = 0;
            System.out.println("Ingrese las ventas del día 1, 2 y 3 de "+empleados[i]);
            for (int j=0; j<ventas[i].length; j++){
                ventas[i][j]=entrada.nextDouble();
                suma = suma + ventas[i][j];
            }
            total[i] = suma;
            System.out.println();
        }

        System.out.printf("%35s\n\n", "Ventas");
        System.out.printf("%s\t%9s\t%9s\t%9s\t%9s\n", "Nombre", "Día 1", "Día 2", "Día 3", "Total");

        for (int i=0; i<filas; i++){
            System.out.print(empleados[i]+"\t");
            for (int k=0; k<ventas[i].length; k++){
                System.out.printf("%9.2f\t", ventas[i][k]);
            }
            System.out.printf("%9.2f\n", total[i]);
        }
    }
}
