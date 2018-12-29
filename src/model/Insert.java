/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.text.ParsePosition;
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
    }   
    
    @Override
    public TipoConsulta getTipoConsulta() {
        return TipoConsulta.INSERT;
    }

    @Override
    public void executar() {
        
    }

    @Override
    public void interpretar() throws ParseException {
        StringTokenizer tokenizer = new StringTokenizer(sql, " (),", true);
        String aux;
        ParseException e = new ParseException("Erro ao interpretar INSERT", 0);
        
        if ( !sql.contains("INSERT INTO ") || !sql.contains("VALUES") ){
            throw e;
        }        
        
        tokenizer.nextToken();
        tokenizer.nextToken();
        tokenizer.nextToken();
        tokenizer.nextToken();
        
        nomeTabela = tokenizer.nextToken();
                
        listaColunas = new ArrayList<>();

        while ( tokenizer.hasMoreTokens()  ) {
            aux = tokenizer.nextToken();

            if ( aux.equals("VALUES") ){
                break;
            }

            listaColunas.add(aux);
        }

        listaValores = new ArrayList<>( listaColunas.size() );

        while ( tokenizer.hasMoreTokens()  ) {
            aux = tokenizer.nextToken();

            listaValores.add(aux);
        }

        if ( listaColunas.size() != listaValores.size() ){
            throw e;
        }
        
        
        throw e; 
    }
}
