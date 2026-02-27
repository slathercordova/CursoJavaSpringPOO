package EjerciciosPersonales.Ejercicio1;

public class Main {
    static void main(String[] args) {
        Caja caja1 = new Caja(0,"Caja 1");
        caja1.cobrar(TipoPago.YAPE,500.50);
    }
}
