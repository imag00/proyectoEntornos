/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.gf.cotos.view;

import com.gf.cotos.controller.Events;
import com.gf.cotos.entities.Coto;
import com.gf.cotos.entities.Usuario;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 *
 * @author ismael
 */
public class UsuarioPanel extends JPanel {

    private final Usuario usuario;

    private final DefaultListModel<Coto> model = new DefaultListModel<>();

    /**
     * Creates new form UsuarioPanel
     */
    public UsuarioPanel(Usuario usuario) {
        initComponents();
        setVisible(true);
        this.usuario = usuario;
        setUsuarioComponents();
        setLabelImg();
        model.addAll(usuario.getArrenda());
        listArrenda.setModel(model);
    }

    private void setLabelImg() {
        URL url = getClass().getResource("/bannerUsuario.png");
        Image img = new ImageIcon(url).getImage()
                .getScaledInstance(600, 103, Image.SCALE_SMOOTH);
        jlImg.setIcon(new ImageIcon(img));
        jlImg.setHorizontalAlignment(JLabel.CENTER);
    }

    private void setUsuarioComponents() {
        jtNIF.setText(usuario.getNif());
        jtNombre.setText(usuario.getNombre());
        jtApe1.setText(usuario.getApellido1());
        jtApe2.setText(usuario.getApellido2());
        jtTlf.setText(usuario.getTelefono());
        jtEmail.setText(usuario.getEmail());
        jtLic.setText(usuario.getLicencia());
        jtTipo.setText(usuario.getTipoLicencia());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtNIF = new JTextField();
        jtNombre = new JTextField();
        jtApe1 = new JTextField();
        jtApe2 = new JTextField();
        jtTlf = new JTextField();
        jtEmail = new JTextField();
        jtLic = new JTextField();
        jtTipo = new JTextField();
        jScrollPane1 = new JScrollPane();
        listArrenda = new JList<>();
        jlNIF = new JLabel();
        jlNombre = new JLabel();
        jlAp1 = new JLabel();
        jlAp2 = new JLabel();
        jlTlf = new JLabel();
        jlEmail = new JLabel();
        jlLicencia = new JLabel();
        jlTipo = new JLabel();
        jlArrenda = new JLabel();
        jpImg = new JPanel();
        jlImg = new JLabel();

        jtNIF.setEditable(false);

        jtNombre.setEditable(false);

        jtApe1.setEditable(false);

        jtApe2.setEditable(false);

        jtTlf.setEditable(false);

        jtEmail.setEditable(false);

        jtLic.setEditable(false);

        jtTipo.setEditable(false);

        listArrenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listArrendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listArrenda);

        jlNIF.setText("NIF");

        jlNombre.setText("Nombre");

        jlAp1.setText("Apellido 1");

        jlAp2.setText("Apellido2");

        jlTlf.setText("Teléfono");

        jlEmail.setText("Email");

        jlLicencia.setText("Licencia");

        jlTipo.setText("Tipo");

        jlArrenda.setText("Arrenda");

        jpImg.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        GroupLayout jpImgLayout = new GroupLayout(jpImg);
        jpImg.setLayout(jpImgLayout);
        jpImgLayout.setHorizontalGroup(
            jpImgLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jpImgLayout.createSequentialGroup()
                .addComponent(jlImg, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpImgLayout.setVerticalGroup(
            jpImgLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jlImg, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jlNombre))
                            .addComponent(jlNIF, GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jtNIF)
                            .addComponent(jtNombre)))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlAp1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtApe1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlAp2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtApe2, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlArrenda)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jlTlf)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtTlf, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jlLicencia)
                            .addComponent(jlTipo)
                            .addComponent(jlEmail))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jtTipo, GroupLayout.Alignment.TRAILING)
                            .addComponent(jtLic)))
                    .addComponent(jtEmail, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpImg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpImg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNIF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTlf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNIF)
                    .addComponent(jlTlf))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombre)
                    .addComponent(jlEmail))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jtApe1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtLic, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAp1)
                    .addComponent(jlLicencia))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jtApe2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAp2)
                    .addComponent(jtTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTipo))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlArrenda)
                        .addGap(38, 38, 38))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listArrendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listArrendaMouseClicked
        if (evt.getClickCount() != 2) return;
        String matricula = model.get(listArrenda.getSelectedIndex()).getMatricula();
        Events.doubleClickedArrenda(matricula);
    }//GEN-LAST:event_listArrendaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JScrollPane jScrollPane1;
    private JLabel jlAp1;
    private JLabel jlAp2;
    private JLabel jlArrenda;
    private JLabel jlEmail;
    private JLabel jlImg;
    private JLabel jlLicencia;
    private JLabel jlNIF;
    private JLabel jlNombre;
    private JLabel jlTipo;
    private JLabel jlTlf;
    private JPanel jpImg;
    private JTextField jtApe1;
    private JTextField jtApe2;
    private JTextField jtEmail;
    private JTextField jtLic;
    private JTextField jtNIF;
    private JTextField jtNombre;
    private JTextField jtTipo;
    private JTextField jtTlf;
    private JList<Coto> listArrenda;
    // End of variables declaration//GEN-END:variables
}
