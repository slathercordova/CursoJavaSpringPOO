package pooTeoria.ClaseAbstracta;

public class Main {
    static void main(String[] args) {
        Figura figura1 = new Cuadrado("Rojo",10);
        Figura figura2 = new Circulo("Morado",5);

        System.out.println(figura1.area());
        System.out.println(figura2.area());

        Cuadrado cuadrado1 = new Cuadrado("Rojo",10);
        Figura figura3 = cuadrado1;
        System.out.println(figura3.area());
    }
}
