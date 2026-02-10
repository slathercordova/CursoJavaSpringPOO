package pooTeoria.Ejercicios.Ejercicio3;

import pooTeoria.Computer;

import java.util.ArrayList;

public class ComputerStore {
    private ArrayList<Computer> c = new ArrayList<>();
    private String name;
    private String address;
    private int quantity;

    public ComputerStore(String name, String address) {
        this.name = name;
        this.address = address;
        this.quantity = quantity;
    }

    public ArrayList<Computer> getC() {
        return c;
    }

    public void setC(ArrayList<Computer> c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void agregarComputer(Computer con){
        //Computer com = new Computer();
        c.add(con);
        quantity++;
    }

    @Override
    public String toString() {
        return "ComputerStore{" +
                "c=" + c +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public int totalComputadoras(){
        return c.size();
    }
}
