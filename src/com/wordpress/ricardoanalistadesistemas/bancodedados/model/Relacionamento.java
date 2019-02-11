/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wordpress.ricardoanalistadesistemas.bancodedados.model;

import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author ricardobalduino
 */
public class Relacionamento implements Serializable {
    private Tabela tabelaDependente;
    private Tabela tabelaAlvo;
    private String nome;
    private Coluna colunaDependente;
    private Coluna colunaAlvo;

    public Relacionamento(String nome) {
        this.nome = nome;
        tabelaDependente = new Tabela("");
        tabelaAlvo = new Tabela("");
    }

    /**
     * @return the tabelaDependente
     */
    public Tabela getTabelaDependente() {
        return tabelaDependente;
    }

    /**
     * @return the tabelaAlvo
     */
    public Tabela getTabelaAlvo() {
        return tabelaAlvo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param tabelaDependente the tabelaDependente to set
     */
    public void setTabelaDependente(Tabela tabelaDependente) {
        this.tabelaDependente = tabelaDependente;
    }

    /**
     * @param tabelaAlvo the tabelaAlvo to set
     */
    public void setTabelaAlvo(Tabela tabelaAlvo) {
        this.tabelaAlvo = tabelaAlvo;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the colunaDependente
     */
    public Coluna getColunaDependente() {
        return colunaDependente;
    }

    /**
     * @return the colunaAlvo
     */
    public Coluna getColunaAlvo() {
        return colunaAlvo;
    }

    /**
     * @param colunaDependente the colunaDependente to set
     */
    public void setColunaDependente(Coluna c) {
        Set<Coluna> colunas = tabelaDependente.consultarColunas();
        
        for (Coluna coluna : colunas) {
            if ( coluna.equals(c) ){
                colunaDependente = c;
                return;
            }
        }
        
        throw new IllegalArgumentException("Coluna inexistente");
    }

    /**
     * @param colunaAlvo the colunaAlvo to set
     */
    public void setColunaAlvo(Coluna c) {
        Set<Coluna> colunas = tabelaAlvo.consultarColunas();
        
        for (Coluna coluna : colunas) {
            if ( coluna.equals(c) ){
                colunaAlvo = c;
                return;
            }
        }
        
        throw new IllegalArgumentException("Coluna inexistente");
    }
    
    
    
     
}
