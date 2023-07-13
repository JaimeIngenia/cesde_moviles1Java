package com.example.turismoapp.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    public Boolean buscarCoincidencias (String expresionRegular,String cadena){

        Pattern patronFuncion = Pattern.compile(expresionRegular);
        Matcher coincidenciaFuncion = patronFuncion.matcher(cadena);

        if(coincidenciaFuncion.matches())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
