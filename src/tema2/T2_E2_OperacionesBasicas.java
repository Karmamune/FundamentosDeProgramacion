package tema2;

public class T2_E2_OperacionesBasicas {
    public static void main(String[] args){

        byte n1 = 100, n2 = 20;
        int res;

        System.out.println("El resultado de la suma de " +n1+ " + " +n2+ " es igual a " +(res = n1 + n2));
        System.out.println("El resultado de la resta de " +n1+ " - " +n2+ " es igual a " +(res = n1 - n2));
        System.out.println("El resultado de la multiplicación de " +n1+ " * " +n2+ " es igual a " +(res = n1 * n2));
    }
}
