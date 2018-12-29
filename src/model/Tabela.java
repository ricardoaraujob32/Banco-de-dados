/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

/**
 *
 * @author ricardobalduino
 */
public class Tabela {
    private long id;
    private String nome;
    private Map<Long, List<Object> > mapaRegistros;
    private Map<String, Coluna> mapaTipos;

    public Tabela(String nome) {
        this.id = nome.hashCode();
        this.nome = nome;
        this.mapaRegistros = new ConcurrentHashMap<>(50, 0.75f, 4);
        this.mapaTipos = new HashMap<>();
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
    
    public void adicionarRegistro(long id, List<Object> campos)
            throws NaoPodeCadastrarException
    {
        if ( mapaRegistros.containsKey(id) ) {
            throw new NaoPodeCadastrarException("Não é permitido duplicar um registro.");
        }
                
        if (campos == null) {
            throw new NullPointerException("Parâmetro inválido para a inserção.");
        }
        
        mapaRegistros.put(id, campos);        
    }
    
    public void excluirRegistro(long id)
            throws NaoPodeDeletarException
    {
        if ( !mapaRegistros.containsKey(id) ) {
            throw new NaoPodeDeletarException("O registro procurado não foi encontrado.");
        }
        
        mapaRegistros.remove(id);
    }
    
    public boolean atualizarRegistro(long id, List<Object> antigo, List<Object> novo)
            throws NullPointerException, NaoPodeAtualizarException
    {
        if ( !mapaRegistros.containsKey(id) ) {
            throw new NaoPodeAtualizarException("O registro procurado não foi encontrado.");
        }
        
        if (antigo == null || novo == null) {
            throw new NullPointerException("Parâmetros inválidos para a consulta.");
        }
        
        return mapaRegistros.replace(id, antigo, novo);
    }
    
    public List<Object> consultarRegistro(long id)
            throws NullPointerException, NaoPodePesquisarException
    {
        if ( !mapaRegistros.containsKey(id) ){
            throw new NaoPodePesquisarException("O registro procurado não foi encontrado.");
        }
        
        List<Object> l = mapaRegistros.get(id);
        
        if (l == null){
            throw new NullPointerException("O registro não existe");
        }
        
        return l;
    }
    
    public List< List<Object> > consultarRegistros(Predicate< List<Object> > p){
        ArrayList< List<Object> > lista = new ArrayList<>( mapaRegistros.values() );
        
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
}
