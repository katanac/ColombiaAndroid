package com.infotrack.capacitacion.datos.entidades;

import com.google.firebase.database.PropertyName;

public class PresidentesDto {
    private int idPresidente;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String descripcion;

    @PropertyName("IdPresidente")
    public int getIdPresidente() {
        return idPresidente;
    }

    @PropertyName("IdPresidente")
    public void setIdPresidente(int idPresidente) {
        this.idPresidente = idPresidente;
    }

    @PropertyName("PrimerNombre")
    public String getPrimerNombre() {
        return primerNombre;
    }

    @PropertyName("PrimerNombre")
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    @PropertyName("SegundoNombre")
    public String getSegundoNombre() {
        return segundoNombre;
    }

    @PropertyName("SegundoNombre")
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    @PropertyName("PrimerApellido")
    public String getPrimerApellido() {
        return primerApellido;
    }

    @PropertyName("PrimerApellido")
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @PropertyName("SegundoApellido")
    public String getSegundoApellido() {
        return segundoApellido;
    }

    @PropertyName("SegundoApellido")
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @PropertyName("Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    @PropertyName("Descripcion")
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
