package com.gf.cotos.controller;

import com.gf.cotos.entities.Coto;
import com.gf.cotos.entities.Usuario;
import com.gf.cotos.view.ViewWrapper;

import javax.swing.*;

/**
 * Stores the events that happen in the views so that they can be
 * handled in the Controller.
 */
public class Events {

    /**
     * Triggers when the login button from {@code LoginView} has been pressed
     * @param nif The NIF that was stored in the {@code LoginView} as a text field
     * @see com.gf.cotos.view.LoginView
     */
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

    /**
     * Triggers when the "usuario" button has been pressed in {@code MainView}.
     * Shows the user's information panel.
     * @see com.gf.cotos.view.MainView
     */
    public static void pressedUsuarioTab() {
        ViewWrapper.showUsuarioPanel();
    }

    /**
     * Triggers when the "cotos" button has been pressed in {@code MainView}.
     * Shows the cotos panel, with a list of all cotos.
     * @see com.gf.cotos.view.MainView
     */
    public static void pressedCotosTab() {
        Controller.getInstance().setCotos(ControllerDAO.getAllCotos().toArray(new Coto[0]));
        ViewWrapper.showCotosPanel(null);
    }

    /**
     * Triggers when an item from the list of cotos arrendados from {@link com.gf.cotos.view.UsuarioPanel}
     * has been double clicked.
     * This is used to move the view to the cotos panel, selecting the coto which corresponds
     * to the one that was double clicked.
     * @param matricula The ID of the coto that was double clicked on the list
     */
    public static void doubleClickedArrenda (String matricula) {
        Controller.getInstance().setCotos(ControllerDAO.getAllCotos().toArray(new Coto[0]));
        ViewWrapper.showCotosPanel(matricula);
    }
}
