package Clase_1.Condicionales;

import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número");
        int n = sc.nextInt();

        if (n%3==0 && n%5==0){
            System.out.println("Múltiplo de 3 y 5");
        } else if (n%5==0) {
            System.out.println("Múltiplo de 5");
        } else if (n%3==0) {
            System.out.println("Múltiplo de 3");
        }else {
            System.out.println("No es múltiplo de 3 ni de 5");
        }
    }
}
