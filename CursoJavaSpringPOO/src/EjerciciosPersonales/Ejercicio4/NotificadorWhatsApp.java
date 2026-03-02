package EjerciciosPersonales.Ejercicio4;

public class NotificadorWhatsApp implements Notificador{
    @Override
    public void enviar(String mensaje) {
        System.out.println("WhatsApp enviado: " + mensaje);
    }
}
