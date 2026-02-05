package Clase_1.Variables;

import java.util.Scanner;

public class Ejercicio13_A {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        double numRandomAux = Math.random()*100;
        int numRandom = (int)numRandomAux;
        boolean adivino = false;

        while (!adivino){
            System.out.println("Ingrese el número");
            int numIngre = sc.nextInt();

            if (numIngre == numRandom){
                adivino = true;
            } else if (numIngre > numRandom) {
                System.out.println("El número es menor");
            }else {
                System.out.println("El número es mayor");
            }
            intentos += 1;
        }
        System.out.println("Adivinaste el número "+numRandom+" en "+intentos+" intentos");
    }
}
