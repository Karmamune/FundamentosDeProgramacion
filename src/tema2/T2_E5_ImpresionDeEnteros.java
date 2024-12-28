package tema2;

/**
 *
 * @author Manuel
 */
public class T2_E5_ImpresionDeEnteros {
    public static void main(String[] args){

        System.out.printf("%d\n", 22);
        System.out.printf("%d\n", +22);
        System.out.printf("%d\n", -22);
        //Redondeo de valores de punto flotante a un número indicado de posiciones decimales
        System.out.printf("%9.3f", 123.456789);
        //Impresión de números de punto flotante
        System.out.printf("%e\n", 12345678.9);
        System.out.printf("%e\n", +12345678.9);
        System.out.printf("%e\n", -12345678.9);
        System.out.printf("%E\n", 12345678.9);
        System.out.printf("%f\n", 12345678.9);
        System.out.printf("%g\n", 12345678.9);
        System.out.printf("%G\n", 12345678.9);
    }
}
