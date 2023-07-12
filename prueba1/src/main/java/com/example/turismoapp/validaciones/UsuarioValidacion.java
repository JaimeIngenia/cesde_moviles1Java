package com.example.turismoapp.validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {



//CONSTRUCTOR VACIO
    public UsuarioValidacion() {
    }

    //METODOS ORDINARIOS PARA VALIDACIONES

    public Boolean validarNombre(String nombres)throws Exception {
        String expresionRegular = "^[A-Za-z]+$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(nombres);
        if(!coincidencia.matches())
        {
            throw new Exception("Señor usuario su nombre solo puede tener letras");
        }

        else if (nombres.length()<10)
        {
            throw new Exception("Señor usuario su nombre debe tener más de 10 caracteres");
        }
        
        else
        {
            return true;
        }
    }



}
