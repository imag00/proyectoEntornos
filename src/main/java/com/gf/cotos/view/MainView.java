/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gf.cotos.view;

import com.gf.cotos.entities.Usuario;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 *
 * @author ismael
 */
public class MainView extends JFrame {

    private Usuario usuario;

    /**
     * Creates new form Main
     */
    public MainView() {
        initComponents();
        setWindowIcon();
        setName("CaCoCyL");
        setLocationRelativeTo(null);
        setBttUsuarioImg();
        setBttCotosImg();
    }

    private void setWindowIcon() {
        URL url = getClass().getResource("/logo.png");
        Image img = new ImageIcon(url).getImage();
        setIconImage(img);
    }

    private void setBttUsuarioImg() {
        URL url = getClass().getResource("/usuarioIcon.png");
        Image img = new ImageIcon(url).getImage()
                .getScaledInstance(64, 64, Image.SCALE_SMOOTH);
        bttUsuario.setIcon(new ImageIcon(img));
        bttUsuario.setHorizontalAlignment(JButton.CENTER);
    }

    private void setBttCotosImg() {
        URL url = getClass().getResource("/cotoIcon.png");
        Image img = new ImageIcon(url).getImage()
                .getScaledInstance(64, 64, Image.SCALE_SMOOTH);
        bttCotos.setIcon(new ImageIcon(img));
        bttCotos.setHorizontalAlignment(JButton.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttGroup = new ButtonGroup();
        jCheckBox1 = new JCheckBox();
        jpBtts = new JPanel();
        bttCotos = new JToggleButton();
        bttUsuario = new JToggleButton();
        jpMain = new JPanel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 600));
        setResizable(false);

        jpBtts.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        bttGroup.add(bttCotos);

        bttGroup.add(bttUsuario);
        bttUsuario.setSelected(true);

        GroupLayout jpBttsLayout = new GroupLayout(jpBtts);
        jpBtts.setLayout(jpBttsLayout);
        jpBttsLayout.setHorizontalGroup(
            jpBttsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jpBttsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bttUsuario, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bttCotos, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
        );
        jpBttsLayout.setVerticalGroup(
            jpBttsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(bttCotos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bttUsuario, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );

        GroupLayout jpMainLayout = new GroupLayout(jpMain);
        jpMain.setLayout(jpMainLayout);
        jpMainLayout.setHorizontalGroup(
            jpMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpMainLayout.setVerticalGroup(
            jpMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jpBtts, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpMain, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpMain, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpBtts, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JToggleButton bttCotos;
    private ButtonGroup bttGroup;
    private JToggleButton bttUsuario;
    private JCheckBox jCheckBox1;
    private JPanel jpBtts;
    private JPanel jpMain;
    // End of variables declaration//GEN-END:variables


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        UsuarioPanel usuarioPanel = new UsuarioPanel(usuario);
        usuarioPanel.setSize(jpMain.getSize());
        jpMain.add(usuarioPanel);
    }
}
