package com.example.turismoapp.validaciones;

import com.example.turismoapp.utilidades.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LocalValidacion {
    //ATRIBUTOS
    protected Util utilObjeto = new Util();
    public Boolean validarNit ( String nit ) throws Exception{

        String expresionRegularNit = "\\d+";
        //\\d{1,10}
        //^/d{10}$
        //\\d{10}
        //\\d+
        //if(utilObjeto.buscarCoincidencias(expresionRegularNit,nit))

        if(!utilObjeto.buscarCoincidencias(expresionRegularNit,nit)){
            throw new Exception("Señor usuario su nit esta mal, debe tener solo dígitos, no caracteres");
        }
        else if(!(nit.length() == 10))
        {
            throw new Exception("Señor usuario su nit esta mal, debe tener al menos 10 digitos");
        }
        else
        {
            return true;
        }
    }

    public Boolean validarNombreLocal ( String nombre ) throws Exception {

        String expresionRegularNombreLocal = "^.{1,30}$";

        if(!utilObjeto.buscarCoincidencias(expresionRegularNombreLocal,nombre))
        {
            throw new Exception("Señor usuario su nombre de local esta mal, no debe sobre pasar los 30 caracteres");
        }
        else
        {
            return true;
        }

    }

}
