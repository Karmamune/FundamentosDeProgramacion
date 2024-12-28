package tema4;

import java.util.Random;

/**
 *
 * @author Manuel
 */
public class T4_E18_Matriz5x5 {
    public static void main(String[] args){

        /*
        cree una matriz de 5 x 5 a la cual debe dar valores aleatorios a las primeras 4 filas,
        al terminar realizar la suma de los valores de cada columna y guardar resultado
        en la fila 5 y en la columna solicitada, es decir, si está leyendo los datos de la fila
        cero, el resultado deberá almacenarlo en 4,0; si está leyendo los datos de la fila
        uno, el resultado deberá almacenarlo en 4,1; y así sucesivamente
         */

        Random random = new Random();
        int x[][] = new int[5][5];

        for(int i = 0; i < x.length - 1; i++)
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = random.nextInt(101);
                x[4][j] += x[i][j];
            }

        for(int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++)
                System.out.print(x[i][j] + "\t");
            if(i == 4)
                System.out.print("<- suma de cada columna");
            System.out.println();
        }
    }
}
