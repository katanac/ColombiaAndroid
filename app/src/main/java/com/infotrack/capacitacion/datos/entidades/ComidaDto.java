package com.infotrack.capacitacion.datos.entidades;

import com.google.firebase.database.PropertyName;

public class ComidaDto {

    private int idComida;
    private String nombreComida;
    private String region;
    private String ingredientes;

    @PropertyName("IdComida")
    public int getIdComida() {
        return idComida;
    }

    @PropertyName("IdComida")
    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    @PropertyName("NombreComida")
    public String getNombreComida() {
        return nombreComida;
    }

    @PropertyName("NombreComida")
    public void setNombreComida(String nombreComida) {
        this.nombreComida = nombreComida;
    }

    @PropertyName("Region")
    public String getRegion() {
        return region;
    }

    @PropertyName("Region")
    public void setRegion(String region) {
        this.region = region;
    }

    @PropertyName("Ingredientes")
    public String getIngredientes() {
        return ingredientes;
    }

    @PropertyName("Ingredientes")
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
