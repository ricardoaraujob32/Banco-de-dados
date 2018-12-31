/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.function.Predicate;

/**
 *
 * @author ricardobalduino
 */
public class RestricaoString implements Predicate<String>{
    private String texto;
    
    
    @Override
    public boolean test(String t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
