package org.example.modelos;

public class Samurai {

    private Integer id;
    private String nombres;
    private Integer edad;


//Constructor vacio
    public Samurai() {
    }


//Constructor lleno
    public Samurai(Integer id, String nombres, Integer edad) {
        this.id = id;
        this.nombres = nombres;
        this.edad = edad;
    }

//GETTER Y SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
