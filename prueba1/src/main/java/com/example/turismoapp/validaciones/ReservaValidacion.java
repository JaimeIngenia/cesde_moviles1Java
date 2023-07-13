package com.example.turismoapp.validaciones;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReservaValidacion {
    public Boolean validarFechaReserva (LocalDate fechaReserva)throws Exception {

        String expresionRegularFechaReserva = "^(0[1-9]|1[0-9]|2[0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        Pattern patronFechaReserva = Pattern.compile(expresionRegularFechaReserva);
        Matcher coincidenciaFechaReserva = patronFechaReserva.matcher(expresionRegularFechaReserva);

        if(!coincidenciaFechaReserva.matches())
        {
            throw new Exception("Señor usuario su fecha de reserva no esta con el formato (DD/MM/YYYY)");
        }
        else
        {
            return true;
        }
    }
}
