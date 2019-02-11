/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.bancodedados.controller;

import com.wordpress.ricardoanalistadesistemas.bancodedados.dao.BancoDadosDAO;
import com.wordpress.ricardoanalistadesistemas.bancodedados.dao.DAO;
import com.wordpress.ricardoanalistadesistemas.bancodedados.dao.GenericDAOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.AbstractTableModel;
import com.wordpress.ricardoanalistadesistemas.bancodedados.model.BancoDados;

/**
 *
 * @author ricardobalduino
 */
public class Gerenciador extends AbstractTableModel {
    private BancoDados bancoAtual;
    private DAO dao;
    private DefaultComboBoxModel<String> cmbModelTabela;
    private DefaultComboBoxModel<String> cmbModelColuna;

    public Gerenciador() {
        bancoAtual = null;
        dao = new BancoDadosDAO();
        cmbModelTabela = new DefaultComboBoxModel<>();
        cmbModelColuna = new DefaultComboBoxModel<>();
    }    
    
    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }

    public void criarBancoDados(String caminho) {
        System.out.println("Chamou criarBancoDados com sucesso!");
    }

    public BancoDados getBDAtual() {
        return bancoAtual;
    }

    public void salvarBancoDados() {
        try {
            dao.salvar(bancoAtual);
        } catch (GenericDAOException ex) {
            Logger.getLogger(Gerenciador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void abrirBancoDados(String caminho) {
        try {
            bancoAtual = dao.abrir(caminho);
        } catch (GenericDAOException ex) {
            Logger.getLogger(Gerenciador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void apagarBancoDados(){
        try {
            dao.apagar(bancoAtual);
        } catch (GenericDAOException ex) {
            Logger.getLogger(Gerenciador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
