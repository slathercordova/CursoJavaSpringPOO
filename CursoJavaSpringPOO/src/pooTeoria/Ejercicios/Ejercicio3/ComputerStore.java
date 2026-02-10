package pooTeoria.Ejercicios.Ejercicio3;

import pooTeoria.Ejercicios.Ejercicio2.Computer;

import java.util.ArrayList;

import java.util.List;

public class ComputerStore {
    private ArrayList<Computer> c = new ArrayList<>();
    private String name;
    private String address;
    private int quantity;

    public ComputerStore(String name, String address) {
        this.name = name;
        this.address = address;
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

    public List<Computer> filtrarRam(int ramFiltro){
        List<Computer> resultado = c.stream().filter(i-> i.getRam()>=ramFiltro).toList();
        return resultado;
    }

    public void venderComputadora(String brand, String model){
        Computer comEnc = existeCompuLista(brand,model);
        if (comEnc!=null){
            c.remove(comEnc);
            quantity--;
            System.out.println("Se vendió la computadora "+comEnc.getBrand());
        }else {
            System.out.println("Error, la computadora ingresada no existe");
        }
    }

    public Computer existeCompuLista(String brand, String model){
        for (Computer con : c){
            if (brand.equals(con.getBrand()) && model.equals(con.getModel())){
                Computer comEnc = con;
                return comEnc;
            }
        }
        return null;
    }
}
