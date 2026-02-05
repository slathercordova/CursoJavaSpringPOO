package Clase_1.Condicionales;

import java.util.Scanner;

public class Ejercicio8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anio = sc.nextInt();

        if (anio%4==0){
            if (anio%100==0){
                if (anio%400==0){
                    System.out.println("Año bisiesto");
                }else {
                    System.out.println("Año NO ES bisiesto");
                }
            }else {
                System.out.println("Año bisiesto");
            }
        }else {
            System.out.println("Año NO ES bisiesto");
        }
    }
}
