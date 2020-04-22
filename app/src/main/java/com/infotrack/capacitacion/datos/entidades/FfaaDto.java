package com.infotrack.capacitacion.datos.entidades;

import com.google.firebase.database.PropertyName;

public class FfaaDto {

    private int idFfaa;
    private String nombreFfaa;
    private String nombreDirector;
    private int numeroIntegrantes;


    @PropertyName("IdFfaa")
    public int getIdFfaa() {
        return idFfaa;
    }

    @PropertyName("IdFfaa")
    public void setIdFfaa(int idFfaa) {
        this.idFfaa = idFfaa;
    }

    @PropertyName("NombreFfaa")
    public String getNombreFfaa() {
        return nombreFfaa;
    }

    @PropertyName("NombreFfaa")
    public void setNombreFfaa(String nombreFfaa) {
        this.nombreFfaa = nombreFfaa;
    }

    @PropertyName("NombreDirector")
    public String getNombreDirector() {
        return nombreDirector;
    }

    @PropertyName("NombreDirector")
    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    @PropertyName("NumeroIntegrantes")
    public int getNumeroIntegrantes() {
        return numeroIntegrantes;
    }

    @PropertyName("NumeroIntegrantes")
    public void setNumeroIntegrantes(int numeroIntegrantes) {
        this.numeroIntegrantes = numeroIntegrantes;
    }



}
