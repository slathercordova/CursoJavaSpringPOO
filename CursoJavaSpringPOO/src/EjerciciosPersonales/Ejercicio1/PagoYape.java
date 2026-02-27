package EjerciciosPersonales.Ejercicio1;

public class PagoYape implements Pago{
    public PagoYape() {
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado por yape por "+monto+" soles");
    }
}
