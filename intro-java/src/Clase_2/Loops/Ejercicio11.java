package Clase_2.Loops;

import java.util.Scanner;

public class Ejercicio11 {
    static void main(String[] args) {
        /*
          Declarar un arreglo de n elementos y buscar un valor x en el arreglo.
           En caso de encontrarlo, imprimir su posición, en caso de no encontrarlo,
            imprimir "No encontrado".
         */
        int[] lista = {1,4,2,5,7,8,11,3,9,5};
        Scanner sc = new Scanner(System.in);
        boolean encontrado = false;

        System.out.println("Ingrese el número a buscar");
        int numBuscado = sc.nextInt();
        int posicion = 0;

        for (int i = 0; i < lista.length; i++) {
            if (numBuscado == lista[i]){
                encontrado = true;
                posicion = i;
            }
            if (encontrado){
                break;
            }
        }

        if (encontrado){
            System.out.println("Se encontró en la posición "+posicion);
        }else {
            System.out.println("No encontrado");
        }
    }
}
