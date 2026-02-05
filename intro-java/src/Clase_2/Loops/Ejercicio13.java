package Clase_2.Loops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio13 {
    static void main(String[] args) {
        //  Crea un programa que imprima la tabla de multiplicar del 1 al 10.
        int[] lista1 = new int[10];
        int[] lista2 = new int[12];

        for (int i = 0; i < lista1.length; i++) {
            lista1[i] = i+1;
        }

        for (int i = 0; i < lista2.length; i++) {
            lista2[i] = i+1;
        }

        System.out.println(Arrays.toString(lista1));
        System.out.println(Arrays.toString(lista2));

        for (int i = 0; i < lista1.length; i++) {
            System.out.println("Tabla de multiplicación del "+lista1[i]);
            for (int j = 0; j < lista2.length; j++) {
                System.out.println(lista1[i]+"x"+lista2[j]+"="+lista1[i]*lista2[j]);
            }
            System.out.println("");
        }
    }
}
