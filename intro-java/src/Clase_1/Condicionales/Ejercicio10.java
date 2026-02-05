package Clase_1.Condicionales;

import java.util.Scanner;

public class Ejercicio10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto");
        double precio = sc.nextDouble();

        System.out.println("Ingrese el peso del producto");
        double peso = sc.nextDouble();

        if (precio>100 && peso > 10){
            System.out.println("Premiun");
        } else if (precio>100 && peso <= 10) {
            System.out.println("Normal");
        }else {
            System.out.println("Económico");
        }
    }
}
