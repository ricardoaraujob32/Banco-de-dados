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
public class Dado<E> {
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
        
}
