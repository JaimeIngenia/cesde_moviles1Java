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


    public Boolean validarFormato ( Integer x, Integer y, Integer z) throws Exception{
        if(!utilObjeto.formato(x,y,z)){
            throw new Exception("Señor el formato de fecha debe ser dd/MM/yyyy");
        }else{
            return true;
        }

    }




    public Boolean validarAnio ( Integer anio ) throws Exception{
        if( (anio>0) && (anio<2024) ){
            return true;
        }
        else{

            throw new Exception("Señor usuario el año debe ser positivo y menor a 2023");
        }
    }

    public Boolean validarMes ( Integer mes ) throws Exception{
        if( (mes>0) && (mes<12) ){
//            throw new Exception("Señor usuario el mes debe ser de 0 a 12");
            return true;
        }
        else
        {
//            return true;
            throw new Exception("Señor usuario el mes debe ser de 0 a 12");
        }
    }


    public Boolean validarDia( Integer dia ) throws Exception{
        if( (dia>0) && (dia<30) ){
            //throw new Exception("Señor usuario el dia debe ser de 0 a 30");
            return true;
        }
        else
        {
//            return true;
            throw new Exception("Señor usuario el dia debe ser de 0 a 30");
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

    public Boolean validarNumeroReservas ( Integer y) throws Exception {
        if( !( (y>0) && (y<5) )){
            throw new Exception("Señor usuario está sobrepasando el máximo de personas");
        }
        else{
            return true;
        }
    }



}
