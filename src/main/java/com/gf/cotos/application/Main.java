package com.gf.cotos.application;

import com.formdev.flatlaf.FlatLightLaf;
import com.gf.cotos.controller.Controller;
import com.gf.cotos.resources.ConexionBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    public static void main(String[] args) {        
        try {
            FlatLightLaf.setup();
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        
        
        try {
            ConexionBD.createConnection("jdbc:mysql://localhost:3306/prueba_bases", "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un error de conexión",
                    "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

        Controller.getInstance().start();
    }
}
