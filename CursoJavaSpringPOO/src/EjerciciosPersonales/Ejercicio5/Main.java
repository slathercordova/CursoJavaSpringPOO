package EjerciciosPersonales.Ejercicio5;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Monitor wide screen 34'",new BigDecimal(3500));
        Producto p2 = new Producto("CPU gamer 16gb ram, 1 tb ssd'",new BigDecimal(7500));
        Pedido ped = new Pedido();
        ped.agregarProducto(p1);
        ped.agregarProducto(p2);
        System.out.println("El total es S/."+ped.calcularTotal());
    }
}
