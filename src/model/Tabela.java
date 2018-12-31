/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

/**
 *
 * @author ricardobalduino
 */
public class Tabela implements Serializable {
    private long id;
    private String nome;
    private Map<Long, Registro> mapaRegistros;
    private Map<String, Coluna> mapaTipos;
    private ChavePrimaria chavePrimaria;

    public Tabela(String nome) {
        this.id = nome.hashCode();
        this.nome = nome;
        this.mapaRegistros = new ConcurrentHashMap<>(50, 0.75f, 4);
        this.mapaTipos = new HashMap<>();
        chavePrimaria = new ChavePrimaria();
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void adicionarRegistro(long id, Registro registro)
            throws NaoPodeCadastrarException
    {
        if ( mapaRegistros.containsKey(id) ) {
            throw new NaoPodeCadastrarException("Não é permitido duplicar um registro.");
        }
            
        Objects.requireNonNull(registro, "Parâmetro inválido para a inserção.");       
        mapaRegistros.put(id, registro);        
    }
    
    public void excluirRegistro(long id)
            throws NaoPodeDeletarException
    {
        if ( !mapaRegistros.containsKey(id) ) {
            throw new NaoPodeDeletarException("O registro procurado não foi encontrado.");
        }
        
        mapaRegistros.remove(id);
    }
    
    public boolean atualizarRegistro(long id, Registro antigo, Registro novo)
            throws NullPointerException, NaoPodeAtualizarException
    {
        if ( !mapaRegistros.containsKey(id) ) {
            throw new NaoPodeAtualizarException("O registro procurado não foi encontrado.");
        }
        
        Objects.requireNonNull(antigo, "Parâmetros inválidos para a consulta.");
        Objects.requireNonNull(novo, "Parâmetros inválidos para a consulta.");       
        return mapaRegistros.replace(id, antigo, novo);
    }
    
    public Registro consultarRegistro(long id)
            throws NullPointerException, NaoPodePesquisarException
    {
        if ( !mapaRegistros.containsKey(id) ){
            throw new NaoPodePesquisarException("O registro procurado não foi encontrado.");
        }
        
        Registro r = mapaRegistros.get(id);    
        
        Objects.requireNonNull(r, "O registro não existe");
        
        return r;
    }
    
    public List<Registro> consultarRegistros(Predicate<Registro> p){
        ArrayList<Registro> lista = new ArrayList<>( mapaRegistros.values() );
        
        lista.removeIf( p.negate() );
        
        return lista;
    }
    
    public void criarColuna(Coluna c) throws NaoPodeCadastrarException {
        if ( mapaTipos.containsKey( c.getNome() ) ){
            throw new NaoPodeCadastrarException( String.format( "A coluna %s já existe!", c.getNome() ) );
        }
        
        mapaTipos.put( c.getNome(), c);
    }
    
     public void excluirColuna(String nome) throws NaoPodeDeletarException {
        if ( !mapaTipos.containsKey(nome) ) {
            throw new NaoPodeDeletarException( String.format( "A coluna %s não existe!", nome ) );
        }
        
        mapaTipos.remove(nome);
    }
    
    public boolean atualizarColuna(String nome, Coluna antigo, Coluna novo)
            throws NullPointerException, NaoPodeAtualizarException
    {
        if ( !mapaTipos.containsKey(nome) ) {
            throw new NaoPodeAtualizarException( String.format( "A coluna %s não existe!", nome ) );
        }
        
        if (antigo == null || novo == null) {
            throw new NullPointerException("Parâmetros inválidos para a consulta.");
        }
        
        return mapaTipos.replace(nome, antigo, novo);
    }
    
    public Set<Coluna> consultarColunas() {
        return new HashSet<>( mapaTipos.values() );        
    }
    
//    public List<Object> consultarRegistro(Object obj)
//            throws ClassCastException, NullPointerException, IllegalArgumentException
//    {
//        if (obj == null) {
//            throw new NullPointerException("Parâmetro inválido para a consulta.");
//        }
//        
//        Set<Entry<Integer, List<Object> > > set = mapaRegistros.entrySet();
//        List<Object> l[];
//        
//        for (Entry e : set){
//            
//        }
//    }

    /**
     * @return the chavePrimaria
     */
    public ChavePrimaria getChavePrimaria() {
        return chavePrimaria;
    }

    /**
     * @param chavePrimaria the chavePrimaria to set
     */
    public void setChavePrimaria(String nome, Coluna coluna, boolean autoIncrement) {
        if ( nome.trim().isEmpty() ){
            nome = "pk_" + this.nome;
        }
        
        Objects.requireNonNull(coluna, "A chave primária deve conter uma coluna");
        chavePrimaria.setNome(nome);
        chavePrimaria.setColuna(coluna);
        chavePrimaria.setAutoIncrement(autoIncrement);
    }
}
