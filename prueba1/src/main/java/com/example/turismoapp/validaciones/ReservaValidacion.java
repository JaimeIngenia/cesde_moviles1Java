package com.example.turismoapp.validaciones;

import com.example.turismoapp.modelos.Local;
import com.example.turismoapp.utilidades.Util;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReservaValidacion {
    //ATRIBUTOS
    protected Util utilObjeto = new Util();


    //METODOS

    public Boolean validarFechaReserva (String x)throws Exception {

        String expresionRegularFechaReserva = "^[0-9]+$\n";

        if(!utilObjeto.buscarCoincidencias(expresionRegularFechaReserva,x) )
        //if(!coincidenciaFechaReserva.matches())
        {
            throw new Exception("Señor usuario su dato ingresado debe ser únicamente un número");
        }
        else
        {
            return true;
        }
    }

    public Boolean validarAnio (String x) throws Exception {
        String expresionRegularFechaAnio = "^[0-9]+$";
        if(!utilObjeto.buscarCoincidencias(expresionRegularFechaAnio,x))
        {
            throw new Exception("Señor usuario su dato solo debe ser numérico");
        }
        else
        {
            return true;
        }
    }

    public Boolean validarDiferenciaFechaReserva (Long x) throws Exception {
        if(x<0){
            throw new Exception("Señor usuario la fecha final es menor a la fecha inicial, eso es ilógico!");
        }
        else {
            return true;
        }
    }

}
