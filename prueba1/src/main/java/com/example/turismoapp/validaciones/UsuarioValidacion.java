package com.example.turismoapp.validaciones;

import com.example.turismoapp.utilidades.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {

//ATRIBUTOS

    protected Util utilObjeto = new Util();

//CONSTRUCTOR VACIO
    public UsuarioValidacion() {
    }

    //METODOS ORDINARIOS PARA VALIDACIONES

    public Boolean validarNombre(String nombres)throws Exception {
        String expresionRegular = "^[A-Za-z]+$";

        //Pattern patron = Pattern.compile(expresionRegular);
        //Matcher coincidencia = patron.matcher(nombres);
        if(!utilObjeto.buscarCoincidencias(expresionRegular,nombres))
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

    public Boolean validarUbicacion (Integer ubicacion)throws Exception {



        if(ubicacion.equals(1) || ubicacion.equals(2) || ubicacion.equals(3) || ubicacion.equals(4))
        {
            return true;
        }
        else
        {
            throw new Exception("Señor usuario su ubicacion no es válida");
        }
    }

    public Boolean validarCorreo (String correo) throws Exception {
        String expresionRegularCorreo = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        //Pattern patronCorreo = Pattern.compile(expresionRegularCorreo);
        //Matcher coincidenciaCorreo = patronCorreo.matcher(expresionRegularCorreo);
        if(!utilObjeto.buscarCoincidencias(expresionRegularCorreo,correo))
        {
            throw new Exception("Señor usuario su correo esta mal no cumple con los requisitos para ser correo");
        }
        else
        {
            return true;
        }
    }



}
