package tema2;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class T2_E11_Salario {
    public static void main(String[] args){

        Scanner entrada = new Scanner (System.in); //En esta parte el programa lee el dato introducido
        double horas, tarifa, sueldo_bruto, tasa_imp, salario; //Aquí están definidas las variables que se van a utilizar
        int repetir;

        do{

            System.out.println("Ingrese las horas trabajadas, la tarifa horaria, y la tasa de impuestos\n"); //Esto es para que el programa muestre lo que se solicita ingresar

            horas=entrada.nextDouble(); //Aquí se asigna el dato introducido anteriormente a una de las variables definidas
            tarifa=entrada.nextDouble();
            tasa_imp=entrada.nextDouble();

            sueldo_bruto=horas*tarifa; //Esta es la operación para sacar el pago bruto
            salario=sueldo_bruto-(sueldo_bruto*tasa_imp/100);

            System.out.printf("El pago neto del trabajador es de %.2f", salario); //Aquí es donde se muestra el pago neto en el programa

            System.out.println("\n\n¿Quiere sacar otro sueldo?\n\n(0) Sí\n(1) No\n");
            repetir=entrada.nextInt();

        }while(repetir==0);
    }
}
