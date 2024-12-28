package tema3;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class EstructuraSelectiva1Temario {
    public static void main(String[] args){

        Scanner entrada = new Scanner (System.in);
        byte calificacion;

        System.out.println("Proporciona la calificación");
        calificacion=entrada.nextByte();
        System.out.println(calificacion>=70 ?"APROBADO":"REPROBADO");
    }
}
