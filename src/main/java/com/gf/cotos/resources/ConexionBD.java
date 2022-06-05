package com.gf.cotos.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static Connection con;

    public static void createConnection(String url, String usr, String password) throws SQLException {
        if (con != null)
            return;

        con = DriverManager.getConnection(url, usr, password);
    }

    public static Connection getConnection() {
        return con;
    }

}
