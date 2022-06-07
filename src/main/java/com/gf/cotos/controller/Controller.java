package com.gf.cotos.controller;

import com.gf.cotos.entities.Coto;
import com.gf.cotos.entities.Usuario;
import com.gf.cotos.view.ViewWrapper;

/**
 * Main controller for the application.
 */
public class Controller {

    private Usuario usuario;
    private Coto[] cotos;


    /**
     * Kickstarts the ViewWrapper, which provides an interface between the Controller and View.
     * Also creates the login window
     */
    public void start() {
        ViewWrapper.showLoginView();
    }

    private static Controller controller;

    private Controller() { }


    /**
     * Returns the global instance of the controller, and creates it if it doesn't exist.
     * @return Instance of the controller
     */
    public static Controller getInstance() {
        if (controller == null)
            controller = new Controller();

        return controller;
    }

    /**
     * Returns the user logged into the application. This corresponds to the user that has logged into
     * the app via the login view.
     * @return The logged user
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Changes the user that is logged into te appplication.
     * @param usuario The user whose info will be displayed in the application
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Returns the array of cotos that is currently stored by the application.
     * This array is used in the view to create the JList that will contain all of the cotos.
     * @return The array of cotos stored
     */
    public Coto[] getCotos() {
        return cotos;
    }

    /**
     * Changes the array of cotos that is being stored by the application.
     * * This array is used in the view to create the JList that will contain all of the cotos.
     * @param cotos The array of cotos
     */
    public void setCotos(Coto[] cotos) {
        this.cotos = cotos;
    }
}
