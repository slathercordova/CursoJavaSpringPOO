package pooTeoria.Ejercicios.Ejercicio6.Clases;

import pooTeoria.Ejercicios.Ejercicio6.Interfaces.InventoryManageable;

public class Electronics extends Product implements InventoryManageable {
    private String brand;
    private String model;

    public Electronics(String productId, double price, String brand, String model) {
        super(productId, price);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
