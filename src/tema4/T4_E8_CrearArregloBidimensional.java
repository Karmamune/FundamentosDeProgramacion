package tema4;

/**
 *
 * @author Manuel
 */
public class T4_E8_CrearArregloBidimensional {
    public static void main(String[] args){

        int B1[][]=new int[4][3];
        //inicializando el arreglo con el valor 17 en cada posición
        for(int i=0; i<B1.length; i++)
            for(int j=0; j<B1[i].length; j++)
                B1[i][j]=17;

        System.out.println("Mostrando datos del arreglo B1");
        for(int i=0; i<B1[i].length; i++){
            for(int j=0; j<B1[i].length; j++)
                System.out.print(B1[i][j]+"\t");
            System.out.println();
        }
    }
}
