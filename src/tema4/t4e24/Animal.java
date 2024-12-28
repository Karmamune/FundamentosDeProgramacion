package tema4.t4e24;

/**
 *
 * @author Manuel
 */
public class Animal {
    String especie, tipo_de_alimentacion, peligro_de_extincion;

    public Animal(String esp, String alimento, String riesgo){
        especie = esp;
        tipo_de_alimentacion = alimento;
        peligro_de_extincion = riesgo;
    }

    @Override
    public String toString(){
        String valor;
        valor = especie + "\t\t" + tipo_de_alimentacion + "\t\t" + peligro_de_extincion;
        return valor;
    }
}
