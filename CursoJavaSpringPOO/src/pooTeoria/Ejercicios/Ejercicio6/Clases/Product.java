package pooTeoria.Ejercicios.Ejercicio6.Clases;

import pooTeoria.Ejercicios.Ejercicio6.Interfaces.Priceable;

public abstract class Product implements Priceable{
    private String productId;
    private double price;

    public Product(String productId, double price) {
        this.productId = productId;
        this.price = price;
    }

    @Override
    public void getPrice(){

    };

    @Override
    public void setPrice() {

    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", price=" + price +
                '}';
    }
}
