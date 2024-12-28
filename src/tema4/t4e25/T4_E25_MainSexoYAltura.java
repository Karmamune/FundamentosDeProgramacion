package tema4.t4e25;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T4_E25_MainSexoYAltura {
    public static void main(String[] args){

        Scanner entrada = new Scanner (System.in);
        Jugador jugador_n;

        System.out.println("Ingrese nombre, edad, teléfono, sexo y altura del jugador");
        jugador_n = new Jugador(entrada.next(), entrada.nextInt(), entrada.next(), entrada.next(), entrada.nextInt());

        System.out.println("\nEntrada completa:\n" + jugador_n + "\n\nSexo\t\tAltura\n" + jugador_n.sexo + "\t" + jugador_n.altura);
    }
}
