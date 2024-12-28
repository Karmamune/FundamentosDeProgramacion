package tema4;

/**
 *
 * @author Manuel
 */
public class T4_E19_CuadradoYCubo {
    public static void main(String[] args){

        /*
        calcular los cuadrados y los cubos de los números del 1 al 9 y almacenar los
        resultados en un arreglo de 2 dimensiones similar a una tabla de 2 columnas. No
        debe crear variables para hacer las operaciones, debe utilizar el índice del arreglo
        para llevar a cabo las operaciones solicitadas. Imprima tabuladores para mostrar
        la información del arreglo solicitado:
         */

        int x[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int y[][] = new int[x.length][2];

        for(int i = 0; i < y.length; i++)
            for(int j = 0; j < y[i].length; j++) {
                if(j == 0)
                    y[i][j] = x[i] * x[i];
                else
                    y[i][j] = x[i] * x[i] * x[i];
            }

        System.out.println("Número\tCuadrado\tCubo");
        for(int i = 0; i < y.length; i++) {
            System.out.printf("%d\t\t%d\t\t\t%d\n", x[i], y[i][0], y[i][1]);
        }
    }
}
