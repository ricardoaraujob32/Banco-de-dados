/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.bancodedados.model;

import java.util.Set;
import java.util.function.Predicate;


public abstract class RestricaoNumerica<E> implements Predicate<E> {
    protected E valorMinimo;
    protected E valorMaximo;
    protected E valorExato;
    protected Set<E> valores;

    /**
     * @return the valorMinimo
     */
    public E getValorMinimo() {
        return valorMinimo;
    }

    /**
     * @return the valorMaximo
     */
    public E getValorMaximo() {
        return valorMaximo;
    }

    /**
     * @return the valores
     */
    public Set<E> getValores() {
        return valores;
    }

    /**
     * @param valorMinimo the valorMinimo to set
     */
    public void setValorMinimo(E valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    /**
     * @param valorMaximo the valorMaximo to set
     */
    public void setValorMaximo(E valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    /**
     * @param valores the valores to set
     */
    public void setValores(Set<E> valores) {
        this.valores = valores;
    }

    /**
     * @return the valorExato
     */
    public E getValorExato() {
        return valorExato;
    }

    /**
     * @param valorExato the valorExato to set
     */
    public void setValorExato(E valorExato) {
        this.valorExato = valorExato;
    }
    
    
}
