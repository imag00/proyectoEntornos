package com.gf.cotos.controller;

import com.gf.cotos.entities.Coto;
import com.gf.cotos.entities.Usuario;
import com.gf.cotos.view.ViewWrapper;

import javax.swing.*;

public class Events {

    public static void loginAccepted(String nif) {
        Usuario usuario = ControllerDAO.getUsuario(nif);
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "No existe el usuario", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Controller.getInstance().setUsuario(usuario);

        ViewWrapper.disposeLoginView();
        ViewWrapper.showMainView();
    }

    public static void pressedUsuarioTab() {
        ViewWrapper.showUsuarioPanel();
    }

    public static void pressedCotosTab() {
        Controller.getInstance().setCotos(ControllerDAO.getAllCotos().toArray(new Coto[0]));
        ViewWrapper.showCotosPanel(null);
    }

    public static void doubleClickedArrenda (String matricula) {
        Controller.getInstance().setCotos(ControllerDAO.getAllCotos().toArray(new Coto[0]));
        ViewWrapper.showCotosPanel(matricula);
    }
}
