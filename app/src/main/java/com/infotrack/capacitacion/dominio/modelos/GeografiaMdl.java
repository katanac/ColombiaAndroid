package com.infotrack.capacitacion.dominio.modelos;

public class GeografiaMdl {

    private  int geografiaId;
    private String nombre;
    private String localizacion;
    private String clima;

    public int getGeografiaId() {
        return geografiaId;
    }

    public void setGeografiaId(int geografiaId) {
        this.geografiaId = geografiaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }
}
