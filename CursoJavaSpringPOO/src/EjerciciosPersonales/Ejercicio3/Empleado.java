package EjerciciosPersonales.Ejercicio3;

import java.math.BigDecimal;

public abstract class Empleado {
    private String nombre;
    private final BigDecimal salarioBase;

    public Empleado(String nombre, BigDecimal salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public BigDecimal calcularSalarioFinal(){
        //  obtener bono del tipo de empleado
        BigDecimal bono = getBono();
        //  restar descuentos del tipo de empleado
        BigDecimal descuento = getDescuento();
        //  Retornar salarioBase + bono - descuento
        BigDecimal salFinal = salarioBase.add(bono).subtract(descuento);
        return salFinal;
    }

    public abstract BigDecimal getBono();

    public abstract BigDecimal getDescuento();

    public String getNombre() {
        return nombre;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }
}
