/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.bancodedados.model;

import java.util.EventListener;

/**
 *
 * @author ricardobalduino
 */
public interface DeleteListener extends EventListener {
    void beforeDelete(DeleteEvent e);
    void afterDelete(DeleteEvent e);
}
