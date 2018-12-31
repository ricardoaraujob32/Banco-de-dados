/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BancoDados;

public class BancoDadosDAO implements DAO {
    private ObjectInputStream reader;
    private ObjectOutputStream writer;
    private BancoDados bd;
    private File arquivo;

    public BancoDadosDAO(BancoDados bd) throws GenericDAOException {
        this.bd = bd;
        arquivo = new File( bd.getCaminhoArquivo() );
        
        try {
            reader = new ObjectInputStream( Files.newInputStream( arquivo.toPath() , StandardOpenOption.READ) );
            writer = new ObjectOutputStream( Files.newOutputStream(arquivo.toPath(),
                    StandardOpenOption.WRITE, StandardOpenOption.CREATE_NEW, StandardOpenOption.TRUNCATE_EXISTING) );
        } catch (IOException ex) {
            throw new GenericDAOException(ex);
        }
    }

    @Override
    public void criar() throws GenericDAOException {
        try {
            if ( arquivo.createNewFile() ){
                writer.writeObject(bd);
            }            
        } catch (IOException ex) {
            throw new GenericDAOException("Não foi possível criar o arquivo " + arquivo.getName(), ex);
        }
    }

    @Override
    public void salvar() throws GenericDAOException {
        try {
            if ( arquivo.exists() ){                
                writer.writeObject(bd);
            }
        } catch (IOException ex) {
            throw new GenericDAOException("Erro ao atualizar arquivo " + arquivo.getName(), ex);
        }
    }

    @Override
    public BancoDados abrir() throws GenericDAOException {
        BancoDados bdNovo = null;
        
        try {
            bdNovo = (BancoDados) reader.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            throw new GenericDAOException("Erro ao ler arquivo " + arquivo.getName(), ex);
        }
        
        return bdNovo;
    }

    @Override
    public void apagar() throws GenericDAOException {
        try {
            Files.delete( arquivo.toPath() );
        } catch (IOException ex) {
            throw new GenericDAOException("Erro ao apagar arquivo " + arquivo.getName(), ex);
        }
    }

    @Override
    public void fechar() throws GenericDAOException {
        try {
            reader.close();
            writer.close();
        } catch (IOException ex) {
            throw new GenericDAOException("Erro ao fechar arquivo " + arquivo.getName(), ex);
        }
    } 
    
}
