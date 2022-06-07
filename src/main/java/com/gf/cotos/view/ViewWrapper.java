package com.gf.cotos.view;

/**
 * Acts as an interface between the view and the controller. This class is used
 * to dispose of and show different windows without having to access the individual views from the controller.
 */
public class ViewWrapper {

    private static final LoginView loginView = new LoginView();
    private static final MainView mainView = new MainView();

    /**
     * Shows the loging window.
     */
    public static void showLoginView() {
        loginView.setVisible(true);
    }

    /**
     * Disposes of the login window.
     */
    public static void disposeLoginView() {
        loginView.dispose();
    }

    /**
     * Shows the main window, whose panel is defaulted to the users panel.
     */
    public static void showMainView() {
        showUsuarioPanel();
        mainView.setVisible(true);
    }

    /**
     * Changes the main window's panel to the user panel.
     */
    public static void showUsuarioPanel() {
        mainView.showUsuarioPanel();
    }

    /**
     * Changes the main window's panel to the user panel. A coto ID might also be specified
     * to instantly place the selection at the table's position where that coto is found.
     * @param matricula  The ID of the coto that should be selected by default. Can be {@code null} in case
     *                   no specific coto should be selected by default
     */
    public static void showCotosPanel(String matricula) {
        mainView.setCotosBttSelected();
        mainView.showCotosPanel(matricula);
    }
}
