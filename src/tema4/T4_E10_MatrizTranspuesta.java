package tema4;

/**
 *
 * @author Manuel
 */
public class T4_E10_MatrizTranspuesta {
    public static void main(String[] args){

        int M1[][]=new int[4][4];
        int T1[][]=new int[4][4];
        int c=1;
        System.out.println("\nCREANDO LA MATRIZ M1 DE 4X4 DE MÚLTIPLOS DE 2");
        for (int[] M : M1)
            for (int j=0; j<M1.length; j++)
                M[j]=c++*2;

        System.out.println("\nMOSTRANDO LA INFORMACIÓN DE LA MATRIZ M1");
        for (int i=0; i<M1.length; i++){
            for (int j=0; j<M1.length; j++){
                System.out.print(M1[i][j]+"\t");
                T1[j][i]=M1[i][j];
            }
            System.out.println();
        }
        System.out.println("\nMOSTRANDO LA TRANSPUESTA T1 DE LA MATRIZ M1");
        for (int i=0; i<T1.length; i++){
            for (int j=0; j<T1.length; j++)
                System.out.print(T1[i][j]+"\t");
            System.out.println();
        }
    }
}
