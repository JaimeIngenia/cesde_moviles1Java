package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello worldhhgh!");
        //Creando fechas con java y librería LocalDate

        //Fecha del sistema
        LocalDate fechaDeHoy = LocalDate.now();
        System.out.println(fechaDeHoy);

        //Fecha configurada por el usuario
        LocalDate fechaConfigurada = LocalDate.of(2023,1,24);
        System.out.println(fechaConfigurada);

        //Obtener de una fecha SOLO EL AÑO
        Integer ano = fechaConfigurada.getYear();
        System.out.println("El año es:" + ano);

        //Obtener EL MES
        Integer mes = fechaConfigurada.getMonthValue();
        System.out.println("El mes es : " + mes);

        //Obtener el DÍA
        Integer dia = fechaConfigurada.getDayOfMonth();
        System.out.println("El día es : dia");

        //3. Fecha configurada por el usuario
        LocalDate fechaConfigurada_uno = LocalDate.now();
        LocalDate fechaConfigurada_dos = LocalDate.of(2023,7,18);
        Long diferencia = ChronoUnit.DAYS.between(fechaConfigurada_uno,fechaConfigurada_dos);
        System.out.println("La diferencia entre fechas por días es: " + diferencia);


        //4. Vencidos
        Boolean vencido_uno = fechaConfigurada_uno.isBefore(fechaConfigurada_dos);
        Boolean vencido_dos = fechaConfigurada_uno.isAfter(fechaConfigurada_dos);
        System.out.println("La fecha uno es antes de la fecha dos?" + vencido_uno );
        System.out.println("La fecha uno es despues de la fecha dos?" + vencido_dos );

        //5. Agregando días a una fecha
        LocalDate fecha_ejemplo5 = LocalDate.now();
        LocalDate x = fecha_ejemplo5.plusDays(7);
        LocalDate y = fecha_ejemplo5.minusDays(7);
        System.out.println("El día siguiente del ejemplo 5 es:" + x );
        System.out.println("El día anterior del ejemplo 5 es:" + y );

        //6. Cambiando el formato de un local Date

        DateTimeFormatter formatoJaime = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nuevaFecha = LocalDate.of(2023,7,26);
        //hagamos un string
        String fechaFormateada = nuevaFecha.format(formatoJaime);
        System.out.println("Fecha sin formato : "+ nuevaFecha);
        System.out.println("Fecha con El formato es : " + fechaFormateada );

    }
}