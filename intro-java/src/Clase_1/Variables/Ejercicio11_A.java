package Clase_1.Variables;

import java.util.Scanner;

public class Ejercicio11_A {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaExtMin = 40;
        int costoHora = 40;
        int totPagar = 0;
        int totHoraExta = 0;

        System.out.println("Ingrese la cantidad de horas trabajadas");
        int totHora = sc.nextInt();

        //  Calculando horas extras
        if (totHora>40){
            totHoraExta = totHora-horaExtMin;
            if (totHoraExta <= 8){
                totPagar = (horaExtMin*costoHora) + totHoraExta*costoHora*2;
            }else {
                totPagar = (horaExtMin*costoHora) + (8*costoHora*2) + ((totHoraExta-8)*costoHora*3);
            }
        }else {
            totPagar = totHora*costoHora;
        }
        System.out.println("El total a pagar es "+totPagar);
    }
}
