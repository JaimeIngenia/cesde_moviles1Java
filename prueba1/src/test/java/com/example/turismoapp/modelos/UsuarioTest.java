package com.example.turismoapp.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    private Usuario objetoUsuario;

    @BeforeEach
    public void configuracionInicial(){ // Estandar sería SetUp la configuracion inicial
        this.objetoUsuario = new Usuario();
        }

    @Test
    public void setCorrectoNombres () {

        String nombrePruebaValido = "Jaime Andrés Moncayo Parra";  //PREPARANDO

        this.objetoUsuario.setNombres( nombrePruebaValido );  //Probando y Ejecutando el set

        Assertions.assertEquals(nombrePruebaValido  , this.objetoUsuario.getNombres()); //VERIFICAR
    }

    @Test
    public void setIncorrectoNombres(){}

}