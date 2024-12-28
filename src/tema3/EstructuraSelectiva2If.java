package tema3;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class EstructuraSelectiva2If {
    public static void main(String[] args){

        Scanner entrada = new Scanner (System.in);
        byte calificacion;

        System.out.println("Proporciona la calificación");
        calificacion=entrada.nextByte();
        if(calificacion>=70)
            System.out.println("APROBADO");
    }
}
