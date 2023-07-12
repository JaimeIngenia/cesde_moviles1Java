package org.example;

import java.util.Scanner;
import org.example.modelos.Herramienta;
import org.example.modelos.Samurai;

public class Main {
    public static void main(String[] args) {

        Scanner entradaPorTeclado = new Scanner(System.in);

        Samurai objetoSamurai = new Samurai(); // Estamos creando el objeto Saminai
        Samurai objetoSamuraiDos = new Samurai();
        Herramienta objetoHeraamienta = new Herramienta("Escopeta",20.0);// Estamos creando el objeto Herramienta

//Utilizar- Acceder -Ver modificar-Operar-revisar los atributos y métodos de una clase
        //objetoSamurai.nombres = "Kinetsu Micamocho";      //OJO PUES********************
        objetoSamurai.setNombres("Kinetsu Micamocho");
        System.out.println("Digita la edad del primer samurai");
        //objetoSamurai.edad = entradaPorTeclado.nextInt(); //OJO PUES********************
        objetoSamurai.setEdad(entradaPorTeclado.nextInt());

        System.out.println("Digita el nombre del segundo Samurai: ");
        //objetoSamuraiDos.nombres = entradaPorTeclado.nextLine();//OJO PUES********************
        entradaPorTeclado.nextLine();
        objetoSamuraiDos.setNombres(entradaPorTeclado.nextLine());

        System.out.println("***************** RESULTADOS *****************");
        //System.out.println("El samurai :" + objetoSamurai.nombres + "Tiene :" + objetoSamurai.edad + " años");//OJO PUES********************
        System.out.println("El samurai: " + objetoSamurai.getNombres() + "Tiene: " + objetoSamurai.getNombres());
    }
}