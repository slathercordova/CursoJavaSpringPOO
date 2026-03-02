package EjerciciosPersonales.Ejercicio4;

public class NotificadorEmail implements Notificador{
    @Override
    public void enviar(String mensaje) {
        System.out.println("Email enviado: " + mensaje);
    }
}
