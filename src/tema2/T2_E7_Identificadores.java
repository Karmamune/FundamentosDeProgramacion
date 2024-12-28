package tema2;

/**
 *
 * @author Manuel
 */
public class T2_E7_Identificadores {
    public static void main(String[] args){

        String color = "azul", mes = "noviembre", tipo_de_sangre = "-A";
        int edad = 19, dia_del_año = 128, alumnos = 5000;
        char sexo = 'M', estado_civil = 'S', inicial = 'M';
        byte alumnos_por_salon = 45, dia_del_mes = 31, numero_de_mes = 9;
        boolean mayor_de_edad = true, preparatoria_terminada = true, materia_acreditada = true;
        short año = 2023, estados_de_un_pais = 32, numero_de_paises = 195;
        long distancia = 384400, velocidad = 300000000, energia = 17182;
        float vehiculos_por_pais = 764807F, poblacion = 8000000F, asistentes = 540F;
        double volumen = 53.4, masa = 58.65, altura = 1.80;

        System.out.printf("Variables String\n Color: %s\n Mes: %s\n Tipo de sangre: \"%s\"\n\n", color, mes, tipo_de_sangre);
        System.out.printf("Variables int\n Edad: %d años\n Dia del año: %d\n Alumnos: %d\n\n", edad, dia_del_año, alumnos);
        System.out.printf("Variables char\n Sexo: %c\n Estado civil: %c\n Inicial: %c\n\n", sexo, estado_civil, inicial);
        System.out.printf("Variables byte\n Alumnos por salón: %d\n Día del mes: %d\n Número de mes: %d\n\n", alumnos_por_salon,dia_del_mes, numero_de_mes);
        System.out.printf("Variables boolean\n Mayor de edad: %s\n Preparatoria terminada: %s\n Materia acreditada:%s\n\n", mayor_de_edad, preparatoria_terminada, materia_acreditada);
        System.out.printf("Variables short\n Año: %d\n Estados de un país: %d\n Número de países: %d\n\n", año, estados_de_un_pais, numero_de_paises);
        System.out.printf("Variables long\n Distancia: %d\n Velocidad: %d\n Energía: %d\n\n", distancia, velocidad, energia);
        System.out.printf("Variables float\n Vehículos por país: %.0f\n Población: %.0f\n Asistentes: %.0f\n\n", vehiculos_por_pais, poblacion, asistentes);
        System.out.printf("Variables double\n Volumen: %.1f\n Masa: %.2f\n Altura: %.2f metros", volumen, masa, altura);
    }
}
