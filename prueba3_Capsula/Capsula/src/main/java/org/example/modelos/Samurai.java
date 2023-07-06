package org.example.modelos;

public class Samurai {

    private Integer id;
    public String nombres;
    public Integer edad;


    //Constructor vacio
    public Samurai() {
    }


    //Constructor lleno
    public Samurai(Integer id, String nombres, Integer edad) {
        this.id = id;
        this.nombres = nombres;
        this.edad = edad;
    }
}
