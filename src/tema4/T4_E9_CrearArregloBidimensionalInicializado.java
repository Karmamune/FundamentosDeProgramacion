package tema4;

/**
 *
 * @author Manuel
 */
public class T4_E9_CrearArregloBidimensionalInicializado {
    public static void main(String[] args){

        int B2[][]={{1,2},{3,4}};
        System.out.println("Mostrando datos del arreglo B2");
        for(int i=0; i<B2.length; i++){
            for(int j=0; j<B2[i].length; j++)
                System.out.print(B2[i][j]+"\t");
            System.out.println();
        }
    }
}
