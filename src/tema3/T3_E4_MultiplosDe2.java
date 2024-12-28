package tema3;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T3_E4_MultiplosDe2 {
    public static void main(String[] args){

        /* Este programa tiene la función de
        contar números y al final mostrar
        cuantos números pares fueron ingresados */

        Scanner entrada = new Scanner (System.in);
        int numero = 0, contador = 0, verificador;

        System.out.println("Ingrese números enteros, presionando la tecla enter después de cada entrada, cuando termine ingrese (0)");

        do{
            numero = entrada.nextInt();
            verificador = (numero % 2);
            if(verificador==0)
                contador = contador + 1;
        }while(numero!=0);

        contador = contador - 1;

        System.out.println("Cantidad de números pares que se ingresaron: " +contador);
    }
}
