package EjerciciosPersonales.ParkingManager;

import java.util.ArrayList;

public class ParkingManager {
    private ArrayList<Auto> autos = new ArrayList<>();
    private final int capacidadMaxima = 5;
    private int contadorId;
    private int totalIngresos;
    private int totalSalidas;
    private int simultaneos;
    private static int totalParkings;
    private String nombre;

    public ParkingManager() {
        totalParkings++;
    }

    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getContadorId() {
        return contadorId;
    }

    public void setContadorId(int contadorId) {
        this.contadorId = contadorId;
    }

    public int getTotalIngresos() {
        return totalIngresos;
    }

    public void setTotalIngresos(int totalIngresos) {
        this.totalIngresos = totalIngresos;
    }

    public int getTotalSalidas() {
        return totalSalidas;
    }

    public void setTotalSalidas(int totalSalidas) {
        this.totalSalidas = totalSalidas;
    }

    public int getSimultaneos() {
        return simultaneos;
    }

    public void setSimultaneos(int simultaneos) {
        this.simultaneos = simultaneos;
    }

    public static int getTotalParkings() {
        return totalParkings;
    }

    public static void setTotalParkings(int totalParkings) {
        ParkingManager.totalParkings = totalParkings;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public synchronized Auto registrarAuto(String placa, String marca){
        int indexEncontrado = existeAutoLista(placa);
        if (simultaneos+1 <= capacidadMaxima){
            if (indexEncontrado>=0){
                Auto autoTmp = autos.get(indexEncontrado);
                ingresarAuto(autoTmp);
                return autoTmp;
            }else {
                Auto a = new Auto(nextID(),placa,marca);
                autos.add(a);
                ingresarAuto(a);
                return a;
            }
        }else {
            throw new IllegalStateException("Ya no queda espacio para más autos");
        }
    }

    public int existeAutoLista(String placa){
        for (int i = 0; i < autos.size() ; i++) {
            if (autos.get(i).getPlaca().equals(placa)){
                return i;
            }
        }
        return -1;
    }

    public void ingresarAuto(Auto auto){
        if (!auto.getIngresado()){
            auto.setIngresado(true);
            totalIngresos++;
            simultaneos++;
            System.out.println("se agregó el auto: "+auto.getPlaca());
        }
    }

    public void retirarAuto(String placa){
        boolean existe = false;
        for (Auto a : autos){
            if (a.getPlaca().equals(placa)) {
                existe = true;
                if (a.getIngresado()){
                    a.setIngresado(false);
                    totalSalidas++;
                    simultaneos--;
                    System.out.println("Se retiró el auto de placa: "+a.getPlaca());
                }else {
                    System.out.println("El auto de placa "+a.getPlaca()+" no está ingresado en parking");
                }
            }
        }
        if (!existe){
            System.out.println("La placa "+placa+" ingresada no existe");
        }
    }

    public int nextID(){
        return ++contadorId;
    }

    public void mostrarAutosDentro(){
        System.out.println("Los autos que están dentro son: ");
        for (Auto a : autos){
            if (a.getIngresado()==true){
                System.out.println(a.toString());
            }
        }
    }

    public void resumen(){
        System.out.println("=========================");
        System.out.println("RESUMEN DEL PARKING "+nombre);
        System.out.println("=========================");
        System.out.println("Capacidad disponible: "+ (capacidadMaxima-simultaneos));
        System.out.println("Autos dentro: "+ simultaneos);
        System.out.println("Total de ingresos: "+totalIngresos);
        System.out.println("Total de salidas: "+totalSalidas);
    };

    static void main(String[] args) {
        System.out.println("Creando parking 1");
        ParkingManager parking1 = new ParkingManager();
        parking1.setNombre("Parking de Slather");


        System.out.println(">>>>>>>AGREGANDO AUTOS");
        try {
            parking1.registrarAuto("SGO-494","AUDI");
            parking1.registrarAuto("SGO-495","TOYOTA");
            parking1.registrarAuto("SGO-496","BMW");
            parking1.registrarAuto("SGO-497","BUGGATI");
            parking1.registrarAuto("SGO-498","MC LAREN");
            parking1.registrarAuto("SGO-499","MC LAREN");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        parking1.resumen();
        parking1.mostrarAutosDentro();

        System.out.println("");
        System.out.println(">>>>>>>ELIMINANDO AUTOS");
        parking1.retirarAuto("SGO-496");
        parking1.retirarAuto("SGO-498");
        parking1.resumen();
        parking1.mostrarAutosDentro();

        System.out.println("");
        System.out.println("Agregamos el auto que no se podía antes...");

        try {
            parking1.registrarAuto("SGO-499","MC LAREN");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        parking1.resumen();
        parking1.mostrarAutosDentro();

        System.out.println("");
        System.out.println("Volvemos a ingresar el auto que salió hace un momento, pero como ya existe en la lista no deberá crear otro, solo modificar estado");
        try {
            parking1.registrarAuto("SGO-496","BMW");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        parking1.resumen();
        parking1.mostrarAutosDentro();

        System.out.println("Total parking globales: "+totalParkings);

        System.out.println("Creando parking 2");
        ParkingManager parking2 = new ParkingManager();
        parking2.setNombre("Parking del nigga");
        System.out.println("Total parking globales: "+totalParkings);
        System.out.println("");
        parking1.resumen();
        System.out.println("");
        parking2.resumen();
    }
}
