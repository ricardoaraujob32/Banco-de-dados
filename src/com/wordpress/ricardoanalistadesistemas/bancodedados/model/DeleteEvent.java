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
public class DeleteEvent extends TriggerEvent {
    
    public DeleteEvent(Object source, int id) {
        super(source, id);
    }
    
}
