package EjerciciosPersonales.Ejercicio1;

public class Caja {
    private double saldo;
    private String nombre;

    public Caja() {
    }

    public Caja(double saldo, String nombre) {
        this.saldo = saldo;
        this.nombre = nombre;
    }

    public void cobrar(TipoPago tipoPago, double monto){
        switch (tipoPago) {
            case TipoPago.TARJETA -> {
                PagoTarjeta PT = new PagoTarjeta();
                PT.procesarPago(monto);
            }
            case TipoPago.YAPE -> {
                PagoYape PY = new PagoYape();
                PY.procesarPago(monto);
            }
            case TipoPago.TRANSFERENCIA -> {
                PagoTransferencia PT = new PagoTransferencia();
                PT.procesarPago(monto);
            }
            default -> {
                }
        };
    }
}
