package pooTeoria;

public class Computer {
    String brand;
    String model;
    int ram;
    int storage;

    public Computer(){

    }

    public Computer(String brand, String model, int ram, int storage) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                '}';
    }
}
