package EjerciciosPersonales.Ejercicio5;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos;

    public Pedido() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public BigDecimal calcularTotal(){
        BigDecimal total = BigDecimal.ZERO;
        for (Producto p : productos){
            total = total.add(p.getPrecio());
        }
        return total;
    }
}
