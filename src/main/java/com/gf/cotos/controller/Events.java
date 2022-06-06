package com.gf.cotos.controller;

import com.gf.cotos.entities.Usuario;
import com.gf.cotos.view.ViewWrapper;

import javax.swing.*;

public class Events {

    public static void loginAccepted(String nif) {
        Usuario usuario = Controller.getUsuario(nif);
        System.out.println(usuario);
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "No existe el usuario", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ViewWrapper.disposeLoginView();
        ViewWrapper.showMainView(usuario);
    }
}
