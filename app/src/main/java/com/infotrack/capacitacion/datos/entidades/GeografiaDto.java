package com.infotrack.capacitacion.datos.entidades;

import com.google.firebase.database.PropertyName;

public class GeografiaDto {

    private  int geografiaId;
    private String nombre;
    private String localizacion;
    private String clima;

    @PropertyName("Geografia")
    public int getGeografiaId() {
        return geografiaId;
    }
    @PropertyName("Geografia")
    public void setGeografiaId(int geografiaId) {
        this.geografiaId = geografiaId;
    }

    @PropertyName("Nombre")
    public String getNombre() {
        return nombre;
    }

    @PropertyName("Nombre")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @PropertyName("Localizacion")
    public String getLocalizacion() {
        return localizacion;
    }

    @PropertyName("Localizacion")
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    @PropertyName("Clima")
    public String getClima() {
        return clima;
    }
    @PropertyName("Clima")
    public void setClima(String clima) {
        this.clima = clima;
    }
}
