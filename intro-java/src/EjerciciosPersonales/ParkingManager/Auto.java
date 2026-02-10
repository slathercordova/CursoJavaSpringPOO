package EjerciciosPersonales.ParkingManager;

public class Auto {
    private int id;
    private String placa;
    private String marca;
    private boolean ingresado;

    public Auto(int id, String placa, String marca) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean getIngresado() {
        return ingresado;
    }

    public void setIngresado(boolean ingresado) {
        this.ingresado = ingresado;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", ingresado=" + ingresado +
                '}';
    }
}
