package tema4;

/**
 *
 * @author Manuel
 */
public class T4_E13_SumaDeMatrices {
    public static void main(String[] args){

        int A [][] = {{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        int B [][] = {{8,8,8,8},{7,7,7,7},{6,6,6,6}};
        int C [][] = new int[3][4];

        for(int i=0; i<A.length; i++)
            for(int j=0; j<A[i].length; j++)
                C[i][j] = A[i][j] + B[i][j];

        System.out.println("M A T R I Z  A\t+\tM A T R I Z  B\t=\tM A T R I Z  C");
        for(int i=0; i<C.length; i++){
            for(int j=0; j<C[i].length; j++)
                System.out.print(A[i][j] + "\t");
            System.out.print("\t");
            for(int k=0; k<C[i].length; k++)
                System.out.print(B[i][k] + "\t");
            System.out.print("\t");
            for(int l=0; l<C[i].length; l++)
                System.out.print(C[i][l] + "\t");
            System.out.println();
        }
    }
}
