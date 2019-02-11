/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wordpress.ricardoanalistadesistemas.bancodedados.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 *
 * @author ricardobalduino
 */
public class BancoDados implements Serializable {
    private Map<String, Tabela> mapaTabelas;
    private String nome;
    private String caminhoArquivo;
    private boolean modificado;

    public BancoDados(String nome, String caminhoArquivo) {
        this.mapaTabelas = new HashMap<>();
        this.nome = nome;
        this.caminhoArquivo = caminhoArquivo;
        this.modificado = false;
    }
   
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
        modificado = true;
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
        modificado = true;
    }

    /**
     * @param modificado the modificado to set
     */
    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }
    
    public void adicionarTabela(String nome)
            throws NaoPodeCadastrarException{
        if ( nome == null || nome.trim().equals("") ){
            throw new IllegalArgumentException("O nome da tabela não pode ser vazio");
        }
        
        if ( mapaTabelas.containsKey(nome) ){
            throw new NaoPodeCadastrarException("A tabela " + nome + " já existe");
        }        
        
        Tabela tabela = new Tabela(nome);
        
        mapaTabelas.put(nome, tabela);
        modificado = true;
    }
    
    public void excluirTabela(String nome)
            throws IllegalArgumentException, NaoPodeDeletarException{
        if ( nome == null || nome.trim().equals("") ){
            throw new IllegalArgumentException("O nome da tabela não pode ser vazio");
        }
        
        if ( !mapaTabelas.containsKey(nome) ){
            throw new NaoPodeDeletarException("A tabela " + nome + " não existe");
        }
        
        mapaTabelas.remove(nome);
        modificado = true;
    }
    
    public void adicionarRegistro(String tabela, long id, Registro registro)
            throws NaoPodeCadastrarException, ObjetoNaoExistente
    {   
        if ( !mapaTabelas.containsKey(tabela) ){
            throw new ObjetoNaoExistente("A tabela " + tabela + " não existe");
        }
        
        mapaTabelas.get(tabela).adicionarRegistro(id, registro);
        modificado = true;        
    }
    
    public void excluirRegistro(String tabela, long id)
            throws NaoPodeDeletarException, ObjetoNaoExistente
    {
        if ( !mapaTabelas.containsKey(tabela) ){
            throw new ObjetoNaoExistente("A tabela " + tabela + " não existe");
        }
        
        mapaTabelas.get(tabela).excluirRegistro(id);
        modificado = true;
    }
    
    public void atualizarRegistro(String tabela, long id, Registro novo)
            throws NaoPodeAtualizarException, ObjetoNaoExistente, NaoPodePesquisarException
    {
        if ( !mapaTabelas.containsKey(tabela) ){
            throw new ObjetoNaoExistente("A tabela " + tabela + " não existe");
        }        
        
        Tabela t = mapaTabelas.get(tabela);
        Registro antigo = t.consultarRegistro(id);
        t.atualizarRegistro(id, antigo, novo);
        modificado = true;
    }
        
    public List<Registro> consultarRegistros(String tabela, Predicate<Registro> p)
            throws ObjetoNaoExistente
    {
        if ( !mapaTabelas.containsKey(tabela) ){
            throw new ObjetoNaoExistente("A tabela " + tabela + " não existe");
        }
        
        return mapaTabelas.get(tabela).consultarRegistros(p);
    }
    
    public void criarColuna(String tabela, Coluna c)
            throws NaoPodeCadastrarException, ObjetoNaoExistente
    {
        if ( !mapaTabelas.containsKey(tabela) ){
            throw new ObjetoNaoExistente("A tabela " + tabela + " não existe");
        }
        
        mapaTabelas.get(tabela).criarColuna(c);
        modificado = true;
    }
    
     public void excluirColuna(String tabela, String coluna)
             throws NaoPodeDeletarException, ObjetoNaoExistente
     {
        if ( !mapaTabelas.containsKey(tabela) ){
            throw new ObjetoNaoExistente("A tabela " + tabela + " não existe");
        }
        
        mapaTabelas.get(tabela).excluirColuna(coluna);
        modificado = true;
    }
    
    public void atualizarColuna(String tabela, String coluna, Coluna novo)
            throws NaoPodeAtualizarException, ObjetoNaoExistente
    {
        if ( !mapaTabelas.containsKey(tabela) ){
            throw new ObjetoNaoExistente("A tabela " + tabela + " não existe");
        }
        
        Tabela t = mapaTabelas.get(tabela);
        Coluna antigo = t.consultarColuna(coluna);
        
        t.atualizarColuna(coluna, antigo, novo);
        modificado = true;
    }
}
