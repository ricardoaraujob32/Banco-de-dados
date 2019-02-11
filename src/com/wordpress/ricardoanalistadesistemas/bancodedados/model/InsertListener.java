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
public interface InsertListener extends EventListener {
    void beforeInsert(InsertEvent e);
    void afterInsert(InsertEvent e);
}
