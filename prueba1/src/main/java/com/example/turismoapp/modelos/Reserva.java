package com.example.turismoapp.modelos;
import com.example.turismoapp.validaciones.ReservaValidacion;

import java.time.LocalDate;
import java.util.Date;

public class Reserva {
//ATRIBUTOS - VARIABLES DATOS
    private Integer id;
    private Integer idUsuario;
    private Integer idOferta;
    private Double costoTotal;
    private LocalDate fechaReserva;

    private ReservaValidacion validarObjetoReserva = new ReservaValidacion();


//CONSTRUCTOR VACIO
    public Reserva() {
    }


//CONSTRUCTOR LLENO


    public Reserva(Integer id, Integer idUsuario, Integer idOferta, Double costoTotal, LocalDate fechaReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
    }

    //GETTERS Y SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        try
        {
            this.validarObjetoReserva.validarFechaReserva(fechaReserva);
            this.fechaReserva = fechaReserva;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }
}
