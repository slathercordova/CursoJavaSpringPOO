package pooTeoria.Ejercicios.Ejercicio7.Clases;

import pooTeoria.Ejercicios.Ejercicio7.Interfaces.Usuario;

public abstract class Persona implements Usuario {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
