package tema4.t4e25;

/**
 *
 * @author Manuel
 */
public class Jugador {
    
    /*
    Cree una clase que permita almacenar los datos de un jugador de basquetbol,
    como son: nombre, edad, teléfono, sexo y altura. Que el programa imprima el sexo
    y la altura del jugador.
     */

    String nombre, telefono, sexo;
    int edad, altura;

    public Jugador(String nombre, int edad, String telefono, String sexo, int altura){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.sexo = sexo;
        this.altura = altura;
    }

    @Override
    public String toString(){
        String valor;
        valor = nombre + "\t\t" + edad + "\t\t" + telefono + "\t\t" + sexo + "\t\t" + altura;
        return valor;
    }
}
