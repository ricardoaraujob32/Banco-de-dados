/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;

/**
 *
 * @author ricardobalduino
 */
public abstract class Consulta {
    protected String sql;
    
    public Consulta(String sql){
        this.sql = sql;
    }
    
    /**
     * @return the sql
     */
    public String getSql() {
        return sql;
    }

    /**
     * @param sql the sql to set
     */
    public void setSql(String sql) {
        this.sql = sql;
    }
    
    /**
     *
     * @return
     */
    public abstract TipoConsulta getTipoConsulta(); 
    
    public abstract void interpretar() throws ParseException;
    
    public abstract void executar();
}
