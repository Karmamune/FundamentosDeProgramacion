package tema4;

/**
 *
 * @author Manuel
 */
public class T4_E4_ArregloCalculadoDel50Al60 {
    public static void main(String[] args){

        int x[] = new int[6];

        for(int i = 0; i < x.length; i++)
           x[i] = 50 + (2 * i);

        System.out.printf("%s%8s\n", "Indice", "Valor");
        for(int i = 0; i < x.length; i++)
            System.out.printf("%5d%8d\n", i, x[i]);

        //como lo hice originalmente (lo agrego por si algún día ocupo la información)

        int valor_inicial = 50, valor_final = 60, longitud_del_arreglo = 0;
        valor_final = valor_final + 1;

        do{
            valor_inicial = valor_inicial + 2;
            longitud_del_arreglo = longitud_del_arreglo + 1;

        }while(valor_inicial<valor_final);

        int z[] = new int[longitud_del_arreglo];

        for(int i=0; i<z.length; i++)
            z[i] = 50 + (2 * i);

        System.out.printf("%s%8s\n", "Indice", "Valor");

        for(int i=0; i<z.length; i++)
            System.out.printf("%5d%8d\n", i, z[i]);
    }
}
