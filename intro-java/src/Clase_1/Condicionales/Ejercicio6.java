package Clase_1.Condicionales;

import java.util.Scanner;

public class Ejercicio6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota de matemáticas");
        float notaM = sc.nextFloat();
        System.out.println("Ingrese la nota de física");
        float notaF = sc.nextFloat();
        System.out.println("Ingrese la nota de Química");
        float notaQ = sc.nextFloat();

        if ((notaM >= 65 && notaF >= 55 && notaQ >= 50) || (notaM+notaF >= 140)){
            System.out.println("Admitido");
        }else {
            System.out.println("No Admitido");
        }
    }
}
