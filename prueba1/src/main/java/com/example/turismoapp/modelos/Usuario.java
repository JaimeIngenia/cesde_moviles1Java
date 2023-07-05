package com.example.turismoapp.modelos;

public class Usuario {

    //ATRIBUTOS - VARIABLES DATOS
    Integer id;
    String nombres;
    String documento;
    Integer ubicacion;
    String correoElectronico;



    //METODOS-FUNCIONES-ACCIONES

    //METODOS-ESPECIALES


    public Usuario() { //constructor vacio

    }

    public Usuario(Integer id, String nombres, String documento, Integer ubicacion, String correoElectronico) {
        this.id = id;
        this.nombres = nombres;
        this.documento = documento;
        this.ubicacion = ubicacion;
        this.correoElectronico = correoElectronico;
    }
}
