package com.example.turismoapp.modelos;
import com.example.turismoapp.utilidades.Util;
import com.example.turismoapp.validaciones.OfertaValidacion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Oferta {
//ATRIBUTOS - VARIABLES DATOS
    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;

    private String diaFechaUno;
    private String mesFechaUno;
    private String anioFechaUno;
    private String diaFechaDos;
    private String mesFechaDos;
    private String anioFechaDos;

    private LocalDate fechaFin;


    //private LocalDate fechaFin;
    private Double costoPersona;
    private Integer idLocal;

    private OfertaValidacion validarObjetoOferta = new OfertaValidacion();

    protected Util utilObjeto = new Util();

//CONSTRUCTOR VACIO

    public Oferta() {
    }
//CONSTRUCTOR LLENO

    public Oferta(Integer id, String titulo, String descripcion, LocalDate fechaInicio, String diaFechaUno, String mesFechaUno, String anioFechaUno, String diaFechaDos, String mesFechaDos, String anioFechaDos, LocalDate fechaFin, Double costoPersona, Integer idLocal, OfertaValidacion validarObjetoOferta, Util utilObjeto) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.diaFechaUno = diaFechaUno;
        this.mesFechaUno = mesFechaUno;
        this.anioFechaUno = anioFechaUno;
        this.diaFechaDos = diaFechaDos;
        this.mesFechaDos = mesFechaDos;
        this.anioFechaDos = anioFechaDos;
        this.fechaFin = fechaFin;
        this.costoPersona = costoPersona;
        this.idLocal = idLocal;
        this.validarObjetoOferta = validarObjetoOferta;
        this.utilObjeto = utilObjeto;
    }


// GETTERS Y SETTERS


    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Integer anio, Integer mes, Integer dia) {

        try {
            //VALIDAR EL AÑO, Validar el mes y valdar el dia
            //this.validarObjetoOferta.validarAnio(anio);
            //this.validarObjetoOferta.validarAnio(anio);
            //this.validarObjetoOferta.validarAnio(anio);
            LocalDate fecha = LocalDate.of(anio,mes,dia);
            this.validarObjetoOferta.validarDosFechas(this.fechaInicio,fecha);
            this.fechaFin = fechaFin;

        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }




    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Integer anio, Integer mes, Integer dia) {



        LocalDate fecha = LocalDate.of(anio,mes,dia);

        this.fechaInicio = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        try
        {
            this.validarObjetoOferta.validarTitulo(titulo);
            this.titulo = titulo;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDiaFechaUno() {
        return diaFechaUno;
    }

    public void setDiaFechaUno(String diaFechaUno) {
        this.diaFechaUno = diaFechaUno;
    }

    public String getMesFechaUno() {
        return mesFechaUno;
    }

    public void setMesFechaUno(String mesFechaUno) {
        this.mesFechaUno = mesFechaUno;
    }

    public String getAnioFechaUno() {
        return anioFechaUno;
    }

    public void setAnioFechaUno(String anioFechaUno) {
        this.anioFechaUno = anioFechaUno;
    }

    public String getDiaFechaDos() {
        return diaFechaDos;
    }

    public void setDiaFechaDos(String diaFechaDos) {
        this.diaFechaDos = diaFechaDos;
    }

    public String getMesFechaDos() {
        return mesFechaDos;
    }

    public void setMesFechaDos(String mesFechaDos) {
        this.mesFechaDos = mesFechaDos;
    }

    public String getAnioFechaDos() {
        return anioFechaDos;
    }

    public void setAnioFechaDos(String anioFechaDos) {
        this.anioFechaDos = anioFechaDos;
    }

    public Double getCostoPersona() {
        return costoPersona;
    }

    public void setCostoPersona(Double costoPersona) {
        try
        {
            this.validarObjetoOferta.validarCosto(costoPersona);
            this.costoPersona = costoPersona;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public OfertaValidacion getValidarObjetoOferta() {
        return validarObjetoOferta;
    }

    public void setValidarObjetoOferta(OfertaValidacion validarObjetoOferta) {
        this.validarObjetoOferta = validarObjetoOferta;
    }

    public Util getUtilObjeto() {
        return utilObjeto;
    }

    public void setUtilObjeto(Util utilObjeto) {
        this.utilObjeto = utilObjeto;
    }

    //METODOS JAIME

    public LocalDate cambiarIntegerLocalDate(Integer anio, Integer mes, Integer dia){
        LocalDate fechaConfigurada_dos = LocalDate.of(anio,mes,dia);
        return fechaConfigurada_dos;
    }


}
