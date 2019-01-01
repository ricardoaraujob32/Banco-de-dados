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
import model.BancoDados;

public class BancoDadosDAO implements DAO {
    
    @Override
    public void criar(BancoDados bd) throws GenericDAOException {
        File arquivo = new File( bd.getCaminhoArquivo() );
        
        try {
            try ( ObjectOutputStream writer = new ObjectOutputStream( Files.newOutputStream( arquivo.toPath(),
                    StandardOpenOption.WRITE, StandardOpenOption.CREATE_NEW ) ) )
            {
                writer.writeObject(bd);
            }
        } catch (IOException ex) {
            throw new GenericDAOException("Não foi possível criar o arquivo " + arquivo.getName(), ex);
        }
    }

    @Override
    public void salvar(BancoDados bd) throws GenericDAOException {
        File arquivo = new File( bd.getCaminhoArquivo() );
        
        try {
            try ( ObjectOutputStream writer = new ObjectOutputStream( Files.newOutputStream( arquivo.toPath(),
                    StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING ) ) )
            {
                writer.writeObject(bd);
            }
        } catch (IOException ex) {
            throw new GenericDAOException("Erro ao atualizar arquivo " + arquivo.getName(), ex);
        }
    }

    @Override
    public BancoDados abrir(String caminho) throws GenericDAOException {
        BancoDados bd = null;
        File arquivo = new File(caminho);
        
        try {
            try ( ObjectInputStream reader = new ObjectInputStream( Files.newInputStream( arquivo.toPath() , StandardOpenOption.READ) ) )
            {
                bd = (BancoDados) reader.readObject();
            }
        } catch (IOException | ClassNotFoundException ex) {
            throw new GenericDAOException("Erro ao ler arquivo " + arquivo.getName(), ex);
        }
        
        return bd;
    }

    @Override
    public void apagar(BancoDados bd) throws GenericDAOException {
        File arquivo = new File( bd.getCaminhoArquivo() );
        
        try {
            Files.delete( arquivo.toPath() );
        } catch (IOException ex) {
            throw new GenericDAOException("Erro ao apagar arquivo " + arquivo.getName(), ex);
        }
    }    
}
