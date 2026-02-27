package EjerciciosPersonales.Ejercicio1;

public class PagoTarjeta implements Pago{
    public PagoTarjeta() {
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado por tarjeta por "+monto+" soles");
    }
}
