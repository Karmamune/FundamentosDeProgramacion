package tema4;

/**
 *
 * @author Manuel
 */
public class T4_E2_CrearArregloInicializado {
    public static void main(String[] args){

        int x[] = {17, 22, 25, 30, 50, 80};
        System.out.printf("%s%8s\n", "Indice", "Valor");
        for(int i=0; i<x.length; i++)
            System.out.printf("%5d%8d\n", i, x[i]);
    }
}
