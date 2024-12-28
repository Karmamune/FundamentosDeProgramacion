package tema4.t4e24;

/**
 *
 * @author Manuel
 */
public class Main {
    public static void main(String[] args){

    Computadora com1 = new Computadora(16, 4, 3000);
    Computadora com2 = new Computadora(32, 2, 512);
    System.out.println("Datos tipo computadora:\n");
    System.out.println("Ram\t\tVram\t\tAlmacenamiento");
    String dato = com1.toString();
    System.out.println(dato);
    String dato2 = com2.toString();
    System.out.println(dato2+"\n\n");

    Vehiculo veh1 = new Vehiculo("Toyota", "Blanco", 1991);
    Vehiculo veh2 = new Vehiculo("Subaru", "Azul", 2023);
    System.out.println("Datos tipos vehículo:\n");
    System.out.println("Marca\t\tColor\t\tAño");
    System.out.println(veh1.toString());
    System.out.println(veh2.toString()+"\n\n");

    Juguete jug1 = new Juguete("Madera", "Azul", "Mediano");
    Juguete jug2 = new Juguete("Plast.", "Rojo", "Pequeño");
    System.out.println("Datos tipo juguete:\n");
    System.out.println("Mat.\t\tColor\t\tTamaño");
    System.out.println(jug1.toString());
    System.out.println(jug2.toString()+"\n\n");

    Animal ani1 = new Animal("Canino", "Carnívoro", "No");
    Animal ani2 = new Animal("Felino", "Carnívoro", "No");
    System.out.println("Datos tipo animal:\n");
    System.out.println("Especie\t\tAlimentación\t\tRiesgo");
    System.out.println(ani1.toString());
    System.out.println(ani2.toString());
    
    }
}
