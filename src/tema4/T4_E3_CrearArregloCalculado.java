package tema4;

/**
 *
 * @author Manuel
 */
public class T4_E3_CrearArregloCalculado {
    public static void main(String[] args){

        final int longitud_arreglo = 10;
        //se define una constante para declarar el tamaño del arreglo
        int x[] = new int[longitud_arreglo];
        //se calculan los datos para asignarlos al arreglo
        for(int i=0; i<x.length; i++)
            x[i] = 5 + (5 * i);
        System.out.printf("%s%8s\n", "Indice", "Valor");
        //se muestran los datos contenidos por el arreglo
        for(int i=0; i<x.length; i++)
            System.out.printf("%5d%8d\n", i, x[i]);
    }
}
