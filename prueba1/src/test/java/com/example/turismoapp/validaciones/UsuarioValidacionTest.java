package com.example.turismoapp.validaciones;

import com.example.turismoapp.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {

    //1. PREPARANDO

    //PROBANDO EL OBJETO USUARIO VALIDACIÓN

    private UsuarioValidacion objetoUsuarioValidaicon;
    @BeforeEach
    public void confuguracionIniical(){
        this.objetoUsuarioValidaicon=new UsuarioValidacion();

    }

    @Test
    public void validarNombreUsuarioCorrecto(){
            String nombreValido = "Jaime Moncayo";
            //2 y 3 ejecutar y verificar
            Assertions.assertDoesNotThrow( ()->  objetoUsuarioValidaicon.validarNombre(nombreValido) );
    }

    @Test
    public void validarNombreUsuarioIncorrecto(){
        String nombreInvalido = "Jaime13153"; //PREPARANDO
        String nombreCorto = "Jaime";

        //EJECUTAR Y VERIFICAR

        //Esérar que salga la esepción y almacenarla en esa variable
        Exception exceptionJaime = Assertions.assertThrows( Exception.class , ()-> objetoUsuarioValidaicon.validarNombre(nombreInvalido) );
        Exception exceptionJaimeDos = Assertions.assertThrows( Exception.class , ()-> objetoUsuarioValidaicon.validarNombre(nombreCorto) );

        //revisar el mensaje

        Assertions.assertEquals(Mensajes.NOMBRE_INVALIDO_SOLO_LETRAS.getMensaje() , exceptionJaime.getMessage() );
        Assertions.assertEquals(Mensajes.NOMBRE_INVALIDO_MUY_CORTO.getMensaje() , exceptionJaimeDos.getMessage() );

    }


}