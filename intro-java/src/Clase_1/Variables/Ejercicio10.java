package Clase_1.Variables;

import java.util.Scanner;

public class Ejercicio10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de dólares");
        double dolares = sc.nextDouble();

        System.out.println("Ingrese el tipo de cambio en soles");
        double cambioDolar = sc.nextDouble();
        System.out.println(dolares + " dolares son "+dolares*cambioDolar+" soles");
    }
}
