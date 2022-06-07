package com.gf.cotos.view;

public class ViewWrapper {

    private static final LoginView loginView = new LoginView();
    private static final MainView mainView = new MainView();

    public static void showLoginView() {
        loginView.setVisible(true);
    }
    public static void disposeLoginView() {
        loginView.dispose();
    }
    public static void showMainView() {
        showUsuarioPanel();
        mainView.setVisible(true);
    }
    public static void showUsuarioPanel() {
        mainView.showUsuarioPanel();
    }

    public static void showCotosPanel(String matricula) {
        mainView.setCotosBttSelected();
        mainView.showCotosPanel(matricula);
    }
}
