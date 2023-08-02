package com.example.turismoapp.modelos;

import com.example.turismoapp.utilidades.MetodosPago;
import com.example.turismoapp.validaciones.AfiliadoValidacion;

public class Afiliado extends Usuario{

    //ATRIBUTOS

    private Integer valorMembresia;
    private MetodosPago objetoMetodoPago=MetodosPago.TARJETA_CREDITO;
    private String documentoReferido;

    private final Double IVA= 0.19;//UNA CONSTANTE INICIALIZADA

    private AfiliadoValidacion objetoAfiliadoValidacion = new AfiliadoValidacion();


    //METODOS

//CONSTRUCTOR VACIO

    public Afiliado() {
    }

//CONSTRUCTOR LLENO


    public Afiliado(Integer id, String nombres, String documento, Integer ubicacion, String correoElectronico, Integer valorMembresia, MetodosPago objetoMetodoPago, String documentoReferido) {
        super(id, nombres, documento, ubicacion, correoElectronico);
        this.valorMembresia = valorMembresia;
        this.objetoMetodoPago = objetoMetodoPago;
        this.documentoReferido = documentoReferido;
    }


    //GETTERS Y SETTERS

    public Integer getValorMembresia() {
        return valorMembresia;
    }

    public void setValorMembresia(Integer valorMembresia) {

        try
        {
            this.objetoAfiliadoValidacion.validarMembresia(valorMembresia);
            this.valorMembresia = valorMembresia;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }

    public MetodosPago getObjetoMetodoPago() {
        return objetoMetodoPago;
    }

    public void setObjetoMetodoPago(MetodosPago objetoMetodoPago) {
        this.objetoMetodoPago = objetoMetodoPago;
    }

    public String getDocumentoReferido() {
        return documentoReferido;
    }

    public void setDocumentoReferido(String documentoReferido) {
        this.documentoReferido = documentoReferido;
    }


    //METODOS ORDINARIOS

    public Double aplicarIva(){
        Double valorIva = this.IVA * this.valorMembresia;
        Double valorFinalMembresia = this.valorMembresia + valorIva;

        return valorFinalMembresia;

    };
}
