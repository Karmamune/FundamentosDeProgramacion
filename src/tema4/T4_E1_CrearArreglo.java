package tema4;

/**
 *
 * @author Manuel
 */
public class T4_E1_CrearArreglo {
    public static void main(String[] args){

        int numeros[]; //Declaración de una variable de tipo arreglo
        numeros = new int[4]; //Asignando tamaño del arreglo

        System.out.printf("%s%8s\n", "Indice", "valor"); //Mostrando información del arreglo
        for(int i=0; i<numeros.length; i++)
            System.out.printf("%5d%8d\n", i, numeros[i]);
    }
}
