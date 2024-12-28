package tema3;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T3_E9_Areas {
    public static void main(String[] args){

        /*
        Este programa tiene la función
        de sacar áreas de figuras geométricas
        que se soliciten dentro de las opciones
        */

        Scanner entrada = new Scanner (System.in);
        String condicion;
        double a_tri, a_cir, a_cua, base, altura, radio, lado;
        int operacion;

        do{
            System.out.println("\n¿De cuál figura geométrica quiere sacar el área?\n\n(1) para tríangulo\n(2) para círculo\n(3) para cuadrado\n");
            operacion=entrada.nextInt();

            switch (operacion) {
                case 1 -> {
                    System.out.println("\nIngrese la base y la altura del triángulo");
                    base = entrada.nextDouble();
                    altura = entrada.nextDouble();
                    a_tri = (base * altura) / 2;
                    System.out.printf("\nEl área del triángulo es: %.2f", +a_tri);
                }
                case 2 -> {
                    System.out.println("\nIngrese el radio del círculo");
                    radio = entrada.nextDouble();
                    a_cir = (3.1416 * Math.pow(radio, 2));
                    System.out.printf("\nEl área del círculo es: %.2f", +a_cir);
                }
                case 3 -> {
                    System.out.println("\nIngrese el valor de un lado del cuadrado");
                    lado = entrada.nextDouble();
                    a_cua = (lado * lado);
                    System.out.printf("\nEl área del cuadrado es: %.2f", +a_cua);
                }
                default -> System.out.println("\nLa opción ingresada no es válida");
            }
            System.out.println("\n\n¿Quiere efectuar otra operación? (SI) o (NO)");
            condicion=entrada.next();
        }while (condicion.equals("SI"));
    }
}
