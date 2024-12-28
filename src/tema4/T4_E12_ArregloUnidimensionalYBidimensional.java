package tema4;

import java.util.Random;

/**
 *
 * @author Manuel
 */
public class T4_E12_ArregloUnidimensionalYBidimensional {
    public static void main(String[] args){

        String Alumnos [] = {"Kevin", "Andrea", "Karla", "Alberto",
                "Susana", "Eduardo", "Isabel", "Monica", "Alexis"};
        int filas=Alumnos.length;
        int Calificaciones [][] = new int[filas][4];
        double Promedios [] = new double[filas];
        Random ran= new Random();
        int suma;
        for(int i=0; i<filas; i++){
            suma=0;
            for(int j=0; j<Calificaciones[i].length; j++){
                Calificaciones[i][j] = ran.nextInt(50)+50;
                suma += Calificaciones[i][j];
            }
            Promedios[i]= suma/Calificaciones[i].length;
        }
        System.out.println("ESTUDIANTE\tC A L I F I C A C I O N E S\tPROMEDIO");
        for(int i=0; i<filas; i++){
            System.out.print(Alumnos[i] + "\t\t");
            for(int k=0; k<Calificaciones[i].length; k++)
                System.out.printf("%3d%4s", Calificaciones[i][k], " ");
            System.out.printf("%8.1f\n",Promedios[i]);
        }
    }
}
