package Clase_2.Loops;

import java.util.Scanner;

public class Ejercicio14 {
    static void main(String[] args) {
        /*
        Dado un número entero n, realizar las siguientes operaciones:

        Si n es par, dividirlo entre 2.
        Si n es impar, multiplicarlo por 3 y sumar 1.
        Repetir el proceso hasta que n sea 1.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número...");
        int numero = sc.nextInt();

        while (numero!=1){
            if (numero%2==0){
                numero = numero/2;
            }else {
                numero = numero*3+1;
            }
            System.out.println(numero);
        }
    }
}
