package tema2;

public class T2_E1_PrintfYTablas {
    public static void main(String[] args){

        //usando diferentes diagonales inversas para cambiar el texto que se imprime

        System.out.println("Bienvenidos\t a \t la"
        + "\nprogramación en Java");

        System.out.println("Manuel Eduardo García López alias \"Alumno\" ");

        System.out.println("Manuel\tEduardo\tGarcía\tLópez\talias\t\"Alumno\"\n");

        //creando tablas con printf

        String col1 = "Nombre1", col2 = "Nombre2", col3 = "ApellidoP", col4 = "ApellidoM", col5 = "Alias";
        System.out.printf("%-16s %-15s %-15s %-15s %-15s \n", col1, col2, col3, col4, col5);

        String nom1 = "Manuel", nom2 = "Eduardo", ape_p = "García", ape_m = "López", alias = "Alumno";
        System.out.printf("%-16s %-15s %-15s %-15s %-15s \n\n", nom1, nom2, ape_p, ape_m, alias);

        String col01 = "Nombre", col02 = "Edad", col03 = "Peso en kg", col04 = "Altura en cm", nom_com = "Manuel Eduardo García López";
        byte edad = 19, peso = 65;
        int altura = 180;
        System.out.printf("%-32s %-15s %-15s %-15s \n%-32s %-15s %-15s %-15s", col01, col02, col03, col04, nom_com, edad, peso, altura);
    }
}
