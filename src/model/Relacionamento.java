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
public class Relacionamento {
    private int id_tabela;
    private int id_registro;

    public Relacionamento(int id_tabela, int id_registro) {
        this.id_tabela = id_tabela;
        this.id_registro = id_registro;
    }

    public void setId_tabela(int id_tabela) {
        this.id_tabela = id_tabela;
    }

    public void setId_registro(int id_registro) {
        this.id_registro = id_registro;
    }

    public int getId_tabela() {
        return id_tabela;
    }

    public int getId_registro() {
        return id_registro;
    }
    
    
}
