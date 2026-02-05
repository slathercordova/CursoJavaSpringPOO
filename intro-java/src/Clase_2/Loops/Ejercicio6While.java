package Clase_2.Loops;

public class Ejercicio6While {
    static void main(String[] args) {
        //  Imprimir los numeros del 1 al 100, excepto los multiplos de 3 y 5.
        int a = 1;
        while (a <= 100){
            if (a%3!=0 && a%5!=0){
                System.out.println(a);
            }
            a++;
        }
    }
}
