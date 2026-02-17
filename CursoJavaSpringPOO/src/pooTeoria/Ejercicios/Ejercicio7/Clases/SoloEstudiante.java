package pooTeoria.Ejercicios.Ejercicio7.Clases;

import pooTeoria.Ejercicios.Ejercicio7.Interfaces.Estudiante;

import java.util.ArrayList;

public class SoloEstudiante extends Persona implements Estudiante {
    private ArrayList<String> cursosMatriculados;

    public SoloEstudiante(String nombre, ArrayList<String> cursosMatriculados) {
        super(nombre);
        this.cursosMatriculados = cursosMatriculados;
    }

    @Override
    public void matricularCurso() {
        System.out.println("Matriculando a un curso (estudiante)...");
    }

    @Override
    public void entregarTarea() {
        System.out.println("Entregando tareas (estudiante)...");
    }

    @Override
    public void iniciarSesion() {
        System.out.println("Iniciando sesion (estudiante)...");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando sesion (estudiante)...");
    }
}
