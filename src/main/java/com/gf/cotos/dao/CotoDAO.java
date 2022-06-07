package com.gf.cotos.dao;

import com.gf.cotos.entities.Coto;
import com.gf.cotos.resources.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Handles the queries to the database from the application.
 */
public class CotoDAO {

    /**
     * Returns a list of all the cotos that are stored in the database.
     * @return A list of all the cotos
     * @throws SQLException Thrown when an error has ocurred with the database
     */
    public static ArrayList<Coto> getAllCotos() throws SQLException {
        ArrayList<Coto> cotos = new ArrayList<>();

        String query = "SELECT * FROM COTO";
        Connection con = ConexionBD.getConnection();
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String matricula = rs.getString(1);
            String nif = rs.getString(2);
            String provincia = rs.getString(3);
            boolean privado = rs.getBoolean(4);
            String munic = rs.getString(5);
            Date constitucion = rs.getDate(6);
            boolean anulado = rs.getBoolean(7);
            Date anulacion = rs.getDate(8);
            Date cambioTitular = rs.getDate(9);
            cotos.add(new Coto(matricula, nif, provincia, privado, munic, constitucion, anulado, anulacion, cambioTitular));
        }
        return cotos;
    }

    /**
     * Gets a particular coto from the specified ID.
     * @param matricula The ID of the coto to look for
     * @return The coto that has been recovered from the database. Will return {@code null}
     *         if no coto has been found
     * @throws SQLException Thrown when an error has ocurred with the database
     */
    public static Coto getCoto(String matricula) throws SQLException {
        Coto coto = null;
        
        String query = "SELECT * FROM COTO WHERE MATRICULA_COTO = ?";
        Connection con = ConexionBD.getConnection();
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, matricula);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            String nif = rs.getString(2);
            String provincia = rs.getString(3);
            boolean privado = rs.getBoolean(4);
            String munic = rs.getString(5);
            Date constitucion = rs.getDate(6);
            boolean anulado = rs.getBoolean(7);
            Date anulacion = rs.getDate(8);
            Date cambioTitular = rs.getDate(9);
            coto = new Coto(matricula, nif, provincia, privado, munic, constitucion, anulado, anulacion, cambioTitular);
        }
        return coto;
    }

    /**
     * Gets all the cotos that are arrendados by a user. This is done by searching for the NIF
     * in ARRENDA.
     * @param nif The NIF of the user
     * @return A list of all the cotos that the user arrenda
     * @throws SQLException Thrown when an error has ocurred with the database
     */
    public static ArrayList<Coto> getCotosArrenda(String nif) throws SQLException {
        ArrayList<Coto> cotos = new ArrayList<>();
        
        String query = "SELECT * FROM ARRENDA "
                + "WHERE NIF = ?";
        Connection con = ConexionBD.getConnection();
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, nif);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String matricula = rs.getString(2);
            cotos.add(getCoto(matricula));
        }
        
        return cotos;
    }

}
