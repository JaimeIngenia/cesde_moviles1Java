package com.example.turismoapp;

import com.example.turismoapp.modelos.Usuario;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;
import java.io.IOException;


public class Main {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Usuario usuarioObjeto = new Usuario();

        System.out.println("***Bienvenido***");

        System.out.println("1. Recogiendo datos del usuario: ");
        System.out.println("  -  Digita tus nombres y apellidos");
        usuarioObjeto.setNombres(teclado.nextLine());

        System.out.println(usuarioObjeto.getNombres());

        System.out.println("Digite su correo electrónico: ");
        usuarioObjeto.setCorreoElectronico(teclado.nextLine());
        System.out.println(usuarioObjeto.getCorreoElectronico());

        System.out.println("Mira todos los datos");
        System.out.println(usuarioObjeto.toString());




    }
}