package Clase_2.Loops;

public class Ejercicio7 {
    static void main(String[] args) {
        //  Declarar un arreglo de 10 elementos e imprimir sus valores.
        int[] lista = new int[10];
        lista[0] = 1;
        lista[1] = 2;
        lista[2] = 3;
        lista[3] = 4;
        lista[4] = 5;
        lista[5] = 6;
        lista[6] = 7;
        lista[7] = 8;
        lista[8] = 9;
        lista[9] = 10;

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
}
