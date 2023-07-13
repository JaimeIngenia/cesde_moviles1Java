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

    public Boolean validarUbicacion (String ubicacion)throws Exception {
        String expresionRegularUbicacion = "^[1-4](zona centro|zona sur|zona norte|otras)$";
        Pattern patronUbicacion = Pattern.compile(expresionRegularUbicacion);
        Matcher coincidenciaUbicacion = patronUbicacion.matcher(expresionRegularUbicacion);

        if(!coincidenciaUbicacion.matches())
        {
            throw new Exception("Señor usuario su ubicacion esta mal");
        }
        else
        {
            return true;
        }

    }

    public Boolean validarCorreo (String correo) throws Exception {
        String expresionRegularCorreo = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern patronCorreo = Pattern.compile(expresionRegularCorreo);
        Matcher coincidenciaCorreo = patronCorreo.matcher(expresionRegularCorreo);
        if(!coincidenciaCorreo.matches())
        {
            throw new Exception("Señor usuario su correo esta mal");
        }
        else
        {
            return true;
        }
    }



}
