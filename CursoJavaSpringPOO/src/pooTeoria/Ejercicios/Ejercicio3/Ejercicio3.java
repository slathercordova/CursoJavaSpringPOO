package pooTeoria.Ejercicios.Ejercicio3;

import pooTeoria.Ejercicios.Ejercicio2.Computer;
import java.util.List;

public class Ejercicio3 {
    static void main(String[] args) {
        Computer pc1 = new Computer("LENOVO","LENOVO 123",16,256);
        Computer pc2 = new Computer("TOSHIBA","TOSHIBA 123",32,512);
        Computer pc3 = new Computer("ALIEN WARE","ALIEN WARE 123",64,1024);

        ComputerStore cs = new ComputerStore("Tienda 1","Avenida Salaverry 123");
        cs.agregarComputer(pc1);
        cs.agregarComputer(pc2);

        ComputerStore cs2 = new ComputerStore("Tienda 2","Avenida Brasil 456");
        cs2.agregarComputer(pc3);

        System.out.println(cs.toString());
        System.out.println("Total de computadoras de "+cs.getName()+" : "+cs.totalComputadoras());
        System.out.println("==================================================");
        System.out.println(cs2.toString());
        System.out.println("Total de computadoras de "+cs2.getName()+" : "+cs2.totalComputadoras());

        System.out.println("Filtramos todas las computadoras de 32 gigas de ram o más");
        List<Computer> comFiltrado = cs.filtrarRam(12);
        for (Computer co : comFiltrado){
            System.out.println(co.toString());
        }

        System.out.println(">>>>> Vender computadora");
        cs.venderComputadora("LENOVO","LENOVO 123");
        System.out.println(cs.toString());
    }
}
