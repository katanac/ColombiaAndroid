package com.infotrack.capacitacion.presentacion.vistamodelos;

import com.google.firebase.database.PropertyName;

public class BiodiversidadVM {

    private int idFlora;
    private String nombreFlora;
    private int idFauna;
    private String nombreFauna;

    @PropertyName("IdFlora")
    public int getIdFlora() {
        return idFlora;
    }

    @PropertyName("IdFlora")
    public void setIdFlora(int idFlora) {
        this.idFlora = idFlora;
    }

    @PropertyName("NombreFlora")
    public String getNombreFlora() {
        return nombreFlora;
    }

    @PropertyName("NombreFlora")
    public void setNombreFlora(String nombreFlora) {
        this.nombreFlora = nombreFlora;
    }

    @PropertyName("IdFauna")
    public int getIdFauna() {
        return idFauna;
    }

    @PropertyName("IdFauna")
    public void setIdFauna(int idFauna) {
        this.idFauna = idFauna;
    }

    @PropertyName("NombreFauna")
    public String getNombreFauna() {
        return nombreFauna;
    }

    @PropertyName("NombreFauna")
    public void setNombreFauna(String nombreFauna) {
        this.nombreFauna = nombreFauna;
    }
}
