package tema4;

/**
 *
 * @author Manuel
 */
public class T4_E14_Sumatoria {
    public static void main(String[] args){

        /*
        inicialice un arreglo de 10 elementos, realice e imprima la sumatoria.
         */

        int x[] = new int[10];
        int suma = 0;

        for(int i=0; i<x.length; i++)
            x[i]= 2+(2*i);

        System.out.printf("%s%8s\n", "Indice", "Valor");

        for(int i=0; i<x.length; i++)
            System.out.printf("%5d%8d\n", i, x[i]);

        for(int i=0; i<x.length; i++)
            suma=suma+x[i];

        System.out.println("\nSumatoria = "+suma);
    }
}
