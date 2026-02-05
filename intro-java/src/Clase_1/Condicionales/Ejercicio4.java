package Clase_1.Condicionales;

import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println("Iguales");
        }else {
            System.out.println("Diferentes");
        }
    }

}
