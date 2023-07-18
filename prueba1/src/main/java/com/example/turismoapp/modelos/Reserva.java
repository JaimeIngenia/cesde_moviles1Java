package com.example.turismoapp.modelos;
import com.example.turismoapp.validaciones.ReservaValidacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Reserva {
//ATRIBUTOS - VARIABLES DATOS
    private Integer id;
    private Integer idUsuario;
    private Integer idOferta;
    private Double costoTotal;
    private String diaFechaReserva;
    private String mesFechaReserva;
    private String anioFechaReserva;
    private String diaFechaDosReserva;
    private String mesFechaDosReserva;
    private String anioFechaDosReserva;

    private ReservaValidacion validarObjetoReserva = new ReservaValidacion();


//CONSTRUCTOR VACIO
    public Reserva() {
    }


//CONSTRUCTOR LLENO

    public Reserva(Integer id, Integer idUsuario, Integer idOferta, Double costoTotal, String diaFechaReserva, String mesFechaReserva, String anioFechaReserva, String diaFechaDosReserva, String mesFechaDosReserva, String anioFechaDosReserva, ReservaValidacion validarObjetoReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.costoTotal = costoTotal;
        this.diaFechaReserva = diaFechaReserva;
        this.mesFechaReserva = mesFechaReserva;
        this.anioFechaReserva = anioFechaReserva;
        this.diaFechaDosReserva = diaFechaDosReserva;
        this.mesFechaDosReserva = mesFechaDosReserva;
        this.anioFechaDosReserva = anioFechaDosReserva;
        this.validarObjetoReserva = validarObjetoReserva;
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

    public String getDiaFechaReserva() {
        return diaFechaReserva;
    }

    public void setDiaFechaReserva(String diaFechaReserva) {
        try
        {
            this.validarObjetoReserva.validarAnio(diaFechaReserva);
            this.diaFechaReserva = diaFechaReserva;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }

    public String getMesFechaReserva() {
        return mesFechaReserva;
    }

    public void setMesFechaReserva(String mesFechaReserva) {
        try
        {
            this.validarObjetoReserva.validarAnio(mesFechaReserva);
            this.mesFechaReserva = mesFechaReserva;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }

    public String getAnioFechaReserva() {
        return anioFechaReserva;
    }

    public void setAnioFechaReserva(String anioFechaReserva) {
        try
        {
            this.validarObjetoReserva.validarAnio(anioFechaReserva);
            this.anioFechaReserva = anioFechaReserva;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }


    public String getDiaDosFechaReserva() {
        return diaFechaReserva;
    }

    public void setDiaFechaDosReserva(String diaFechaDosReserva) {
        try
        {
            this.validarObjetoReserva.validarAnio(diaFechaDosReserva);
            this.diaFechaDosReserva = diaFechaDosReserva;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }

    public String getMesFechaDosReserva() {
        return mesFechaReserva;
    }

    public void setMesFechaDosReserva(String mesFechaDosReserva) {
        try
        {
            this.validarObjetoReserva.validarAnio(mesFechaDosReserva);
            this.mesFechaDosReserva = mesFechaDosReserva;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }

    public String getAnioFechaDosReserva() {
        return anioFechaReserva;
    }

    public void setAnioFechaDosReserva(String anioFechaDosReserva) {
        try
        {
            this.validarObjetoReserva.validarAnio(anioFechaDosReserva);
            this.anioFechaDosReserva = anioFechaDosReserva;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }


    public ReservaValidacion getValidarObjetoReserva() {
        return validarObjetoReserva;
    }

    public void setValidarObjetoReserva(ReservaValidacion validarObjetoReserva) {
        this.validarObjetoReserva = validarObjetoReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", idOferta=" + idOferta +
                ", costoTotal=" + costoTotal +
                ", diaFechaReserva='" + diaFechaReserva + '\'' +
                ", mesFechaReserva='" + mesFechaReserva + '\'' +
                ", anioFechaReserva='" + anioFechaReserva + '\'' +
                ", diaFechaDosReserva='" + diaFechaDosReserva + '\'' +
                ", mesFechaDosReserva='" + mesFechaDosReserva + '\'' +
                ", anioFechaDosReserva='" + anioFechaDosReserva + '\'' +
                ", validarObjetoReserva=" + validarObjetoReserva +
                '}';
    }

    //METODOS JAIME

    public LocalDate cambiarIntegerLocalDate(Integer anio, Integer mes, Integer dia){
        LocalDate fechaConfigurada_dos = LocalDate.of(anio,mes,dia);
        return fechaConfigurada_dos;
    }


    public Long diferenciaFechas (LocalDate fechaUno, LocalDate fechaDos ) throws Exception {

        try
        {
            Long diferencia = ChronoUnit.DAYS.between(fechaUno,fechaDos);
            this.validarObjetoReserva.validarDiferenciaFechaReserva(diferencia);
            return diferencia;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
        return null;
    }



}
