package com.gf.cotos.view;

import com.gf.cotos.entities.Coto;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.net.URL;

/**
 * Panel for showing the information of all the {@link Coto} as a table.
 */
public class CotosPanel extends JPanel {

    /**
     * An array of all the column names for the {@code DefaultTableModel}.
     */
    private final String[] cols = new String [] {
            "Matricula", "Propietario", "Provincia", "Privado", "Municipio",
            "Constitución", "Anulado", "Anulación", "Cambio de titular"
    };
    private final Coto[] cotos;

    /**
     * The default table model used to add cotos to the table. Overrides the {@code isCellEditable}
     * method to make all cells uneditable and {@code getColumnClass} to assign custom classes to every
     * column
     */
    DefaultTableModel model = new DefaultTableModel(null, cols) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }

        // These are the object classes that the model will use for the columns
        Class[] types = new Class [] {
                String.class, String.class, String.class, Boolean.class, String.class, Object.class, Boolean.class, Object.class, Object.class
        };

        @Override
        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }
    };

    /**
     * Creates a panel that displays all the information from the list of all the cotos.
     * @param cotos The list of all the cotos
     * @param matricula The ID of the coto that should be selected by default. Can be {@code null} in case
     *                  no specific coto should be selected by default
     */
    protected CotosPanel(Coto[] cotos, String matricula) {
        initComponents();
        this.cotos = cotos;
        setVisible(true);
        setLabelImg();
        setupTable();

        if (matricula == null) return;
        goToMatricula(matricula);
    }

    /**
     * Selects a specific row in which the coto that corresponds the parameter is.
     * @param matricula The ID of the coto to select
     */
    private void goToMatricula(String matricula) {
        for (int i = 0; i < model.getRowCount(); i++) {
            String matriculaCol = model.getValueAt(i, 0).toString();
            if (matricula.equals(matriculaCol)) {
                jTable1.setRowSelectionInterval(i, i);
                // This line moves the scroll to the correct position in case the selected
                // coto is outside of the current viewing range.
                jTable1.scrollRectToVisible(
                        new Rectangle(jTable1.getCellRect(i, 0, true)));
                break;
            }
        }
    }

    /**
     * Adds all the cotos to the table.
     */
    private void setupTable() {
        for (Coto coto : cotos) {
            Object[] data = new Object[] {
                coto.getMatricula(),
                coto.getNif(),
                coto.getCodigoProvincia(),
                coto.isPrivado(),
                coto.getMunicipio(),
                coto.getConstitucion(),
                coto.isAnulado(),
                coto.getAnulacion(),
                coto.getCambioTitular()
            };
            model.addRow(data);
        }
        jTable1.setModel(model);
    }

    /**
     * Sets the header image for the panel.
     */
    private void setLabelImg() {
        URL url = getClass().getResource("/bannerCoto.png");
        Image img = new ImageIcon(url).getImage()
                .getScaledInstance(600, 103, Image.SCALE_SMOOTH);
        jlImg.setIcon(new ImageIcon(img));
        jlImg.setHorizontalAlignment(JLabel.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpImg = new JPanel();
        jlImg = new JLabel();
        jScrollPane2 = new JScrollPane();
        jTable1 = new JTable();

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

        jTable1.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Propietario", "Provincia", "Privado", "Municipio", "Constitución", "Anulado", "Anulación", "Cambio de titular"
            }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, String.class, Boolean.class, String.class, Object.class, Boolean.class, Object.class, Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpImg, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpImg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JScrollPane jScrollPane2;
    private JTable jTable1;
    private JLabel jlImg;
    private JPanel jpImg;
    // End of variables declaration//GEN-END:variables
}
