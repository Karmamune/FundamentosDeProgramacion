package tema4.t4e23;

/**
 *
 * @author Manuel
 */
public class Empleado {
    private String numero;
    private String nombre;
    private double sueldo;

    public Empleado(String numero, String nombre, double sueldo){
        this.numero = numero;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(numero);
        sb.append("\t").append(nombre);
        sb.append("\t\t").append(sueldo);
        return sb.toString();
    }
}
