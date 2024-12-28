package tema4;

/**
 *
 * @author Manuel
 */
public class T4_E16_MultiplosDe3 {
    public static void main(String[] args){

        /*
        cree un arreglo de 25 elementos, los cuales contendrán como valores los múltiplos
        de 3 mayores que 10 y menores de 100
         */

        int x[] = new int[25];

        for(int i = 0; i < x.length; i++){
            if(x[i] <= 100)
                x[i] = 12 + (3 * i);
        }

        System.out.println("Indice\tValor");
        for(int i = 0; i < x.length; i++)
            System.out.printf("%d\t\t%d\n", i, x[i]);
    }
}
