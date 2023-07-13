package com.example.turismoapp.validaciones;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OfertaValidacion {

    public Boolean validarTitulo(String titulo)throws Exception{
        String expresionRegularTitulo = "^.{1,20}$\n";
        Pattern patronTitulo = Pattern.compile(expresionRegularTitulo);
        Matcher coincidenciaTitulo = patronTitulo.matcher(expresionRegularTitulo);

        if(!coincidenciaTitulo.matches())
        {
            throw new Exception("Señor usuario su Titulo no puede tener más de 10 caracteres");
        }
        else
        {
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
}
