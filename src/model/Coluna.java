/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author ricardobalduino
 */
public class Coluna implements Cloneable, Serializable {
    private long id;
    private String nome;
    private TipoDados tipo;
    private boolean chavePrimaria;
    private boolean aceitaNull;
    private List<Predicate> listaRestricoes;

    public Coluna(String nome, TipoDados tipo) {
        id = nome.hashCode();
        this.nome = nome;
        this.tipo = tipo;
        chavePrimaria = false;
        aceitaNull = true;
        listaRestricoes = new ArrayList<>();
    }   

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the tipo
     */
    public TipoDados getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoDados tipo) {
        this.tipo = tipo;
    }

    @Override
    public Coluna clone() throws CloneNotSupportedException {
        return new Coluna(nome, tipo);
    }

    /**
     * @return the chavePrimaria
     */
    public boolean isChavePrimaria() {
        return chavePrimaria;
    }

    /**
     * @param chavePrimaria the chavePrimaria to set
     */
    public void setChavePrimaria(boolean chavePrimaria) {
        this.chavePrimaria = chavePrimaria;
        
        if ( chavePrimaria ){
            aceitaNull = false;
        }
    }    

    /**
     * @return the aceitaNull
     */
    public boolean isAceitaNull() {
        return aceitaNull;
    }

    /**
     * @param aceitaNull the aceitaNull to set
     */
    public void setAceitaNull(boolean aceitaNull) {
        this.aceitaNull = aceitaNull;
    }
}
