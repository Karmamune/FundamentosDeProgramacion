package tema3;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T3_E5_Descuento {
    public static void main(String[] args){

        /*
        este programa tiene la función de dar un valor
        determinado de precio para una inscripción
        dependiendo si el usuario pertenece al ITCV
        */

        Scanner entrada = new Scanner (System.in);

        System.out.println("Bienvenido al programa de inscripción de la alberca olímpica\n\n¿Es alumno del ITCV? (SI) o (NO)");
        String alumno = entrada.next();

        switch(alumno){
            case "SI":
                System.out.println("El costo de la inscripción es de $500");
                break;

            case "NO":
                System.out.println("El costo de la inscripción es de $1000");
                break;

            default:
                System.out.println("Respuesta no válida, por favor, intente ingresando (SI) o (NO)");
                break;
        }
    }
}
