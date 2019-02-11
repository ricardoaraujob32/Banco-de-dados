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
public class NaoPodeCadastrarException extends Exception {

    /**
     * Creates a new instance of <code>NaoPodeCadastrarException</code> without
     * detail message.
     */
    public NaoPodeCadastrarException() {
    }

    /**
     * Constructs an instance of <code>NaoPodeCadastrarException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NaoPodeCadastrarException(String msg) {
        super(msg);
    }
}
