package com.example.repositoriotareas;

import androidx.annotation.NonNull;

public class ClaseA {
    private String nombre;
    private String apellidos;
    private int edad;

    public ClaseA(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("Nombre %s, Apellido %s, Edad %d", nombre, apellidos, edad);
    }
}
