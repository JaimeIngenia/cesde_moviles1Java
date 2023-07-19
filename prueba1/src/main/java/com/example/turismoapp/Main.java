package com.example.turismoapp;

import com.example.turismoapp.modelos.Local;
import com.example.turismoapp.modelos.Oferta;
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
        Local localObjeto = new Local();
        Oferta ofertaObjeto = new Oferta();

        System.out.println("***Bienvenido***");
        System.out.println("1. Recogiendo datos del usuario: ");

        //VALIDACIONES PARA USUARIO

      /* System.out.println("  -  Digita tus nombres y apellidos");
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
        System.out.println(localObjeto.getNit());

        System.out.println("Ingrese el nombre de su empresa, en tabla Local");
        localObjeto.setNombre(teclado.nextLine());
        System.out.println(localObjeto.getNombre());

        System.out.println("Mira todos los datos");
        System.out.println(localObjeto.toString());*/

        //VALIDACIONES OFERTA

        /*System.out.println("Digite el titulo de la tabla Ofertas");
        ofertaObjeto.setTitulo(teclado.nextLine());
        System.out.println(ofertaObjeto.getTitulo());*/

        System.out.println("Ingrese el año de la fecha1");
        Integer anioPrincipal = teclado.nextInt();


        System.out.println("Ingrese el mes de la fecha1");
        Integer mesPrincipal = teclado.nextInt();


        System.out.println("Ingrese el día de la fecha1");
        Integer diaPrincipal = teclado.nextInt();

        ofertaObjeto.setFechaInicio(anioPrincipal,mesPrincipal,diaPrincipal);



//*********************************************************************************************************************************************
        //LocalDate fechaUnoFaseUno = ofertaObjeto.cambiarIntegerLocalDate(anioPrincipalInteger,mesPrincipalInteger,diaPrincipalInteger);//ponerla en un util
//*********************************************************************************************************************************************


        System.out.println("Ingrese el año de la fecha2");
        String anioSecundario = teclado.next();
        ofertaObjeto.setAnioFechaDos(anioSecundario);

        System.out.println("Ingrese el mes de la fecha2");
        String mesSecundario = teclado.next();
        ofertaObjeto.setMesFechaDos(mesSecundario);

        System.out.println("Ingrese el día de la fecha2");
        String diaSecundario = teclado.next();
        ofertaObjeto.setDiaFechaDos(diaSecundario);

        Integer anioSecundariolInteger = Integer.parseInt(anioSecundario);
        Integer mesSecundarioInteger = Integer.parseInt(mesSecundario);
        Integer diaSecundarioInteger = Integer.parseInt(diaSecundario);
//*********************************************************************************************************************************************
        LocalDate fechaDosFaseUno = ofertaObjeto.cambiarIntegerLocalDate(anioSecundariolInteger,mesSecundarioInteger,diaSecundarioInteger);
//*********************************************************************************************************************************************



        /*        System.out.println("Digite el costo por persona de la tabla Oferta");
        ofertaObjeto.setCostoPersona(teclado.nextDouble());
        System.out.println(ofertaObjeto.getCostoPersona());*/

        //VALIDACIONES RESERVA



























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