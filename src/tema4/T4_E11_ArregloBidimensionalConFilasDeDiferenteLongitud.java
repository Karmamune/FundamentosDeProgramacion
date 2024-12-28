package tema4;

/**
 *
 * @author Manuel
 */
public class T4_E11_ArregloBidimensionalConFilasDeDiferenteLongitud {
    public static void main(String[] args){

        int B3 [][] = new int[2][]; //se crea el arreglo con 2 filas
        B3 [0] = new int[2]; //crea 2 columnas para la fila 0
        B3 [1] = new int[3]; //crea 3 columnas para la fila 1
        int valor =1;
        for(int i=0; i<B3.length; i++)
            for(int j=0; j<B3[i].length; j++)
                B3[i][j] = valor++; //asignando valores consecutivos

        System.out.println("Mostrando datos del arreglo B3");
        for(int i=0; i<B3.length; i++){
            for(int j=0; j<B3[i].length; j++)
                System.out.print(B3[i][j]+"\t");
            System.out.println();
        }
    }
}
