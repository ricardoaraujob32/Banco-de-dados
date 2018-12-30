/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ricardobalduino
 */
public class ChavePrimaria {
    private String nome;
    private Coluna coluna;
    private Set<Long> valores;

    public ChavePrimaria() {
        nome = "";
        coluna = new Coluna("", TipoDados.LONG);
        valores = new HashSet<>();
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the coluna
     */
    public Coluna getColuna() {
        return coluna;
    }

    /**
     * @return the valores
     */
    public Set<Long> getValores() {
        return valores;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param coluna the coluna to set
     */
    public void setColuna(Coluna coluna) {
        this.coluna = coluna;
    }

    /**
     * @param valores the valores to set
     */
    public void setValores(Set<Long> valores) {
        this.valores = valores;
    }
        
}
