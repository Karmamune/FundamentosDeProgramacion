package tema4.t4e24;

/**
 *
 * @author Manuel
 */
public class Vehiculo {
    String marca, color;
    int año;

    public Vehiculo(String marca, String color, int año){
        this.marca = marca;
        this.color = color;
        this.año = año;
    }

    @Override
    public String toString(){
        String valor;
        valor = marca + "\t\t" + color + "\t\t" + año;
        return valor;
    }
}
