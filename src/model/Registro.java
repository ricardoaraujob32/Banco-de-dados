/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricardobalduino
 */
public class Registro {
    private List<Dado> listaDados;
    private Tabela tabela;

    public Registro(Tabela tabela) {
        this.tabela = tabela;
        listaDados = new ArrayList<>( tabela.consultarColunas().size() );
    }
            
    /**
     * @return the listaDados
     */
    public List<Dado> getListaDados() {
        return listaDados;
    }

    public void atualizarDado(int indice, Dado d){
        listaDados.set(indice, d);
    }
    
    public void excluirDado(int indice){
        listaDados.set(indice, null);
    }
    
    public Dado getDado(int indice){
        return listaDados.get(indice);
    }
    
    public boolean isNull(int indice){
        return listaDados.get(indice) == null;
    }
}
