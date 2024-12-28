package tema3;

/**
 *
 * @author Manuel
 */
public class T3_E13_Ciclo {
    public static void main(String[] args){

        /*
        este programa tiene la función de llevar a cabo
        un ciclo donde se repiten las operaciones ingresadas
        hasta que uno de los valores alcanza el máximo permitido
        por la condición
        */

        int a = 3, b = 8, c = 4;

        do{
            a*=c; //
            b+=a;
            c++;
        }while(a<72);

        System.out.printf("a = %d\nb = %d\nc = %d", a, b, c);
    }
}
