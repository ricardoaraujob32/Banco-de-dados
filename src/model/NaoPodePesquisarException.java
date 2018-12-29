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
public class NaoPodePesquisarException extends Exception {

    /**
     * Creates a new instance of <code>NaoPodePesquisarException</code> without
     * detail message.
     */
    public NaoPodePesquisarException() {
    }

    /**
     * Constructs an instance of <code>NaoPodePesquisarException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NaoPodePesquisarException(String msg) {
        super(msg);
    }
}
