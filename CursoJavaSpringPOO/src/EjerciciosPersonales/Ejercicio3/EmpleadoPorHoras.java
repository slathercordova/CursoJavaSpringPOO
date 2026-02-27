package EjerciciosPersonales.Ejercicio3;

import java.math.BigDecimal;

public class EmpleadoPorHoras extends Empleado{
    private final BigDecimal cinco = new BigDecimal("5");
    private final BigDecimal quince = new BigDecimal("15");
    private final BigDecimal cien = new BigDecimal("100");

    public EmpleadoPorHoras(String nombre, BigDecimal salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public BigDecimal getBono() {
        return getSalarioBase().multiply(cinco).divide(cien);
    }

    @Override
    public BigDecimal getDescuento() {
        return getSalarioBase().multiply(quince).divide(cien);
    }
}
