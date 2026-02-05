package Clase_1.Condicionales;

import java.util.Scanner;

public class Ejercicio1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número");
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println("Numero es par");
        }else{
            System.out.println("Numero es impar");
        }
    }
}
