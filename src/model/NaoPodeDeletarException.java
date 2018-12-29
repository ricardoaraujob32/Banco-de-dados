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
public class NaoPodeDeletarException extends Exception {

    /**
     * Creates a new instance of <code>NaoPodeDeletarException</code> without
     * detail message.
     */
    public NaoPodeDeletarException() {
    }

    /**
     * Constructs an instance of <code>NaoPodeDeletarException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NaoPodeDeletarException(String msg) {
        super(msg);
    }
}
