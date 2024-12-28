package tema3;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T3_E11_SumaHastaSerMayorDe100 {

    public static void main(String[] args) {

        /*
        este programa tiene la función de sumar
        una serie de números enteros ingresados
        y sumarlos hasta que el resultado sea mayor a 100
         */
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;

        System.out.println("Ingrese números enteros, el programa terminará cuando la suma sea mayor que 100");

        do {
            numero = entrada.nextInt();
            suma = suma + numero;

        } while (suma < 100);

        System.out.println("Resultado final de la suma: " + suma);
    }
}
