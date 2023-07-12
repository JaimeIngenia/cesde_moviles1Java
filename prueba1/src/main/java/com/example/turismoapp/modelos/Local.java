package com.example.turismoapp.modelos;

public class Local {
//ATRIBUTOS - VARIABLES DATOS
    private Integer id;
    private Integer nit;
    private String nombre;
    private String ubicacion;
    private String descripcion;

//Constructor vacio
    public Local(Integer id) {
        this.id = id;
    }

//Constructor lleno
    public Local(Integer id, Integer nit, String nombre, String ubicacion, String descripcion) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }
//GETTERS Y SETTERS

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNit() {
        return nit;
    }

    public void setNit(Integer nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
