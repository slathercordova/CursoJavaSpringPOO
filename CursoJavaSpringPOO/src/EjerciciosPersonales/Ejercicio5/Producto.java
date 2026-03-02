package EjerciciosPersonales.Ejercicio5;

import java.math.BigDecimal;

public class Producto {
    private String nombre;
    private BigDecimal precio;

    public Producto(String nombre, BigDecimal precio) {
        if (nombre==null) throw new IllegalArgumentException("Nombre del producto no puede ser nulo");
        if (nombre.isBlank()) throw new IllegalArgumentException("Nombre del producto no puede estar vacío");
        if (precio.compareTo(BigDecimal.ZERO)<0) throw new IllegalArgumentException("Precio del producto no puede ser negativo");
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }
}
