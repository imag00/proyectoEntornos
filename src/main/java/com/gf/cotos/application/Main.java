package com.gf.cotos.application;

import com.formdev.flatlaf.FlatLightLaf;
import com.gf.cotos.controller.Controller;
import com.gf.cotos.dao.CotoDAO;
import com.gf.cotos.resources.ConexionBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        try {
            System.out.println(CotoDAO.getCotosArrenda("12345678B"));
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        Controller.start();
    }
}
