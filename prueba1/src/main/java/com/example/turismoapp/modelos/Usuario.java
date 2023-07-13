package com.example.turismoapp.modelos;

import com.example.turismoapp.validaciones.UsuarioValidacion;

public class Usuario {

//ATRIBUTOS - VARIABLES DATOS
    private Integer id;
    private String nombres;
    private String documento;
    private String ubicacion;
    private String correoElectronico;
    private UsuarioValidacion validacionJaime = new UsuarioValidacion();


//CONSTRUCTOR VACIO
    public Usuario() { //constructor vacio

    }
//CONSTRUCTOR LLENO
    public Usuario(Integer id, String nombres, String documento, String ubicacion, String correoElectronico) {
        this.id = id;
        this.nombres = nombres;
        this.documento = documento;
        this.ubicacion = ubicacion;
        this.correoElectronico = correoElectronico;
    }
//GETTERS Y SETTERS


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

        try
        {
            this.validacionJaime.validarNombre(nombres);
            this.nombres = nombres;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {

        try
        {
            this.validacionJaime.validarUbicacion(ubicacion);
            this.ubicacion = ubicacion;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        try
        {
            this.validacionJaime.validarCorreo(correoElectronico);
            this.correoElectronico = correoElectronico;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }
}
