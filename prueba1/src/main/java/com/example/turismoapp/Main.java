package com.example.turismoapp;

import com.example.turismoapp.modelos.Reserva;
import com.example.turismoapp.modelos.Usuario;
import com.example.turismoapp.validaciones.ReservaValidacion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {

        //OBJETOS
        Scanner teclado = new Scanner(System.in);
        Usuario usuarioObjeto = new Usuario();
        Reserva reservaObjeto = new Reserva();

        System.out.println("***Bienvenido***");
        System.out.println("1. Recogiendo datos del usuario: ");


        System.out.println("Ingrese el año de la fecha1");
        String anioPrincipal = teclado.next();
        reservaObjeto.setAnioFechaReserva(anioPrincipal);

        System.out.println("Ingrese el mes de la fecha1");
        String mesPrincipal = teclado.next();
        reservaObjeto.setMesFechaReserva(mesPrincipal);

        System.out.println("Ingrese el día de la fecha1");
        String diaPrincipal = teclado.next();
        reservaObjeto.setDiaFechaReserva(diaPrincipal);

        Integer anioPrincipalInteger = Integer.parseInt(anioPrincipal);
        Integer mesPrincipalInteger = Integer.parseInt(mesPrincipal);
        Integer diaPrincipalInteger = Integer.parseInt(diaPrincipal);
//*********************************************************************************************************************************************
        LocalDate fechaUnoFaseUno = reservaObjeto.cambiarIntegerLocalDate(anioPrincipalInteger,mesPrincipalInteger,diaPrincipalInteger);
//*********************************************************************************************************************************************


        System.out.println("Ingrese el año de la fecha2");
        String anioPrincipalFechaDos = teclado.next();
        reservaObjeto.setAnioFechaDosReserva(anioPrincipalFechaDos);

        System.out.println("Ingrese el mes de la fecha2");
        String mesPrincipalFechaDos = teclado.next();
        reservaObjeto.setMesFechaDosReserva(mesPrincipalFechaDos);

        System.out.println("Ingrese el día de la fecha2");
        String diaPrincipalFechaDos = teclado.next();
        reservaObjeto.setDiaFechaDosReserva(diaPrincipalFechaDos);

        Integer anioPrincipalFechaDosInteger = Integer.parseInt(anioPrincipalFechaDos);
        Integer mesPrincipalFechaDosInteger = Integer.parseInt(mesPrincipalFechaDos);
        Integer diaPrincipalFechaDosInteger = Integer.parseInt(diaPrincipalFechaDos);
//*********************************************************************************************************************************************
        LocalDate fechaDosFaseUno = reservaObjeto.cambiarIntegerLocalDate(anioPrincipalFechaDosInteger,mesPrincipalFechaDosInteger,diaPrincipalFechaDosInteger);
//*********************************************************************************************************************************************

        System.out.println(reservaObjeto.diferenciaFechas(fechaUnoFaseUno,fechaDosFaseUno));















        //System.out.println(reservaObjeto.toString());
        //System.out.println("La diferencia entre fechas es");
        // System.out.println(reservaObjeto.diferenciaFechas(fechaUnoFaseUno,fechaDosFaseUno));
    }
}