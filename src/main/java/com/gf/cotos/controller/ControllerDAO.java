package com.gf.cotos.controller;

import com.gf.cotos.dao.CotoDAO;
import com.gf.cotos.dao.UsuarioDAO;
import com.gf.cotos.entities.Coto;
import com.gf.cotos.entities.Usuario;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Interface between the DAO and the controller. This class is used to
 * handle the exceptions created by the DAO and display its error messages.
 */
public class ControllerDAO {

    /**
     * Retrieves any user by NIF from the database.
     * @param nif The NIF of the user that is wanted
     * @return The user that has been retrieved from the database, or <code>null</code> if none is found
     */
    public static Usuario getUsuario(String nif) {
        Usuario usuario = null;
        try {
            usuario = UsuarioDAO.getUsuario(nif);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ha sucedido un error", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return usuario;
    }

    /**
     * Retrieves all cotos from the database.
     * @return The list of all cotos stored in the database. Will be empty if nothing is found
     */
    public static ArrayList<Coto> getAllCotos() {
        ArrayList<Coto> cotos = new ArrayList<>();
        try {
            cotos = CotoDAO.getAllCotos();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ha sucedido un error", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return cotos;
    }
}
