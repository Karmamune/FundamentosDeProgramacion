package tema4.t4e23;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T4_E23_UsoDeClases {
    public static void main(String[] args) {

        //Se crea referencia al objeto empleado (memoria)
        Empleado empleado;
        Empleado trabajadores[] = new Empleado[4];
        Scanner teclado = new Scanner(System.in);
        //se recorre el arreglo trabajadores para guardar objetos de tipo empleado
        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println("Proporcione número de empleado, nombre y sueldo");
            empleado = new Empleado(teclado.next(), teclado.next(), teclado.nextDouble());
            trabajadores[i] = empleado;
        }

        //Se recorre el arreglo trabajadores para mostrar la información de empleados
        System.out.println("\nMOSTRANDO LA LISTA DE EMPLEADOS");
        System.out.println("NÚMERO\tNOMBRE\tSUELDO");
        for (Empleado trabajador : trabajadores)
            System.out.println(trabajador.toString());
    }
}
