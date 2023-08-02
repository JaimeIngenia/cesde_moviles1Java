package com.example.turismoapp;

import com.example.turismoapp.modelos.*;
import com.example.turismoapp.validaciones.NoAfiliadoValidacion;
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
/*
        Scanner teclado = new Scanner(System.in);
        Usuario usuarioObjeto = new Usuario();
        Reserva reservaObjeto = new Reserva();
        Local localObjeto = new Local();
        Oferta ofertaObjeto = new Oferta();

        System.out.println("***Bienvenido***");
        System.out.println("1. Recogiendo datos del usuario: ");
*/

        //VALIDACIONES PARA USUARIO

        /*System.out.println("  -  Digita tus nombres y apellidos");
        usuarioObjeto.setNombres(teclado.nextLine());
        System.out.println(usuarioObjeto.getNombres());

        System.out.println("Digite su correo electrónico: ");
        usuarioObjeto.setCorreoElectronico(teclado.nextLine());
        System.out.println(usuarioObjeto.getCorreoElectronico());

        System.out.println("Digite su ubicacion: ");
        usuarioObjeto.setUbicacion(teclado.nextInt());
        System.out.println(usuarioObjeto.getUbicacion());

        System.out.println("Mira todos los datos");
        System.out.println(usuarioObjeto.toString());*/

        //VALIDACIONES LOCAL

        /*System.out.println("Ingrese el número nit, en tabla Local");
        localObjeto.setNit(teclado.nextLine());
        System.out.println(localObjeto.getNit());*/
        /*
        System.out.println("Ingrese el nombre de su empresa, en tabla Local");
        localObjeto.setNombre(teclado.nextLine());
        System.out.println(localObjeto.getNombre());

        System.out.println("Mira todos los datos");
        System.out.println(localObjeto.toString());*/

        //VALIDACIONES OFERTA

        /* System.out.println("Digite el titulo de la tabla Ofertas");
        ofertaObjeto.setTitulo(teclado.nextLine());
        System.out.println(ofertaObjeto.getTitulo());
*/

        /*  System.out.println("Ingrese el año de la fecha1");
        Integer anioPrincipal = teclado.nextInt();


        System.out.println("Ingrese el mes de la fecha1");
        Integer mesPrincipal = teclado.nextInt();


        System.out.println("Ingrese el día de la fecha1");
        Integer diaPrincipal = teclado.nextInt();
//*********************************************************************************************************************************************
        ofertaObjeto.setFechaInicio(anioPrincipal,mesPrincipal,diaPrincipal);
//*********************************************************************************************************************************************

        System.out.println("Ingrese el año de la fecha2");
        Integer anioSecundario = teclado.nextInt();


        System.out.println("Ingrese el mes de la fecha2");
        Integer mesSecundario = teclado.nextInt();


        System.out.println("Ingrese el día de la fecha2");
        Integer diaSecundario = teclado.nextInt();

//*********************************************************************************************************************************************
        ofertaObjeto.setFechaFin(anioSecundario,mesSecundario,diaSecundario);
//*********************************************************************************************************************************************
*/
        /*System.out.println("Digite el costo por persona de la tabla Oferta");
        ofertaObjeto.setCostoPersona(teclado.nextDouble());
        System.out.println(ofertaObjeto.getCostoPersona());*/

        //VALIDACIONES RESERVA


        /*System.out.println("Ingrese el año de la fecha Reserva");
        Integer anioPrincipalReserva = teclado.nextInt();


        System.out.println("Ingrese el mes de la fecha Reserva");
        Integer mesPrincipalReserva = teclado.nextInt();


        System.out.println("Ingrese el día de la fecha Reserva");
        Integer diaPrincipalReserva = teclado.nextInt();
//*********************************************************************************************************************************************
        reservaObjeto.setFechaReserva(anioPrincipalReserva,mesPrincipalReserva,diaPrincipalReserva);
//*********************************************************************************************************************************************
        System.out.println(reservaObjeto.getFechaReserva());

         */

/*        System.out.println("Digite la cantidad de personas para hacer las correspondientes reservas");
        Integer numeroReservas = teclado.nextInt();
        reservaObjeto.setNumeroPersonas(numeroReservas);*/



        /////******************************************************  Herencia y clases abstractas *************************************************


        Afiliado objetoAfiliado = new Afiliado();
        NoAfiliado objetoNoAfiliado = new NoAfiliado();
        Scanner teclado = new Scanner(System.in);
        //Usuario usuarioObjeto = new Usuario(); //No se puede inicializar

        //ACCEDIENDO a los atributos de un objeto
        // Validando a Afiliado
        /*usuarioObjeto.setNombres("1234");

        objetoAfiliado.setNombres("ana");
        */
        //Validando a No Afiliado

        System.out.println("Señor usuario escriba el numero de reservas");
        Integer numeroReservas = teclado.nextInt();

        objetoNoAfiliado.setNumeroReservasMensuales(numeroReservas);
        System.out.println(objetoNoAfiliado.getNumeroReservasMensuales());






















        //VALIDACIONES FECHAS

        /*System.out.println("Ingrese el año de la fecha1");
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
*/














        //System.out.println(reservaObjeto.toString());
        //System.out.println("La diferencia entre fechas es");
        // System.out.println(reservaObjeto.diferenciaFechas(fechaUnoFaseUno,fechaDosFaseUno));
    }
}