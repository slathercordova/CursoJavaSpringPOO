package Clase_1.Variables;

import java.util.Scanner;

public class Ejercicio12_A {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pagoFijo = 10;
        int prePrim50 = 0;
        double pre50y200 = 0.5;
        double preMas200 = 1.5;
        double totPagar = 0;
        int noCobrar = 50;
        int corte200 = 200;

        System.out.println("Ingrese el consumo de agua potable");
        double consumo = sc.nextDouble();

        if (consumo <= 50){
            totPagar = pagoFijo + consumo * prePrim50;
        } else if (consumo > 50 && consumo <= 200) {
            totPagar = pagoFijo + ((consumo - noCobrar) * pre50y200);
        } else if (consumo > 200) {
            totPagar = pagoFijo + ((corte200 - noCobrar) * pre50y200) + ((consumo - corte200)*preMas200);
        }
        System.out.println("El total a pagar es: "+totPagar);
    }
}
