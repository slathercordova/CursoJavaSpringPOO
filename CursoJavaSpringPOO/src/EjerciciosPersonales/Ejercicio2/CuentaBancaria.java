package EjerciciosPersonales.Ejercicio2;

import java.math.BigDecimal;

public class CuentaBancaria {
    private final String numeroCuenta;
    private String titular;
    private BigDecimal saldo = BigDecimal.ZERO;
    private final static BigDecimal cero = BigDecimal.ZERO;

    public CuentaBancaria(String numeroCuenta, String titular, BigDecimal saldo) {
        validarSaldo(saldo);
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    private void validarSaldo(BigDecimal monto){
        if (monto.compareTo(cero)<0) throw new IllegalArgumentException("El monto ingresado no puede ser negativo...");
        if (saldo.subtract(monto).compareTo(cero)<0) throw new IllegalArgumentException("El saldo es insuficiente, intente nuevamente...");
    }

    public void depositar(BigDecimal monto){
        validarSaldo(monto);
        this.saldo = this.saldo.add(monto);
    }

    public void retirar(BigDecimal monto){
        validarSaldo(monto);
        this.saldo = saldo.subtract(monto);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
