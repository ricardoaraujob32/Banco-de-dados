/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author ricardobalduino
 */
public class Insert extends Consulta {
    private String nomeTabela;
    private List<String> listaColunas;
    private List<String> listaValores;

    public Insert(String sql) {
        super(sql);
        nomeTabela = "";
        listaColunas = new ArrayList<>();
        listaValores = new ArrayList<>();
    }
    
    public String getNomeTabela(){
        return nomeTabela;
    }
    
    public List<String> getListaColunas(){
        return listaColunas;
    }
    
    public List<String> getListaValores(){
        return listaValores;
    }
    
    @Override
    public TipoConsulta getTipoConsulta() {
        return TipoConsulta.INSERT;
    }

    @Override
    public void interpretar() throws ParseException {
        StringTokenizer tokenizer = new StringTokenizer(sql, " (),\n\r\t\f");
        String aux;
        ParseException e = new ParseException("Erro ao interpretar INSERT", 0);
        
        if ( !sql.contains("INSERT INTO ") || !sql.contains("VALUES") ){
            throw e;
        }
        
        while ( tokenizer.hasMoreTokens() ){
            aux = tokenizer.nextToken();
            
            switch (aux){
                case "INSERT":
                break;
                
                case "INTO":
                    nomeTabela = tokenizer.nextToken();
                    aux = tokenizer.nextToken();
                    
                    while ( !isPalavraResevada(aux) ){
                        listaColunas.add(aux);
                        aux = tokenizer.nextToken();
                    }
                break;
                
                case "VALUES":
                    listaValores = new ArrayList<>( listaColunas.size() );
                    
                    while ( tokenizer.hasMoreTokens() ){
                        aux = tokenizer.nextToken();
                        listaValores.add(aux);
                    }
                break;
            }
        }

        if ( listaColunas.size() != listaValores.size() ){
            throw e;
        } 
    }

    @Override
    public boolean isPalavraResevada(String token) {
        String[] ignorados = {"INSERT", "INTO", "VALUES"};
        boolean ignora = false;
        
        for (String s : ignorados) {
            if ( s.equals(token) ){
                ignora = true;
                break;
            }
        }
        
        return ignora;
    }
}
