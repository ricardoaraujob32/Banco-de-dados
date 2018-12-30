/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ricardobalduino
 */
public class Interpretador {
    public static void executar(Consulta c){
        if ( c.getTipoConsulta() == TipoConsulta.INSERT ){
            Insert insert = (Insert) c;
        }
    }
}
