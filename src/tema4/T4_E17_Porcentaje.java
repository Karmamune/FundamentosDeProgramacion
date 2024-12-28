package tema4;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T4_E17_Porcentaje {
    public static void main(String[] args){

        /*
        suponga que tiene almacenados en un arreglo los precios de diversos artículos. Al
        iniciar el programa el propietario decide el % que quiere ganar en la venta de los
        productos y los establece. En cuanto al impuesto al valor agregado (iva) en México
        actualmente es el 16%, este dato como ya es conocido, utilice una constante para
        establecerlo en el sistema. Cuando el propietario vende los productos necesita
        saber cuánto recibió por concepto de iva y cúales fueron sus ganancias reales, por
        lo que se le pide utilice un segundo arreglo de 2 dimensiones en donde guarde iva
        y ganancias. Al finalizar el día el propietario desea saber cuanto debe pagar al SAT
        por la venta de los productos y saber cuáles fueron sus utilidades.
         */

        Scanner entrada = new Scanner (System.in);
        int precios[] = {36, 42, 17, 58, 9};
        double precio_con_porcentaje[] = new double[precios.length];
        double iva_y_ganancia[][] = new double[precios.length][2];
        int porcentaje;
        double iva = 0.16, porcentaje_real, total_gan = 0, total_iva = 0;

        System.out.println("Precio de los 5 productos más vendidos");
        for(int i = 0; i < precios.length; i++)
            System.out.println("$" +precios[i]);

        System.out.println("\nIngrese el porcentaje que quiere ganar en la venta de los productos");
        porcentaje = entrada.nextInt();
        porcentaje_real = ((double) porcentaje / 100); //convierto el entero ingresado a un double

        for(int i = 0; i < precio_con_porcentaje.length; i++)
            precio_con_porcentaje[i] = precios[i] * porcentaje_real;

        for(int i = 0; i < iva_y_ganancia.length; i++) {
            for (int j = 0; j < iva_y_ganancia[i].length; j++) {
                iva_y_ganancia[i][1] = precio_con_porcentaje[i];
                iva_y_ganancia[i][0] = precio_con_porcentaje[i] * iva;
            }
            total_gan += iva_y_ganancia[i][1];
            total_iva += iva_y_ganancia[i][0];
        }

        System.out.println("\n\t\t\tPRECIOS\nNORMAL\t///\tCON IVA\t///\tGANANCIA REAL (" +porcentaje+ "%)");
        for (int i = 0; i < precios.length; i++)
            System.out.printf("$%d\t\t\t$%.2f\t\t$%.2f%n", precios[i], iva_y_ganancia[i][0], iva_y_ganancia[i][1]);

        System.out.printf("\nTotal de ganancias: $%.2f\nTotal de impuestos a pagar: $%.2f", total_gan, total_iva);
    }
}
