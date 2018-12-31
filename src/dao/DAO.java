/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.BancoDados;

/**
 *
 * @author ricardobalduino
 */
public interface DAO {
    void criar() throws GenericDAOException;
    void salvar() throws GenericDAOException;
    BancoDados abrir() throws GenericDAOException;
    void apagar() throws GenericDAOException;
    void fechar() throws GenericDAOException;
}
