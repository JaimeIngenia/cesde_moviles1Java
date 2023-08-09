package com.example.turismoapp.validaciones;

import com.example.turismoapp.utilidades.Util;

public class NoAfiliadoValidacion {

    //ATRIBUTOS
    protected Util utilObjeto = new Util();

    //CONSTRUCTOR
    public NoAfiliadoValidacion() {
    }

    //METODOS

    public Boolean validarNumeroReservasMensuales(Integer parametroNumeroReservas)throws Exception {
        String expresionRegular = "^[+-]?\\d+$";
        //String expresionRegular = "^[+-]?\\\\d+(\\\\.\\\\d+)?$";

        String parametroString = Integer.toString(parametroNumeroReservas);

        if(!utilObjeto.buscarCoincidencias(expresionRegular,parametroString))
        {
            throw new Exception("Señor usuario su numero reservas esta mal, debe tener solo dígitos, no caracteres y no debe ser negativo");
        }

        else if ( parametroNumeroReservas < 0 )
        {
            throw new Exception("Señor usuario su numero de reservas no puede ser negativo");
        }

        else if ( parametroNumeroReservas > 5 )
        {
            throw new Exception("Señor usuario tiene derecho a un 15%");
        }

        else
        {
            return true;
        }
    }
}
