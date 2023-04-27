package com.clase15;

import java.util.ArrayList;
import javax.sound.*;
// json

// importar librerias para serializar json y xml
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

// importar librerias para serializar json yxml
import java.io.File;


import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.Collectors;
// importar librerias para serializar json yxml
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting..." );
        String ofertas; 
        String opcionSerializacion;
        
        // if (args.length == 2) {
        //     if (args[0] == "ofertas.cvs" ){
        //         ofertas = args[0];
        //         opcionSerializacion = args[1];           
        //     } else {
        //         ofertas = args[1];
        //         opcionSerializacion = args[2];    
        //     }
        // }else{
            //  C:\Users\Willy\Desktop\PracticaJava\modulo1\Clase15\app\src\test\resources
             ofertas = "C:\\Users\\Willy\\Desktop\\PracticaJava\\modulo1\\Clase15\\app\\src\\test\\resources\\ofertas.csv";
             opcionSerializacion= "JSON";
        // }
        System.out.println( "Archivo de ofertas: " + ofertas );
        LectorCsv lectorCsv = new LectorCsv(ofertas);
        ArrayList<Ofertas> ofertasList = new ArrayList<Ofertas>();
        lectorCsv.parsearOfertas();
        ofertasList = lectorCsv.cargarOfertas();
       // ingresar por consola si se desea serializar a JSON o XML

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Ingrese el tipo de serializacion: (J/X)");
        // opcionSerializacion = sc.nextLine();

       //   if (opcionSerializacion.equals("j") || opcionSerializacion.equals("J") ){
            // serializar a JSON
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            for (Ofertas oferta : ofertasList) {
                try {
                   String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(oferta);
                    System.out.println(json);
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
            }
        // }
     // ************************************************
     // NOTA TENGO QUE CONTINUAR CON ESTE EJERCICIO
     // ************************************************

        // if (opcionSerializacion.equals("x") || opcionSerializacion.equals("X")){
        //     System.out.println("Serializando a XML");
        //     // Serializar a XML
        //     ObjectMapper objectMapper = new ObjectMapper();
        //     objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        //     for (Ofertas oferta : ofertasList) {
        //         try {
        //             System.out.println("Serializando a XML");
        //             System.out.println(oferta.toString());
        //             String xml = objectMapper.writeValueAsString(oferta);
        //             System.out.println(xml);
        //         } catch (JsonProcessingException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // }
        System.out.println( "Ofertas cargadas: " + ofertasList.size() );


    }
}
