package com.example.turismoapp.utilidades;

public enum Mensajes {
    NOMBRE_INVALIDO_SOLO_LETRAS("Señor usuario su nombre solo puede tener letras"),
    NOMBRE_INVALIDO_MUY_CORTO("Señor usuario su nombre debe tener más de 10 caracteres"),
    UBICACION_INVALIDO("Señor usuario su ubicacion no es válida"),
    CORREO_INVALIDO("Señor usuario su correo esta mal no cumple con los requisitos para ser correo");
    //ATRIBUTO

    private String mensaje;

    //CONSTRUCTOR LLENO

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    //GETTERS Y SETTERS

    public String getMensaje() {
        return mensaje;
    }

}
