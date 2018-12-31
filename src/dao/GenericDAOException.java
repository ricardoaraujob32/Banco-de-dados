/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author ricardobalduino
 */
public class GenericDAOException extends Exception {

    public GenericDAOException(String message, Exception e) {
        super(message, e);
    }    
    
    public GenericDAOException(Exception e) {
        super(e);
    }
    
    public GenericDAOException(String message) {
        super(message);
    }

    

    
    
}
