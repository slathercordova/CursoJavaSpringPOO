package pooTeoria.Ejercicios.Ejercicio6.Clases;

public class Main {
    static void main(String[] args) {
        Inventory inventario = new Inventory();

        Product producto1 = new Electronics("1", 5500, "SAMSUNG", "GALAXY S25 ULTRA");
        Product producto2 = new Clothing("2", 66.66, "M", "Algodon");

        inventario.addItem(producto1);
        inventario.addItem(producto2);
        System.out.println(inventario.toString());
    }
}
