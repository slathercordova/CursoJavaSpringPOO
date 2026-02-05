package Clase_1.Condicionales;

import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {
        int mayor = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3 ; i++) {
            System.out.println("Ingrese el "+i+"° número");
            int num = sc.nextInt();

            if (num >= mayor){
                mayor = num;
            }
        }
        System.out.println("El número mayor ingresado es "+mayor);
    }
}
