package com.example.turismoapp.modelos;

import com.example.turismoapp.validaciones.LocalValidacion;

public class Local {
//ATRIBUTOS - VARIABLES DATOS
    private Integer id;
    private String nit;
    private String nombre;
    private String ubicacion;
    private String descripcion;
    private LocalValidacion validarObjetoLocal = new LocalValidacion();

//Constructor vacio
    public Local(Integer id) {
        this.id = id;
    }

//Constructor lleno
    public Local(Integer id, String nit, String nombre, String ubicacion, String descripcion) {
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

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        try
        {
            this.validarObjetoLocal.validarNit(nit);
            this.nit = nit;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try
        {
            this.validarObjetoLocal.validarNombreLocal(nombre);
            this.nombre = nombre;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

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
