/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.bancodedados.model;

import java.awt.AWTEvent;

/**
 *
 * @author ricardobalduino
 */
public abstract class TriggerEvent extends AWTEvent {
    public static final int BEFORE = 0;
    public static final int AFTER = 1;
    
    public TriggerEvent(Object source, int id) {
        super(source, id);
    }
    
}
