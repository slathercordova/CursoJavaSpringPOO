package Clase_1.Condicionales;

import java.util.Scanner;

public class IfElse {
    static void main(String[] args) {
        /*
        Ingrese la edad de una persona, imprima mayor o menor de edad dependiendo de la edad 18
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la edad");
        int edad = sc.nextInt();
        if (edad>=18){
            System.out.println("Mayor de edad");
        }else{
            System.out.println("Menor de edad");
        }
    }
}
