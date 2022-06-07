package com.gf.cotos.dao;

import com.gf.cotos.entities.Coto;
import com.gf.cotos.entities.Usuario;
import com.gf.cotos.resources.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO {

    /**
     * Returns a particular user from the database by NIF.
     * @param nif The NIF of the user to find
     * @return The user corresponding to that NIF. Will return {@code null}
     *         if no coto has been found
     * @throws SQLException Thrown when an error has ocurred with the database
     */
    public static Usuario getUsuario(String nif) throws SQLException {
        Usuario usuario = null;

        String query = "SELECT USUARIO.*, CAZADOR.TIPO_LICENCIA, CAZADOR.LICENCIA_CAZA "
                + "FROM USUARIO LEFT OUTER JOIN CAZADOR ON CAZADOR.NIF = USUARIO.NIF "
                + "WHERE USUARIO.NIF = ?";
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
}
