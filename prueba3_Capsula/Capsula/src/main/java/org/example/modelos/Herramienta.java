package org.example.modelos;

public class Herramienta {
    private String nombre;
    private Double danoCausado; // de cero a 100



    //Constructor vacio
    public Herramienta() {
    }


    //Constructor lleno
    public Herramienta(String nombre, Double danoCausado) {
        this.nombre = nombre;
        this.danoCausado = danoCausado;
    }
}
