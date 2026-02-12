package pooTeoria.Herencia;

public class Main {
    static void main(String[] args) {
        Profesor profe = new Profesor("George","Maxi",19,"george@gmail.com",3333);
        Alumno alum = new Alumno("Slather","Córdova",32,"slathercordova@gmail.com",20);

        profe.printInfo();
    }
}
