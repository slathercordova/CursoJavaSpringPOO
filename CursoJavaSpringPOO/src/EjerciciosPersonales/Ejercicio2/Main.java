package EjerciciosPersonales.Ejercicio2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cb1 = new CuentaBancaria("ABCD-123458VV","Slather Córdova",new BigDecimal("-1"));
        System.out.println(cb1);
        cb1.retirar(new BigDecimal("1000"));
        System.out.println(cb1);
        cb1.depositar(new BigDecimal("100"));
        cb1.retirar(new BigDecimal("105"));
        System.out.println(cb1);
    }
}
