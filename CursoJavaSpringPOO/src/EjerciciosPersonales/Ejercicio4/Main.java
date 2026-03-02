package EjerciciosPersonales.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Notificador noti1 = new NotificadorWhatsApp();
        ServicioAlerta sa = new ServicioAlerta(noti1);
        sa.alertar("Prueba de mensaje enviado por whatsapp");
    }
}
