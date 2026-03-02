package EjerciciosPersonales.Ejercicio4;

public class ServicioAlerta {
    private Notificador noti;

    public ServicioAlerta(Notificador noti) {
        this.noti = noti;
    }

    public void alertar(String mensaje){
        this.noti.enviar(mensaje);
    }
}
