package com.gf.cotos.controller;

import com.gf.cotos.dao.CotoDAO;
import com.gf.cotos.dao.UsuarioDAO;
import com.gf.cotos.entities.Coto;
import com.gf.cotos.entities.Usuario;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControllerDAO {

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
