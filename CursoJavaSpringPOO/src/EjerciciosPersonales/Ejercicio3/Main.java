package EjerciciosPersonales.Ejercicio3;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new EmpleadoTiempoCompleto("Slather Córdova",new BigDecimal("6000"));
        System.out.println("Salio final de: "+emp1.getNombre()+" - S/."+emp1.calcularSalarioFinal());
        Empleado emp2 = new EmpleadoPorHoras("Claudia Flores",new BigDecimal("2150"));
        System.out.println("Salio final de: "+emp2.getNombre()+" - S/."+emp2.calcularSalarioFinal());
    }
}
