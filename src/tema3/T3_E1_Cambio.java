package tema3;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T3_E1_Cambio {
    public static void main(String[] args){

        /*
        este programa tiene la función de leer una cantidad
        de pesos (número entero) y calcular a cuántos billetes
        de 1000, 500, 200, 100, 50, 20 y monedas de 10, 5, 2 y 1 peso equivale
         */

        Scanner entrada = new Scanner (System.in);
        int cantidad, cantidad_ingresada, cuantos;

        System.out.println("Por favor, ingrese una cantidad monetaria, el programa se encargará de decirle a cuento equivale en billetes y monedas");
        cantidad = entrada.nextInt();
        cantidad_ingresada = cantidad;

        System.out.println("\nCantidad ingresada: " +cantidad_ingresada+ " pesos\n");

        if(cantidad>=1000){
            cuantos = cantidad/1000;
            cantidad = cantidad%1000;
            System.out.println("Billetes de 1000 -> " +cuantos);
        }

        if(cantidad>=500){
            cuantos = cantidad/500;
            cantidad = cantidad%500;
            System.out.println("Billetes de 500 -> " +cuantos);
        }

        if(cantidad>=200){
            cuantos = cantidad/200;
            cantidad = cantidad%200;
            System.out.println("Billetes de 200 -> " +cuantos);
        }

        if(cantidad>=100){
            cuantos = cantidad/100;
            cantidad = cantidad%100;
            System.out.println("Billetes de 100 -> " +cuantos);
        }

        if(cantidad>=50){
            cuantos = cantidad/50;
            cantidad = cantidad%50;
            System.out.println("Billetes de 50 -> " +cuantos);
        }

        if(cantidad>=20){
            cuantos = cantidad/20;
            cantidad = cantidad%20;
            System.out.println("Billetes de 20 -> " +cuantos);
        }

        if(cantidad>=10){
            cuantos = cantidad/10;
            cantidad = cantidad%10;
            System.out.println("Monedas de 10 -> " +cuantos);
        }

        if(cantidad>=5){
            cuantos = cantidad/5;
            cantidad = cantidad%5;
            System.out.println("Monedas de 5 -> " +cuantos);
        }

        if(cantidad>=2){
            cuantos = cantidad/2;
            cantidad = cantidad%2;
            System.out.println("Monedas de 2 -> " +cuantos);
        }

        if(cantidad>=1){
            cuantos = cantidad;
            System.out.println("Monedas de 1 -> " +cuantos);
        }
    }
}
