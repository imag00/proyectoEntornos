package com.gf.cotos.application;

import com.formdev.flatlaf.FlatLightLaf;
import com.gf.cotos.controller.Controller;
import com.gf.cotos.resources.ConexionBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/cacocyl";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    /**
     * Main method for the application.
     * Sets the look and feel, creates the connection singleton and starts the controller.
     * @param args Arguments
     */
    public static void main(String[] args) {
        //
        try {
            FlatLightLaf.setup();
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        try {
            ConexionBD.createConnection(URL, USER, PASSWORD);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un error de conexión",
                    "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

        Controller.getInstance().start();
    }
}
