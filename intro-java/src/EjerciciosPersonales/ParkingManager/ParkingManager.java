package EjerciciosPersonales.ParkingManager;

import java.util.ArrayList;

public class ParkingManager {
    static ArrayList<Auto> autos = new ArrayList<>();
    final static int capacidadMaxima = 5;
    static int contadorId;
    static int totalIngresos;
    static int totalSalidas;
    static int simultaneos;

    public static Auto registrarAuto(String placa, String marca){
        if (simultaneos+1<=capacidadMaxima){
            Auto a = new Auto(nextID(),placa,marca);
            autos.add(a);
            ingresarAuto(a);
            return a;
        }else {
            throw new IllegalStateException("Ya no queda espacio para más autos");
        }
    }

    public static void ingresarAuto(Auto auto){
        if (!auto.getIngresado()){
            auto.setIngresado(true);
            totalIngresos++;
            simultaneos++;
        }
    }

    public static void retirarAuto(Auto auto){
        boolean existe = false;
        for (Auto a : autos){
            if (a.getId() == auto.getId()) {
                existe = true;
                if (a.getIngresado()){
                    a.setIngresado(false);
                    totalSalidas++;
                    simultaneos--;
                }else {
                    System.out.println("El auto no está ingresado en parking");
                }
            }
        }
        if (!existe){
            System.out.println("El id ingresado no existe");
        }
    }

    public static int nextID(){
        return ++contadorId;
    }

    public static void mostrarAutosDentro(){
        System.out.println("Los autos que están dentro son: ");
        for (Auto a : autos){
            System.out.println(a.toString());
        }
    }

    public static void resumen(){
        System.out.println("=========================");
        System.out.println("RESUMEN DEL PARKING");
        System.out.println("=========================");
        System.out.println("Capacidad: "+ (capacidadMaxima-simultaneos));
        System.out.println("Autos dentro: "+ simultaneos);
        System.out.println("Total de ingresos: "+totalIngresos);
        System.out.println("Total de salidas: "+totalSalidas);
    };

    static void main(String[] args) {
        System.out.println(">>>>>>>AGREGANDO AUTOS");
        registrarAuto("SGO-494","AUDI");
        registrarAuto("SGO-495","TOYOTA");
        registrarAuto("SGO-496","BMW");
        registrarAuto("SGO-497","BUGGATI");
        registrarAuto("SGO-498","MC LAREN");

        resumen();
        mostrarAutosDentro();

        System.out.println(">>>>>>>ELIMINANDO AUTOS");
        Auto reti1 = new Auto(3,"SGO-496","BMW");
        retirarAuto(reti1);
        resumen();
        mostrarAutosDentro();

    }
}
