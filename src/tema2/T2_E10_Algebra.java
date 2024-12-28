package tema2;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T2_E10_Algebra {
    public static void main(String[] args){

        Scanner entrada = new Scanner (System.in);
        float x, a, b, c, d, e, f, g;

        System.out.println("Este programa tiene la función de resolver la siguiente ecuación:\nx = a / b + c - d * e % f * g\n\nIngrese los valores de: a, b, c, d, e, f y g");
        a = entrada.nextFloat();
        b = entrada.nextFloat();
        c = entrada.nextFloat();
        d = entrada.nextFloat();
        e = entrada.nextFloat();
        f = entrada.nextFloat();
        g = entrada.nextFloat();

        x = (a/b+c-d*e%f*g);

        System.out.printf("El valor de x es: %.2f", x);
    }
}
