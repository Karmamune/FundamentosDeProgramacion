package tema2;

import java.util.Calendar;

/**
 *
 * @author Manuel
 */
public class T2_E6_ImpresionDeFechas {
    public static void main(String[] args){

        //obtener la fecha y hora actuales
        Calendar fechaHora = Calendar.getInstance();
        //Impresión con caracteres de conversión para composiciones de fecha/hora
        System.out.printf("%tc\n", fechaHora);
        System.out.printf("%tF\n", fechaHora);
        System.out.printf("%tD\n", fechaHora);
        System.out.printf("%tr\n", fechaHora);
        System.out.printf("%tT\n", fechaHora);
        //Impresión con caracteres de conversión para fechas
        System.out.printf("%1$tA, %1$tB, %1$td, %1$tY\n", fechaHora);
        System.out.printf("%1$TA, %1$TB, %1$Td, %1$TY\n", fechaHora);
        System.out.printf("%1$ta, %1$tb, %1$td, %1$ty\n", fechaHora);
        //Impresión con caracteres de conversión para horas
        System.out.printf("%1$tH:%1$tM:%1$tS\n", fechaHora);
    }
}
