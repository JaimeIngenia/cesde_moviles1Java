package com.example.turismoapp.modelos;

import com.example.turismoapp.validaciones.NoAfiliadoValidacion;

public class NoAfiliado extends Usuario {

    //ATRIBUTOS
    private Integer NumeroReservasMensuales;

    private NoAfiliadoValidacion objetoNoAfiliadoValidacion = new NoAfiliadoValidacion();

    //CONSTRUCTORES

    public NoAfiliado() {
    }

    @Override
    public Double calcularAnualidad() {
        Double calcular = this.getCostoAnual()+this.getIVA();
        return calcular;
    }

    public NoAfiliado(Integer id, String nombres, String documento, Integer ubicacion, String correoElectronico, Integer numeroReservasMensuales) {
        super(id, nombres, documento, ubicacion, correoElectronico);
        NumeroReservasMensuales = numeroReservasMensuales;
    }
    //GETTERS Y SETTERS

    public Integer getNumeroReservasMensuales() {
        return NumeroReservasMensuales;
    }

    public void setNumeroReservasMensuales(Integer numeroReservasMensuales) {

        try
        {
            this.objetoNoAfiliadoValidacion.validarNumeroReservasMensuales(numeroReservasMensuales);
            NumeroReservasMensuales = numeroReservasMensuales;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }


    //METODOS JAIME


}
