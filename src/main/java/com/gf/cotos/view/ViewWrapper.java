package com.gf.cotos.view;

import com.gf.cotos.entities.Usuario;

public class ViewWrapper {

    private static final LoginView loginView = new LoginView();
    private static final MainView mainView = new MainView();

    public static void showLoginView() {
        loginView.setVisible(true);
    }
    public static void disposeLoginView() {
        loginView.dispose();
    }
    public static void showMainView(Usuario usuario) {
        mainView.setUsuario(usuario);
        mainView.setVisible(true);
    }

}
