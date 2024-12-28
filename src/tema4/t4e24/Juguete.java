package tema4.t4e24;

/**
 *
 * @author Manuel
 */
public class Juguete {
    String material, color, tamaño;

    public Juguete(String mat, String col, String tam){
        material = mat;
        color = col;
        tamaño = tam;
    }

    @Override
    public String toString(){
        String valor;
        valor = material + "\t\t" + color + "\t\t" + tamaño;
        return valor;
    }
}
