package com.gf.cotos.dao;

import com.gf.cotos.entities.Coto;
import com.gf.cotos.resources.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class CotoDAO {
    
    public static Coto getCoto(String matricula) throws SQLException {
        Coto coto = null;
        
        String query = "select * from coto where matricula_coto = ?";
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
    
    public static ArrayList<Coto> getCotosArrenda(String nif) throws SQLException {
        ArrayList<Coto> cotos = new ArrayList<>();
        
        String query = "select * from arrenda "
                + "where NIF = ?";
        Connection con = ConexionBD.getConnection();
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, nif);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String matricula = rs.getString(2);
            System.out.println(matricula);
            cotos.add(getCoto(matricula));
        }
        
        return cotos;
    }
}
