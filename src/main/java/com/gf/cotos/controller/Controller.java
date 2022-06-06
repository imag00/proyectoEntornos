package com.gf.cotos.controller;

import com.gf.cotos.dao.UsuarioDAO;
import com.gf.cotos.entities.Usuario;
import com.gf.cotos.view.ViewWrapper;

import javax.swing.*;
import java.sql.SQLException;

public class Controller {

    public static void start() {
        ViewWrapper.showLoginView();
    }

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

}
