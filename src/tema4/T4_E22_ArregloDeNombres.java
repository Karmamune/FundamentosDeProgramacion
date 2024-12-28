package tema4;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T4_E22_ArregloDeNombres {
    public static void main(String[] args){

        String N[][] = new String[3][3];
        Scanner entrada = new Scanner(System.in);
        int c = 1;

        for(int i=0; i<N.length; i++)
            for(int j=0; j<N[i].length; j++){
                System.out.println("Ingrese el nombre "+c+"/9");
                N[i][j]=entrada.next();
                c++;
            }

        System.out.println("\nNombres ingresados:");
        for(int i=0; i<N.length; i++){
            for(int j=0; j<N[i].length; j++)
                System.out.print(N[i][j]+"\t\t");
            System.out.println();
        }

        System.out.println();
        for(int i=0; i<N.length; i++){
            for(int j=0; j<N[i].length; j++){
                if(j==0 || j==2)
                    System.out.print(N[i][j]+"\t\t");
            }
            System.out.println();
        }

        System.out.println();
        for(int i=0; i<N.length; i++){
            for(int j=0; j<N[i].length; j++){
                if(i==0 || i==2)
                    System.out.print(N[i][j]+"\t\t");
            }
            System.out.println();
        }
    }
}
