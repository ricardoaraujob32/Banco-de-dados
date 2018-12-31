/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author ricardobalduino
 */
public class BancoDados implements Serializable {
    private Map<String, Tabela> mapaTabelas;
    private String nome;
    private String caminhoArquivo;
    private boolean modificado;
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the caminhoArquivo
     */
    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    /**
     * @return the modificado
     */
    public boolean isModificado() {
        return modificado;
    }

    /**
     * @param caminhoArquivo the caminhoArquivo to set
     */
    public void setCaminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    /**
     * @param modificado the modificado to set
     */
    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }
    
}
