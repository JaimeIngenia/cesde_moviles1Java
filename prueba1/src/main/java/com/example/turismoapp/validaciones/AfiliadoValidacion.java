package com.example.turismoapp.validaciones;

import com.example.turismoapp.utilidades.Mensajes;
import com.example.turismoapp.utilidades.Util;

public class AfiliadoValidacion {
    //VALOR DE LA MEMBRESIA NO PUEDE SER MENOR A 20MIL PESOS, NI PUEDE SER MAYOR A 150MIL

    //CEDULA DEL REFERIDO SOLO PUEDE TENER NUMEROS

    //ATRIBUTOS
    protected Util utilObjeto = new Util();

    //CONSTRUCTOR VACIO

    public AfiliadoValidacion() {
    }

    //METODOS

    public Boolean validarMembresia(Integer parametroValorMembresia)throws Exception {
        String expresionRegular = "\\d+";
        String parametroString = Integer.toString(parametroValorMembresia);

        if(!utilObjeto.buscarCoincidencias(expresionRegular,parametroString))
        {
            throw new Exception("Señor usuario su nit esta mal, debe tener solo dígitos, no caracteres");
        }

        else if ( parametroValorMembresia <2000 || parametroValorMembresia>15000 )
        {
            throw new Exception("Señor usuario no está dentro del rango determinado");
        }

        else
        {
            return true;
        }
    }
}
