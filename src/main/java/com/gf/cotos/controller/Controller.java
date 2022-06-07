package com.gf.cotos.controller;

import com.gf.cotos.entities.Coto;
import com.gf.cotos.entities.Usuario;
import com.gf.cotos.view.ViewWrapper;

public class Controller {

    private Usuario usuario;
    private Coto[] cotos;

    public void start() {
        ViewWrapper.showLoginView();
    }

    private static Controller controller;

    private Controller() { }

    public static Controller getInstance() {
        if (controller == null)
            controller = new Controller();

        return controller;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Coto[] getCotos() {
        return cotos;
    }

    public void setCotos(Coto[] cotos) {
        this.cotos = cotos;
    }
}
