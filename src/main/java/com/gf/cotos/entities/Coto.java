package com.gf.cotos.entities;

import java.util.Date;

/**
 * Entity coto.
 */
public class Coto {
    private final String matricula;
    private final String nif;
    private final String codigoProvincia;
    private final boolean privado;
    private final String municipio;
    private final Date constitucion;
    private final boolean anulado;
    private final Date anulacion;
    private final Date cambioTitular;

    public Coto(String matricula, String nif, String codigoProvincia, boolean privado, String municipio, Date constitucion, boolean anulado, Date anulacion, Date cambioTitular) {
        this.matricula = matricula;
        this.nif = nif;
        this.codigoProvincia = codigoProvincia;
        this.privado = privado;
        this.municipio = municipio;
        this.constitucion = constitucion;
        this.anulado = anulado;
        this.anulacion = anulacion;
        this.cambioTitular = cambioTitular;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNif() {
        return nif;
    }

    public String getCodigoProvincia() {
        return codigoProvincia;
    }

    public boolean isPrivado() {
        return privado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public Date getConstitucion() {
        return constitucion;
    }

    public boolean isAnulado() {
        return anulado;
    }

    public Date getAnulacion() {
        return anulacion;
    }

    public Date getCambioTitular() {
        return cambioTitular;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", provincia: " + codigoProvincia;
    }
    
    
    
    
}
