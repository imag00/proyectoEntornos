package com.gf.cotos.dao;

import com.gf.cotos.entities.Coto;
import com.gf.cotos.entities.Usuario;
import com.gf.cotos.resources.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public static Usuario getUsuario(String nif) throws SQLException {
        Usuario usuario = null;

        String query = "select usuario.*, cazador.TIPO_LICENCIA, cazador.LICENCIA_CAZA "
                + "from usuario left outer join cazador on cazador.NIF = usuario.NIF "
                + "where usuario.NIF = ?";
        Connection con = ConexionBD.getConnection();
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, nif);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            String nom = rs.getString(2);
            String ap1 = rs.getString(3);
            String ap2 = rs.getString(4);
            String tlf = rs.getString(5);
            String dir = rs.getString(6);
            String mail = rs.getString(7);
            String tipoLicencia = rs.getString(8);
            String licencia = rs.getString(9);
            ArrayList<Coto> arrenda = CotoDAO.getCotosArrenda(nif);
            usuario = new Usuario(nif, nom, ap1, ap2, tlf, mail, tipoLicencia, licencia, arrenda);
        }

        return usuario;
    }

    public static boolean addUsuario(String nif, String nombre, String apellido1, String apellido2, String telefono, String email, String tipoLicencia, String licencia, List<Coto> arrenda) throws SQLException {
        String insert = "insert into usuario values(?,?,?,?,?,?,?,?,?)";
        Connection con = ConexionBD.getConnection();
        PreparedStatement ps = con.prepareStatement(insert);
        ps.setString(1, nif);
        ps.setString(2, nombre);
        ps.setString(3, apellido1);
        ps.setString(4, apellido2);
        ps.setString(5, telefono);
        ps.setString(6, email);
        ps.setString(7, email);
        ps.setString(8, tipoLicencia);
        ps.setString(9, licencia);

        return ps.executeUpdate() > 0;
    }

}
