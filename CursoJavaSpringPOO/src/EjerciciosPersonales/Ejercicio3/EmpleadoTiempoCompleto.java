package EjerciciosPersonales.Ejercicio3;

import java.math.BigDecimal;

public class EmpleadoTiempoCompleto extends Empleado{
    private final BigDecimal veinte = new BigDecimal("20");
    private final BigDecimal treinta = new BigDecimal("30");
    private final BigDecimal cien = new BigDecimal("100");

    public EmpleadoTiempoCompleto(String nombre, BigDecimal salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public BigDecimal getBono() {
        return getSalarioBase().multiply(veinte).divide(cien);
    }

    @Override
    public BigDecimal getDescuento() {
        return getSalarioBase().multiply(treinta).divide(cien);
    }
}
