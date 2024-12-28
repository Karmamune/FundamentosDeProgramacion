package tema2;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T2_E8_SuperficieDelCirculo {
    public static void main(String[] args){

        Scanner entrada=new Scanner(System.in);
        double radio, area;

        System.out.println("Este ejercicio te ayudará a encontrar el área de una circunferencia\n\nIngrese a continuación el radio del circulo");
        radio=entrada.nextFloat();
        System.out.println("\nEl valor que se usará de PI es: 3.1416");
        area = ((radio * radio) * 3.1416);
        System.out.println("\nEl área del circulo con radio de " +radio+ " es: " +area);
    }
}
