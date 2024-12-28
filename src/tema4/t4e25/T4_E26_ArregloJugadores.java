package tema4.t4e25;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T4_E26_ArregloJugadores {
    public static void main(String[] args){

        /*
        Utilizando la clase jugador de basquetbol cree un arreglo de jugadores y permita
        la búsqueda de un jugador en específico y si lo encuentra mostrar sus datos.
         */

        Scanner entrada = new Scanner (System.in);
        String nombre;
        int si = 0, numero = 0;
        Jugador jugador_nuevo;

        System.out.println("¿Cuántos jugadores quiere registrar?");
        Jugador jugador[] = new Jugador[entrada.nextInt()];

        System.out.println("Ingrese nombre, edad, teléfono, sexo y altura del jugador");
        for(int i = 0; i < jugador.length; i++) {
            jugador_nuevo = new Jugador(entrada.next(), entrada.nextInt(), entrada.next(), entrada.next(), entrada.nextInt());
            jugador[i] = jugador_nuevo;
        }

        System.out.println("\nIngrese el nombre del jugador que desea buscar");
        nombre = entrada.next();

        for(int i = 0; i < jugador.length; i++)
            if (nombre.equalsIgnoreCase(jugador[i].nombre)) {
                si = 1;
                numero = i;
            }

        if(si == 1)
            System.out.println("\nJugador encontrado:\nNombre\t\tEdad\tTeléfono\tSexo\t\t\tAltura\n" + jugador[numero]);
        else
            System.out.println("\nEl jugador ingresado no fue encontrado");
    }
}
