package tema2;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T2_E9_MasaCorporal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre, apellidos;
        char estado_civil, sexo;
        float peso, estatura, masa_c;

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();

        System.out.println("\nIngrese sus apellidos");
        apellidos = entrada.nextLine();

        System.out.println("\n¿Cuál es su estado civil? (s) para soltero o (c) para casado");
        estado_civil = entrada.next().charAt(0);

        System.out.println("\n¿Cuál es su sexo? (m) para masculino o (f) para femenino");
        sexo = entrada.next().charAt(0);

        System.out.println("\nIngrese su peso");
        peso = entrada.nextFloat();

        System.out.println("\nIngrese su estatura");
        estatura = entrada.nextFloat();

        masa_c = (peso / (estatura * estatura));

        System.out.println("\nNombre: " +nombre+ "\nApellidos: " +apellidos+ "\nEstado civil: " +estado_civil+ "\nSexo: " +sexo+ "\nPeso: " +peso+ "\nEstatura: " +estatura+ "\nMasa corporal: " +masa_c);
    }
}
