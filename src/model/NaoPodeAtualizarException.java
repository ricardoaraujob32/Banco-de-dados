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
public class NaoPodeAtualizarException extends Exception {

    /**
     * Creates a new instance of <code>NaoPodeAtualizarException</code> without
     * detail message.
     */
    public NaoPodeAtualizarException() {
    }

    /**
     * Constructs an instance of <code>NaoPodeAtualizarException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NaoPodeAtualizarException(String msg) {
        super(msg);
    }
}
