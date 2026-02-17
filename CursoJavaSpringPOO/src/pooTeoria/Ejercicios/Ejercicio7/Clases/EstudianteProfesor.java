package pooTeoria.Ejercicios.Ejercicio7.Clases;

import pooTeoria.Ejercicios.Ejercicio7.Interfaces.Estudiante;
import pooTeoria.Ejercicios.Ejercicio7.Interfaces.Profesor;

import java.util.ArrayList;

public class EstudianteProfesor extends Persona implements Estudiante, Profesor {
    private ArrayList<String> cursosMatriculados;
    private ArrayList<String> cursosImpartidos;

    public EstudianteProfesor(String nombre, ArrayList<String> cursosMatriculados, ArrayList<String> cursosImpartidos) {
        super(nombre);
        this.cursosMatriculados = cursosMatriculados;
        this.cursosImpartidos = cursosImpartidos;
    }

    @Override
    public void matricularCurso() {
        System.out.println("Matriculando a un curso (estudiante profesor)...");
    }

    @Override
    public void entregarTarea() {
        System.out.println("Entregando tareas (estudiante profesor)...");
    }

    @Override
    public void calificarExamen() {
        System.out.println("Calificando examen (estudiante profesor)...");
    }

    @Override
    public void asignarTarea() {
        System.out.println("Asignando tarea (estudiante profesor)...");
    }

    @Override
    public void iniciarSesion() {
        System.out.println("Iniciando sesion (estudiante profesor)...");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando sesion (estudiante profesor)...");
    }
}
