package EjerciciosPersonales.Ejercicio1;

public class PagoTransferencia implements Pago{
    public PagoTransferencia() {
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado por transferencia por "+monto+" soles");
    }
}
