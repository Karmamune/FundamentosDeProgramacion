package tema3;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T3_E3_InglesADecimal {
    public static void main(String[] args){

        /*
        este programa tiene la función de
        convertir millas, pies y pulgadas
        al sistema de longitud decimal
        */

        Scanner entrada = new Scanner (System.in);
        double millas, pies, pulgadas, dd1, dd2, dd3;

        System.out.println("Este programa tiene la función de convertir unidades de longitud del sistema inglés al sistema decimal\n\nIngrese millas (mi), pies (ft) y pulgadas (in) presionando la tecla enter después de cada unidad de longitud");
        millas=entrada.nextDouble();
        pies=entrada.nextDouble();
        pulgadas=entrada.nextDouble();

        dd1=(millas*1.609);
        dd2=(pies*0.305);
        dd3=(pulgadas*2.54);

        System.out.println("Millas = "+dd1+"\nPies = "+dd2+"\nPulgadas = "+dd3);
    }
}
