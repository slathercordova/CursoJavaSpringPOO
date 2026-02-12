package pooTeoria.ClaseAbstracta;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double area(){
        return Math.pow(lado,2);
    }
}
