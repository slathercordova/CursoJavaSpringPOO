package pooTeoria.Ejercicios.Ejercicio7.Clases;

import pooTeoria.Ejercicios.Ejercicio7.Interfaces.Profesor;

import java.util.ArrayList;

public class SoloProfesor extends Persona implements Profesor {
    private ArrayList<String> cursosImpartidos;

    public SoloProfesor(String nombre, ArrayList<String> cursosImpartidos) {
        super(nombre);
        this.cursosImpartidos = cursosImpartidos;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("Iniciando sesion (profesor)...");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando sesion (profesor)...");
    }

    @Override
    public void calificarExamen() {
        System.out.println("Calificando examen (profesor)...");
    }

    @Override
    public void asignarTarea() {
        System.out.println("Asignando tarea (profesor)...");
    }
}
