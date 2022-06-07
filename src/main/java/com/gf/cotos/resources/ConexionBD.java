package com.gf.cotos.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Handles the connection between the driver manager and the MySQL database. This class can only be instanced
 * once, as only one connection is possible during the runtime of the application.
 */
public class ConexionBD {
    private static Connection con;

    /**
     * Attempts to create a connection to the database with the specified parameters.
     * @param url The URL of the databse
     * @param usr The database user
     * @param password The user's password
     * @throws SQLException If a database access error occurs or the url is null
     */
    public static void createConnection(String url, String usr, String password) throws SQLException {
        if (con != null)
            return;

        con = DriverManager.getConnection(url, usr, password);
    }

    /**
     * Returns the instance of the {@link Connection} object that connects to the database.
     * @return The connection to the database
     */
    public static Connection getConnection() {
        return con;
    }

}
