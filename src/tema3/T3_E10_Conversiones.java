package tema3;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T3_E10_Conversiones {
    public static void main(String[] args){

        /*
        este programa tiene la función de
        hacer conversiones de divisa seleccionando
        la moneda a partir de la que quiera convertir
        */

        Scanner entrada = new Scanner (System.in);
        String repetir;
        int opcion, opcion2;
        double p, d, vd = 18.18, e, ve = 19.86, l, vl = 22.61;

        System.out.println("Para el día en el que se hizo este programa (11/04/2023) los valores de las monedas extrangeras en pesos son los siguientes:\n\nDólar = 18.18 MXN\nEuro = 19.86 MXN\nLibra = 22.61 MXN");

        do{
            System.out.println("\nEliga la moneda apartir de la cual quiera hacer la conversión\n\n(1) pesos\n(2) dólares\n(3) euros\n(4) libras\n");
            opcion=entrada.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("\nIngrese los pesos\n");
                    p = entrada.nextDouble();
                    System.out.println("\n¿A qué moneda quiere hacer la conversión?\n\n(1) dólares\n(2) euros\n(3) libras\n");
                    opcion2 = entrada.nextInt();

                    switch (opcion2) {
                        case 1 -> {
                            d = (p / vd);
                            System.out.printf("\n%.2f pesos equivalen a: %.2f dólares", p, d);
                        }
                        case 2 -> {
                            e = (p / ve);
                            System.out.printf("\n%.2f pesos equivalen a: %.2f euros", p, e);
                        }
                        case 3 -> {
                            l = (p / vl);
                            System.out.printf("\n%.2f pesos equivalen a: %.2f libras", p, l);
                        }
                        default -> System.out.println("\nLa opción ingresada no es válida");
                    }
                }
                case 2 -> {
                    System.out.println("\nIngrese los dólares\n");
                    d = entrada.nextDouble();
                    p = (d * vd);
                    System.out.printf("\n%.2f dólares equivalen a: %.2f pesos", d, p);
                }
                case 3 -> {
                    System.out.println("\nIngrese los euros\n");
                    e = entrada.nextDouble();
                    p = (e * ve);
                    System.out.printf("\n%.2f euros equivalen a: %.2f pesos", e, p);
                }
                case 4 -> {
                    System.out.println("\nIngrese las libras\n");
                    l = entrada.nextDouble();
                    p = (l * vl);
                    System.out.printf("\n%.2f libras equivalen a: %.2f pesos", l, p);
                }
                default -> System.out.println("\nLa opción ingresada no es válida");
            }
            System.out.println("\n\n¿Quiere efectuar otra conversión? (SI) o (NO)\n");
            repetir=entrada.next();
        }while (repetir.equals("SI"));
    }
}
