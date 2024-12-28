package tema1;

/**
 *
 * @author Manuel
 */
public class T1_E1_If {
    public static void main(String[] args){

        byte meses = 9, segundos = 59, edad =19;
        String nombre = "Manuel Eduardo García López", mes = "Septiembre";
        boolean verificacion = false;

        System.out.println("Mi nombre es: " +nombre+ "\nMi edad es:  " +edad+ " años\nNací en el mes: " +meses+ " (" +mes+ ")\nSegundos: " +segundos+ "\nValor booleano: " +verificacion);

        if(verificacion)
            System.out.println("La respuesta es verdadera o true");
        else
            System.out.println("La respuesta es falsa o false");

        if(edad>18){
            System.out.println("Eres un adulto\nTu edad es: " +edad+ " años");
        }
        else
            System.out.println("Todavía eres menor de edad");
    }
}
