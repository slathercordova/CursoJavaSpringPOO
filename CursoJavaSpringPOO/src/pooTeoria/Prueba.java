package pooTeoria;

public class Prueba {
    static void main(String[] args) {
        //Computer computer = new Computer("HP","HP 01919",16,512);
        Computer computer = new Computer();
        computer.brand = "HP";
        computer.model = "HP 01919";
        computer.ram = 16;
        computer.storage = 512;

        System.out.println(computer.toString());

        Profesor profesor1 = new Profesor("George", "Maxi", 99, 3000, 20, "TIEMPO_COMPLETO");
        Profesor profesor2 = new Profesor("Jose", "Lopez", 23, 3500, 15, "TIEMPO_PARCIAL");
//        profesor1.edad = 22;
//        System.out.println(profesor1.getNombre());
//        System.out.println(profesor2.getNombre());
        System.out.println("Edad inicial: " + profesor1.getEdad());

//        double respuesta = Math.pow(2,0);
//        System.out.println(respuesta);
//        System.out.println(Math.max(100, 399));

        profesor1.setEdad(34);

        System.out.println("Edad despues del cambio: " + profesor1.getEdad());

        // multiplicar el (salario * 12) / aniosServicio\
        // si el profesor es TIEMPO_COMPLETO entonces agregar la multiplicacion de su salario * 0.25 * anios Servicio

        // Calcular el bono para el profesor 1

//        double bono = ( profesor1.getSalario() * 12 ) / profesor1.getAniosServicio();
//        if (profesor1.getTipo().equals("TIEMPO_COMPLETO")) {
//            bono += profesor1.getSalario() * 0.25 * profesor1.getAniosServicio();
//        }
//        profesor1.setBono(bono);
//        System.out.println(bono);

        double bono = profesor1.calcularBono();
        profesor1.setBono(bono);


        profesor2.setBono(profesor2.calcularBono());

        System.out.println(profesor1.getBono());
        System.out.println(profesor2.getBono());
    }
}
