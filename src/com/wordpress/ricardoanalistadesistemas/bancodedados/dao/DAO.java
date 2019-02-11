/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.bancodedados.dao;

import com.wordpress.ricardoanalistadesistemas.bancodedados.model.BancoDados;

/**
 *
 * @author ricardobalduino
 */
public interface DAO {
    
    /**
     *
     * @param bd
     * @throws GenericDAOException
     */
    void criar(BancoDados bd) throws GenericDAOException;
    
    /**
     *
     * @param bd
     * @throws GenericDAOException
     */
    void salvar(BancoDados bd) throws GenericDAOException;

    /**
     *
     * @param caminho
     * @return
     * @throws GenericDAOException
     */
    BancoDados abrir(String caminho) throws GenericDAOException;

    /**
     *
     * @param bd
     * @throws GenericDAOException
     */
    void apagar(BancoDados bd) throws GenericDAOException;
}
