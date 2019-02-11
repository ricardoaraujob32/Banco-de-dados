/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.bancodedados.model;

import java.text.ParseException;

/**
 *
 * @author ricardobalduino
 */
public class Compilador {
    public static void interpretar(Consulta c){
        try {
            c.interpretar();
        } catch (ParseException ex) {
            System.out.println("O compilador detectou o seguinte erro: " + ex.getMessage() );
        }
    }
}
