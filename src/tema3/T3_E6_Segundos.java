package tema3;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T3_E6_Segundos {
    public static void main(String[] args){

        /*
       este programa tiene la función de leer segundos y
       mostrar a cuanto equivale en horas, minutos y segundos
       */

        Scanner entrada = new Scanner (System.in);
        int tiempo;
        double horas, minutos, segundos;

        System.out.println("Ingrese una cantidad de segundos");
        tiempo = entrada.nextInt();

        horas = tiempo / 3600;
        tiempo = tiempo % 3600;
        minutos = tiempo / 60;
        segundos = tiempo % 60;

        System.out.println("\nHoras -> " +horas+ "\nMinutos -> " +minutos+ "\nSegundos -> " +segundos);
    }
}
