package Clase_2.Loops;

public class Ejercicio5 {
    static void main(String[] args) {
        //  Imprimir los numeros del 1 al 100, excepto los multiplos de 3.
        for (int i = 1; i < 100 ; i++) {
            if (i%3!=0){
                System.out.println(i);
            }
        }
    }
}
