package com.infotrack.capacitacion.datos.entidades;

public class ComidaDto {

    private String idComida;
    private String nombreComida;
    private String region;
    private String ingredientes;

    public String getIdComida() {
        return idComida;
    }

    public void setIdComida(String idComida) {
        this.idComida = idComida;
    }

    public String getNombreComida() {
        return nombreComida;
    }

    public void setNombreComida(String nombreComida) {
        this.nombreComida = nombreComida;
    }


    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
