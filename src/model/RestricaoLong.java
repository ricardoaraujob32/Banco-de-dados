/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;


public class RestricaoLong extends RestricaoNumerica<Long> {

    public RestricaoLong() {
        valorMinimo = Long.MIN_VALUE;
        valorMaximo = Long.MAX_VALUE;
        valorExato = Long.MIN_VALUE;
        valores = new HashSet<>();                
    }

    public boolean isMenor(long valor){
        return valor < valorMaximo;
    }
    
    public boolean isMenorOuIgual(long valor){
        return valor <= valorMaximo;
    }
    
    public boolean isMaior(long valor){
        return valor > valorMinimo;
    }
    
    public boolean isMaiorOuIgual(long valor){
        return valor >= valorMinimo;
    }
    
    public boolean isIgual(long valor){
        return valor <= valorMaximo;
    }
    
    public boolean isDiferente(long valor){
        return valor <= valorMaximo;
    }
    
    @Override
    public boolean test(Long t) {
        return true;
    }
    
}
