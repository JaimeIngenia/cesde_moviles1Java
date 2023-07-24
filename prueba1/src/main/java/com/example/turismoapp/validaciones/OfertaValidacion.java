package com.example.turismoapp.validaciones;

import com.example.turismoapp.utilidades.Util;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OfertaValidacion {

    //ATRIBUTOS

    protected Util utilObjeto = new Util();

    //METODOS

    public Boolean validarTitulo(String titulo)throws Exception{
        String expresionRegularTitulo = "^.{1,20}$";

        if(!utilObjeto.buscarCoincidencias(expresionRegularTitulo,titulo))
        {
            throw new Exception("Señor usuario su Titulo no puede tener más de 20 caracteres");
        }
        else
        {
            return true;
        }
    }

    public Boolean validarDiferenciaFechaOferta (Long x) throws Exception {
        if(x<0){
            throw new Exception("Señor usuario la fecha final es menor a la fecha inicial, eso es ilógico!");
        }
        else {
            return true;
        }
    }


    public Boolean validarFechas(LocalDate fechaInicio, LocalDate fechaFin) throws Exception {
        boolean esValido = fechaInicio.isAfter(fechaFin);
        if(!esValido)
        {
            throw new Exception("Señor usuario su fecha inicio no puede ser mayor a la fecha fin");
        }
        else
        {
            return true;
        }
    }


    public Boolean validarCosto(Double costoPersona) throws Exception {
        if(costoPersona<0){
            throw new Exception("Señor usuario su costo persona no debe ser negativo");
        }
        else{
            return true;
        }
    }


    public Boolean validarDosFechas ( LocalDate fechaInicio, LocalDate fechaFin) throws Exception{
        if(!utilObjeto.diferenciaFechas(fechaInicio,fechaFin)){
            throw new Exception("Señor usuario las fechas son ilogicas, porque la fecha fin no puede menor a la fecha inicio");
        }else{
            return true;
        }

    }

    public Boolean validarAnio ( Integer anio ) throws Exception{
        if( (anio>0) && (anio<2024) ){
            return true;
        }
        else{

            throw new Exception("Señor usuario el año debe ser positivo y menor a 2023");
        }
    }

    public Boolean validarMes ( Integer mes ) throws Exception{
        if( (mes>0) && (mes<12) ){
//            throw new Exception("Señor usuario el mes debe ser de 0 a 12");
            return true;
        }
        else
        {
//            return true;
            throw new Exception("Señor usuario el mes debe ser de 0 a 12");
        }
    }


    public Boolean validarDia( Integer dia ) throws Exception{
        if( (dia>0) && (dia<30) ){
            //throw new Exception("Señor usuario el dia debe ser de 0 a 30");
            return true;
        }
        else
        {
//            return true;
            throw new Exception("Señor usuario el dia debe ser de 0 a 30");
        }
    }




}
