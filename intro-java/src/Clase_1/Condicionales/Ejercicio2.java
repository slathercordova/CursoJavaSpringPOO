package Clase_1.Condicionales;

import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de n");

        int n = sc.nextInt();

        if(n>0){
            System.out.println("Positivo");
        } else if (n<0) {
            System.out.println("Negativo");
        }else {
            System.out.println("Zero");
        }
    }
}
