package pooTeoria.Ejercicios.Ejercicio6.Clases;

import pooTeoria.Ejercicios.Ejercicio6.Interfaces.InventoryManageable;

import java.util.ArrayList;
import java.util.Arrays;

public class Inventory implements InventoryManageable {
    ArrayList<Product> listaProductos;

    public Inventory() {
        listaProductos = new ArrayList<>();
    }

    public Inventory(ArrayList<Product> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ArrayList<Product> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Product> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public void addItem(Product p) {
        listaProductos.add(p);
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

    @Override
    public String toString() {
        return "Inventory{" +
                "listaProductos=" + listaProductos+
                '}';
    }
}
