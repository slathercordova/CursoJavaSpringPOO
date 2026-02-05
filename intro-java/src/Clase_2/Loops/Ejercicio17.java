package Clase_2.Loops;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {
    static void main(String[] args) {
        //  Dada una matriz de n x m elementos. Debes de encontrar el valor máximo de la matriz.
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese la cantidad de filas");
        int filas = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        int columnas = sc.nextInt();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(1,100);
            }
        }

        System.out.println(matriz);
        System.out.println(Arrays.toString(matriz));
        System.out.println(Arrays.deepToString(matriz));

        int mayor = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (mayor < matriz[i][j]){
                    mayor = matriz[i][j];
                }
            }
        }

        System.out.println("Mayor encontrado "+mayor);
    }
}
