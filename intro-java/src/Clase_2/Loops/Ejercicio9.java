package Clase_2.Loops;

public class Ejercicio9 {
    static void main(String[] args) {
        //  Declarar un arreglo de 10 elementos e imprimir la suma de sus valores.
        int[] lista = new int[10];
        int suma = 0;

        for (int i = 0; i < lista.length ; i++) {
            double aleatorio = Math.random()*100;
            lista[i] = (int)aleatorio;
        }

        System.out.println("==========================");
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
            suma += lista[i];
        }
        System.out.println("==========================");

        System.out.println(suma);
    }
}
