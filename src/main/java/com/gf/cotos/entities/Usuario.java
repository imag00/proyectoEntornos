package com.gf.cotos.entities;

import java.util.List;

public class Usuario {
    private final String nif;
    private final String nombre;
    private final String apellido1;
    private final String apellido2;
    private final String telefono;
    private final String email;
    private final String tipoLicencia;
    private final String licencia;
    private final List<Coto> arrenda;

    public Usuario(String nif, String nombre, String apellido1, String apellido2, String telefono, String email, String tipoLicencia, String licencia, List<Coto> arrenda) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.email = email;
        this.tipoLicencia = tipoLicencia;
        this.licencia = licencia;
        this.arrenda = arrenda;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public String getLicencia() {
        return licencia;
    }

    public List<Coto> getArrenda() {
        return arrenda;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", tipoLicencia='" + tipoLicencia + '\'' +
                ", licencia='" + licencia + '\'' +
                ", arrenda=" + arrenda +
                '}';
    }
}
