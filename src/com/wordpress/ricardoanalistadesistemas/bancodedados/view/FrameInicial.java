/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.bancodedados.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import com.wordpress.ricardoanalistadesistemas.bancodedados.controller.Gerenciador;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.wordpress.ricardoanalistadesistemas.bancodedados.model.BancoDados;

/**
 *
 * @author ricardobalduino
 */
public class FrameInicial extends JFrame {

    /**
     * Creates new form FrameInicial
     */
    public FrameInicial() {
        gerenciador = new Gerenciador();
        initComponents();       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelTabela = new JPanel();
        jScrollPane3 = new JScrollPane();
        jTable1 = new JTable();
        menuBar = new JMenuBar();
        menuBancoDados = new JMenu();
        menuNovo = new JMenuItem();
        menuAbrir = new JMenuItem();
        menuSalvar = new JMenuItem();
        menuExcluir = new JMenuItem();
        jMenu1 = new JMenu();
        menuTblNova = new JMenuItem();
        menuTblAbrir = new JMenuItem();
        menuTblAlterar = new JMenuItem();
        menuTblExcluir = new JMenuItem();
        menuColunas = new JMenu();
        menuCollNova = new JMenuItem();
        menuColAbrir = new JMenuItem();
        menuColAlterar = new JMenuItem();
        menuColExcluir = new JMenuItem();
        menuRegistros = new JMenu();
        menuRegistroNovo = new JMenuItem();
        menuRegistroSalvar = new JMenuItem();
        menuRegistroExcluir = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Gerenciador de Banco de Dados");
        setBackground(new Color(255, 255, 255));
        setName("frameInicial"); // NOI18N
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowDeiconified(WindowEvent evt) {
                formWindowDeiconified(evt);
            }
        });

        painelTabela.setBackground(new Color(255, 255, 255));
        painelTabela.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        painelTabela.setLayout(new BorderLayout());

        jScrollPane3.setBackground(new Color(255, 255, 255));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(gerenciador);
        jTable1.setToolTipText("");
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jTable1);

        painelTabela.add(jScrollPane3, BorderLayout.CENTER);

        getContentPane().add(painelTabela, BorderLayout.CENTER);

        menuBancoDados.setText("Banco de dados");
        menuBancoDados.setBorderPainted(true);
        menuBancoDados.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        menuBancoDados.setName(""); // NOI18N

        menuNovo.setText("Novo");
        menuNovo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuNovoActionPerformed(evt);
            }
        });
        menuBancoDados.add(menuNovo);

        menuAbrir.setText("Abrir");
        menuAbrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        menuBancoDados.add(menuAbrir);

        menuSalvar.setText("Salvar");
        menuSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuSalvarActionPerformed(evt);
            }
        });
        menuBancoDados.add(menuSalvar);

        menuExcluir.setText("Excluir");
        menuExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuExcluirActionPerformed(evt);
            }
        });
        menuBancoDados.add(menuExcluir);

        menuBar.add(menuBancoDados);

        jMenu1.setText("Tabelas");

        menuTblNova.setText("Nova");
        menuTblNova.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuTblNovaActionPerformed(evt);
            }
        });
        jMenu1.add(menuTblNova);

        menuTblAbrir.setText("Abrir");
        menuTblAbrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuTblAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(menuTblAbrir);

        menuTblAlterar.setText("Alterar");
        menuTblAlterar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuTblAlterarActionPerformed(evt);
            }
        });
        jMenu1.add(menuTblAlterar);

        menuTblExcluir.setText("Excluir");
        menuTblExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuTblExcluirActionPerformed(evt);
            }
        });
        jMenu1.add(menuTblExcluir);

        menuBar.add(jMenu1);

        menuColunas.setText("Colunas");
        menuColunas.setToolTipText("Ações");

        menuCollNova.setText("Nova");
        menuCollNova.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuCollNovaActionPerformed(evt);
            }
        });
        menuColunas.add(menuCollNova);

        menuColAbrir.setText("Abrir");
        menuColAbrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuColAbrirActionPerformed(evt);
            }
        });
        menuColunas.add(menuColAbrir);

        menuColAlterar.setText("Alterar");
        menuColAlterar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuColAlterarActionPerformed(evt);
            }
        });
        menuColunas.add(menuColAlterar);

        menuColExcluir.setText("Excluir");
        menuColExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuColExcluirActionPerformed(evt);
            }
        });
        menuColunas.add(menuColExcluir);

        menuBar.add(menuColunas);

        menuRegistros.setText("Registros");
        menuRegistros.setBorderPainted(true);
        menuRegistros.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        menuRegistros.setName(""); // NOI18N

        menuRegistroNovo.setText("Novo");
        menuRegistroNovo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuRegistroNovoActionPerformed(evt);
            }
        });
        menuRegistros.add(menuRegistroNovo);

        menuRegistroSalvar.setText("Salvar");
        menuRegistroSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuRegistroSalvarActionPerformed(evt);
            }
        });
        menuRegistros.add(menuRegistroSalvar);

        menuRegistroExcluir.setText("Excluir");
        menuRegistroExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuRegistroExcluirActionPerformed(evt);
            }
        });
        menuRegistros.add(menuRegistroExcluir);

        menuBar.add(menuRegistros);

        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowDeiconified(WindowEvent evt) {//GEN-FIRST:event_formWindowDeiconified
      pack();
    }//GEN-LAST:event_formWindowDeiconified

    private void menuNovoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuNovoActionPerformed
        JFileChooser chooser = new JFileChooser();
        
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int resp = chooser.showOpenDialog(this);
        
        if (resp == JFileChooser.APPROVE_OPTION){
            File arquivo = chooser.getSelectedFile();
            String nome = JOptionPane.showInputDialog(
                    null, "Digite o nome do novo banco de dados:", "Novo banco de dados", JOptionPane.QUESTION_MESSAGE);

            if ( arquivo != null && nome != null && !nome.trim().equals("") ){
                String caminho = arquivo.getAbsolutePath() + File.pathSeparator + nome + ".db";
                gerenciador.criarBancoDados(caminho);
            }     
        }           
    }//GEN-LAST:event_menuNovoActionPerformed

    private void menuAbrirActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos .db", "db");
        
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.addChoosableFileFilter(filtro);
        
        int resp = chooser.showOpenDialog(this);
        
        if (resp == JFileChooser.APPROVE_OPTION){
            File arquivo = chooser.getSelectedFile();
            
            if ( arquivo.exists() ){
                String caminho = arquivo.getAbsolutePath();
                
                gerenciador.abrirBancoDados(caminho);
            }
        }
    }//GEN-LAST:event_menuAbrirActionPerformed

    private void formWindowClosing(WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if ( gerenciador.getBDAtual().isModificado() ){
            String s = JOptionPane.showInputDialog(this, "Salvar arquivo?", "Quer salvar as alterações?",
                    JOptionPane.INFORMATION_MESSAGE + JOptionPane.OK_CANCEL_OPTION);
            int opcao = Integer.parseInt(s);
            
            if (opcao == JOptionPane.OK_OPTION){
                gerenciador.salvarBancoDados();
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void menuRegistroNovoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuRegistroNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRegistroNovoActionPerformed

    private void menuSalvarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSalvarActionPerformed

    private void menuExcluirActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuExcluirActionPerformed

    private void menuTblNovaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuTblNovaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTblNovaActionPerformed

    private void menuTblAbrirActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuTblAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTblAbrirActionPerformed

    private void menuTblAlterarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuTblAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTblAlterarActionPerformed

    private void menuTblExcluirActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuTblExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTblExcluirActionPerformed

    private void menuCollNovaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuCollNovaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCollNovaActionPerformed

    private void menuColAbrirActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuColAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuColAbrirActionPerformed

    private void menuColAlterarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuColAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuColAlterarActionPerformed

    private void menuColExcluirActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuColExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuColExcluirActionPerformed

    private void menuRegistroSalvarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuRegistroSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRegistroSalvarActionPerformed

    private void menuRegistroExcluirActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuRegistroExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRegistroExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ( "Nimbus".equals( info.getName() ) ) {
                    UIManager.setLookAndFeel( info.getClassName() );
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger( FrameInicial.class.getName() ).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JMenu jMenu1;
    private JScrollPane jScrollPane3;
    private JTable jTable1;
    private JMenuItem menuAbrir;
    private JMenu menuBancoDados;
    private JMenuBar menuBar;
    private JMenuItem menuColAbrir;
    private JMenuItem menuColAlterar;
    private JMenuItem menuColExcluir;
    private JMenuItem menuCollNova;
    private JMenu menuColunas;
    private JMenuItem menuExcluir;
    private JMenuItem menuNovo;
    private JMenuItem menuRegistroExcluir;
    private JMenuItem menuRegistroNovo;
    private JMenuItem menuRegistroSalvar;
    private JMenu menuRegistros;
    private JMenuItem menuSalvar;
    private JMenuItem menuTblAbrir;
    private JMenuItem menuTblAlterar;
    private JMenuItem menuTblExcluir;
    private JMenuItem menuTblNova;
    private JPanel painelTabela;
    // End of variables declaration//GEN-END:variables
    private Gerenciador gerenciador;
    private BancoDados bancoAtual;
}
