/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.bancodedados.model;

/**
 *
 * @author ricardobalduino
 */
public class AutoIncrementMemento {
    /**
     * 
     */
    private long ultimoValor;

    /**
     *
     */
    public AutoIncrementMemento() {
        ultimoValor = 1L;
    }
    
    /**
     * @return the ultimoValor
     */
    public long getUltimoValor() {
        return ultimoValor;
    }

    /**
     * @param ultimoValor the ultimoValor to set
     */
    public void setUltimoValor(long ultimoValor) {
        this.ultimoValor = ultimoValor;
    }
    
}
