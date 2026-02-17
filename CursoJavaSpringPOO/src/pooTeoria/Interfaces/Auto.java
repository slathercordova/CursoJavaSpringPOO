package pooTeoria.Interfaces;

public class Auto implements Vehiculo{

    @Override
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando...");
    }
}
