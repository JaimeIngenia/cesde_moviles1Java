package com.example.turismoapp.validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LocalValidacion {
    public Boolean validarNit ( String nit ) throws Exception{

        String expresionRegularNit = "^/d{10}$";
        Pattern patronNit = Pattern.compile(expresionRegularNit);
        Matcher coincidenciaNit = patronNit.matcher(expresionRegularNit);

        if(!coincidenciaNit.matches())
        {
            throw new Exception("Señor usuario su id esta mal, debe tener 10 caracteres");
        }
        else
        {
            return true;
        }
    }

    public Boolean validarNombreLocal ( String nombre ) throws Exception {
        String expresionRegularNombreLocal = "^.{1,30}$\n";
        Pattern patronNombreLocal = Pattern.compile(expresionRegularNombreLocal);
        Matcher coincidenciaNombreLocal = patronNombreLocal.matcher(expresionRegularNombreLocal);
        if(!coincidenciaNombreLocal.matches())
        {
            throw new Exception("Señor usuario su nombre de local esta mal, no debe sobrep caracteres");
        }
        else
        {
            return true;
        }

    }

}
