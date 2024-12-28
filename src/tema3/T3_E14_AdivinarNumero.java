package tema3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T3_E14_AdivinarNumero {
    public static void main(String[] args){

        /*
        este programa tiene la función de
        generar un número al azar y la tarea del usuario
        es de intentar adivinar el número generado,
        el programa da pistas diciendo si el número ingresado
        es mayor o menor al que se generá, el usuario tiene 5 intentos
        y puede volver a jugar las veces que quiera
        */

        Scanner entrada = new Scanner (System.in);
        Random random = new Random();
        String repetir;
        int numero, num_gen, c;
        boolean terminar = false;

        System.out.println("Este programa generará un número al azar del 1 al 100, usted tiene la tarea de adivinar este número");

        do{
            c = 1;
            terminar = false;
            num_gen = random.nextInt(101);

            do{
                System.out.println("\nIntento " +c+ "/5");
                numero = entrada.nextInt();

                if(numero < num_gen)
                    System.out.println("El número ingresado es menor que el número generado");

                if(numero > num_gen)
                    System.out.println("El número ingresado es mayor que el número generado");

                if(numero == num_gen){
                    System.out.println("Felicidades, has adivinado el número");
                    terminar = true;
                }

                c++;
            }while(c < 6 && terminar == false);

            if(terminar == false)
                System.out.println("\nHa perdido");

            System.out.println("\n¿Quiere volver a jugar? (SI) o (NO)");
            repetir = entrada.next();
        }while(repetir.equals("SI"));
    }
}
