package tema4;

/**
 *
 * @author Manuel
 */
public class T4_E21_MultiplosDe5 {
    public static void main(String[] args) {

        int x[][] = new int[5][4];

        for (int i = 0; i < x.length - 1; i++) {
            for (int j = 0; j < x[i].length - 1; j++) {
                x[i][j] = 5 + (5 * j) + (15 * i);
                x[4][j] += x[i][j];
                x[i][3] += x[i][j];
            }
        }

        System.out.println("Múltiplos de 5");
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++)
                System.out.print(x[i][j] + "\t");
            System.out.println();
        }
    }
}
