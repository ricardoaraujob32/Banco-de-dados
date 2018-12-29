/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ricardobalduino
 */
public class Coluna {
    private long id;
    private String nome;
    private TipoDados tipo;

    public Coluna(String nome, TipoDados tipo) {
        id = nome.hashCode();
        this.nome = nome;
        this.tipo = tipo;
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
    
}
