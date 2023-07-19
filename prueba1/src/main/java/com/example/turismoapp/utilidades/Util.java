package com.example.turismoapp.utilidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    public Boolean buscarCoincidencias (String expresionRegular,String cadena){

        Pattern patronFuncion = Pattern.compile(expresionRegular);
        Matcher coincidenciaFuncion = patronFuncion.matcher(cadena);

        //return coincidenciaFuncion.matches();
        if(coincidenciaFuncion.matches())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Boolean diferenciaFechas (LocalDate fechaUno, LocalDate fechaDos ) {


        Long diferencia = ChronoUnit.DAYS.between(fechaUno,fechaDos);

        if(diferencia >0)     {
            return true;
        }
        else {
            return false;
        }

    }

}
