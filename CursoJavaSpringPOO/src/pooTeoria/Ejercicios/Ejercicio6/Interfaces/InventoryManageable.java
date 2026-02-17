package pooTeoria.Ejercicios.Ejercicio6.Interfaces;

import pooTeoria.Ejercicios.Ejercicio6.Clases.Product;

public interface InventoryManageable {
    void addItem(Product p);

    void deleteItem();
    void listItems();
    void findItemById();
}
