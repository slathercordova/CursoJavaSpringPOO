package Clase_1.Condicionales;

import java.util.Scanner;

public class Ejercicio9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de clases asistidas");
        int claAsis = sc.nextInt();

        System.out.println("Ingrese la cantidad total de clases");
        int totCla = sc.nextInt();

        if ((double)claAsis/totCla*100>=75){
            System.out.println("Asistencia suficiente");
        }else {
            System.out.println("Asistencia insuficiente");
        }
    }
}
