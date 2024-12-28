package tema2;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T2_EV1 {
    public static void main(String[] args){

        Scanner entrada = new Scanner (System.in);
        String col1 = "Nombre", col2 = "Apellidos", col3 = "Edad", col4 = "Sexo", nombre, apellidos;
        byte edad;
        char sexo;

        System.out.println("Ingrese su nombre, apellidos, edad y sexo (m) o (f)");
        nombre = entrada.nextLine();
        apellidos = entrada.nextLine();
        edad = entrada.nextByte();
        sexo = entrada.next().charAt(0);

        System.out.printf("%-16s %-15s %-15s %-15s \n", col1, col2, col3, col4);
        System.out.printf("%-16s %-15s %-15s %-15s", nombre, apellidos, edad, sexo);
    }
}
