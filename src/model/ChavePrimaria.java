/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ricardobalduino
 */
public class ChavePrimaria implements Serializable {
    private String nome;
    private Coluna coluna;
    private Set<Long> valores;
    private boolean autoIncrement;
    private AutoIncrementMemento memento;

    public ChavePrimaria() {
        nome = "";
        coluna = new Coluna("", TipoDados.LONG);
        valores = new HashSet<>();
        autoIncrement = false;
        memento = new AutoIncrementMemento();
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
    public boolean adicionarValor(long num) {
        return valores.add(num);
    }

    /**
     * @return the autoIncrement
     */
    public boolean isAutoIncrement() {
        return autoIncrement;
    }

    /**
     * @return the memento
     */
    public long getUltimoValorAutoIncrement() {
        long valor = memento.getUltimoValor();
        
        memento.setUltimoValor( valor + 1 );
        
        return valor;
    }

    /**
     * @param autoIncrement the autoIncrement to set
     */
    public void setAutoIncrement(boolean autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    /**
     * @param memento the memento to set
     */
    public void setUltimoValorAutoIncrement(long valor) {
        if (valor <= 0){
            throw new IllegalArgumentException("O valor da chave primária não pode ser menor ou igual a zero");
        }
        
        memento.setUltimoValor(valor);
    }
        
}
