/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.bancodedados.model;

import java.io.Serializable;

/**
 *
 * @author ricardobalduino
 */
public class Dado<E> implements Cloneable, Serializable {
    private E dado;

    public Dado() {
        dado = null;
    }

    public Dado(E dado) {
        this.dado = dado;
    }
        
    /**
     * @return the dado
     */
    public E getDado() {
        return dado;
    }

    /**
     * @param dado the dado to set
     */
    public void setDado(E dado) {
        this.dado = dado;
    }

    @Override
    public Dado<E> clone() throws CloneNotSupportedException {
        return new Dado<>( getDado() );       
    }
        
}
