package Clase_1.Variables;

import java.util.Scanner;

public class Ejercicio9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de dólares");
        double dolares = sc.nextDouble();
        double cambioDolar = 3.50;
        System.out.println(dolares + " dolares son "+dolares*cambioDolar+" soles");
    }
}
