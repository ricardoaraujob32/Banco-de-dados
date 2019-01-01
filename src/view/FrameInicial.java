/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

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
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import controller.Gerenciador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author ricardobalduino
 */
public class FrameInicial extends JFrame {

    /**
     * Creates new form FrameInicial
     */
    public FrameInicial() {
        initComponents();
        gerenciador = new Gerenciador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollMensagem = new JScrollPane();
        txtAreaMensagem = new JTextArea();
        scrollCmd = new JScrollPane();
        txtAreaCmd = new JTextArea();
        jScrollPane3 = new JScrollPane();
        jTable1 = new JTable();
        menuBar = new JMenuBar();
        menuBancoDados = new JMenu();
        menuNovo = new JMenuItem();
        menuAbrir = new JMenuItem();
        jMenu2 = new JMenu();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Gerenciador de Banco de Dados");
        setName("frameInicial"); // NOI18N
        setPreferredSize(new Dimension(700, 500));
        addWindowListener(new WindowAdapter() {
            public void windowDeiconified(WindowEvent evt) {
                formWindowDeiconified(evt);
            }
        });

        txtAreaMensagem.setEditable(false);
        txtAreaMensagem.setColumns(20);
        txtAreaMensagem.setRows(5);
        txtAreaMensagem.setToolTipText("Área para exibir mensagens");
        txtAreaMensagem.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), "Mensagens", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
        txtAreaMensagem.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        scrollMensagem.setViewportView(txtAreaMensagem);

        getContentPane().add(scrollMensagem, BorderLayout.PAGE_END);

        scrollCmd.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtAreaCmd.setColumns(20);
        txtAreaCmd.setRows(5);
        scrollCmd.setViewportView(txtAreaCmd);

        getContentPane().add(scrollCmd, BorderLayout.NORTH);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(gerenciador);
        jTable1.setToolTipText("");
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jTable1);

        getContentPane().add(jScrollPane3, BorderLayout.CENTER);

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
        menuBancoDados.add(menuAbrir);

        menuBar.add(menuBancoDados);

        jMenu2.setText("Edit");
        menuBar.add(jMenu2);

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
        chooser.showOpenDialog(this);
        File arquivo = chooser.getSelectedFile();
        
        gerenciador.criarBancoDados( arquivo.getAbsolutePath() );
    }//GEN-LAST:event_menuNovoActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FrameInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JMenu jMenu2;
    private JScrollPane jScrollPane3;
    private JTable jTable1;
    private JMenuItem menuAbrir;
    private JMenu menuBancoDados;
    private JMenuBar menuBar;
    private JMenuItem menuNovo;
    private JScrollPane scrollCmd;
    private JScrollPane scrollMensagem;
    private JTextArea txtAreaCmd;
    private JTextArea txtAreaMensagem;
    // End of variables declaration//GEN-END:variables
    private Gerenciador gerenciador;
}