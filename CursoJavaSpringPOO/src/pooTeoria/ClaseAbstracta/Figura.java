package pooTeoria.ClaseAbstracta;

public abstract class Figura {
    protected String color;

    public Figura() {
    }
    public Figura(String color) {
        this.color = color;
    }

    public abstract double area();

}
