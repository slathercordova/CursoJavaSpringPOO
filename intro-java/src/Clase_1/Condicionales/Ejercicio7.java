package Clase_1.Condicionales;

import java.util.Scanner;

public class Ejercicio7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en °Centígrados");
        int centigrados = sc.nextInt();

        if (centigrados<0){
            System.out.println("Congelado");
        } else if (centigrados >= 0 && centigrados <= 10) {
            System.out.println("Muy frío");
        } else if (centigrados >= 11 && centigrados <= 20) {
            System.out.println("Frío");
        } else if (centigrados >= 21 && centigrados <= 30) {
            System.out.println("Normal");
        } else if (centigrados >= 31 && centigrados <= 40) {
            System.out.println("Caliente");
        }else {
            System.out.println("Muy caliente");
        }
    }
}
