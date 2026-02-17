package pooTeoria.Ejercicios.Ejercicio6.Clases;

import pooTeoria.Ejercicios.Ejercicio6.Interfaces.InventoryManageable;

public class Clothing extends Product implements InventoryManageable {
    private String size;
    private String material;

    public Clothing(String productId, double price, String size, String material) {
        super(productId, price);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    @Override
    public void addItem(Product p) {

    }

    @Override
    public void deleteItem() {

    }

    @Override
    public void listItems() {

    }

    @Override
    public void findItemById() {

    }
}
