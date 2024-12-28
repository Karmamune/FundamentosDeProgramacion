package tema4;

import java.util.Arrays;

/**
 *
 * @author Manuel
 */
public class T4_E7_OperacionesConArreglos {
    public static void main(String[] args){

        int calificaciones[] = {77, 99, 86, 95, 100, 88, 90, 82, 74, 87, 85, 98};
        int total = 0, minima=100, maxima=0;
        Arrays.sort(calificaciones);
        //Obtener la suma de las calificaciones para calcular el promedio
        //Obtener calificación mínima y máxima del grupo
        for(int i=0; i<calificaciones.length; i++){
            total += calificaciones[i];
            if (minima > calificaciones[i])
                minima = calificaciones[i];
            if (maxima < calificaciones[i])
                maxima = calificaciones[i];
        }
        System.out.println("Calificaciones: " + Arrays.toString(calificaciones));
        System.out.println("Promedio del grupo: " + (total/calificaciones.length));
        System.out.println("Mínima: " + minima);
        System.out.println("Máxima " + maxima);
    }
}
