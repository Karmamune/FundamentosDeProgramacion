package tema3;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T3_E5_Descuento {
    public static void main(String[] args){

        /*
        este programa tiene la funci�n de dar un valor
        determinado de precio para una inscripci�n
        dependiendo si el usuario pertenece al ITCV
        */

        Scanner entrada = new Scanner (System.in);

        System.out.println("Bienvenido al programa de inscripci�n de la alberca ol�mpica\n\n�Es alumno del ITCV? (SI) o (NO)");
        String alumno = entrada.next();

        switch(alumno){
            case "SI":
                System.out.println("El costo de la inscripci�n es de $500");
                break;

            case "NO":
                System.out.println("El costo de la inscripci�n es de $1000");
                break;

            default:
                System.out.println("Respuesta no v�lida, por favor, intente ingresando (SI) o (NO)");
                break;
        }
    }
}
