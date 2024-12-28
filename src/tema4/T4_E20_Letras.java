package tema4;

/**
 *
 * @author Manuel
 */
public class T4_E20_Letras {
    public static void main(String[] args){

        char A [][] = {{'a','b','c'}, {'d','e','f'}, {'g','h','i'}, {'j','k','l'},
                {'m','n','ñ'}, {'o','p','q'}, {'r','s','t'}, {'u','v','w'}, {'x','y','z'}};
        System.out.println("Abecedario 3x3");
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++)
                System.out.print(A[i][j]+"\t");
            System.out.println();
        }
    }
}
