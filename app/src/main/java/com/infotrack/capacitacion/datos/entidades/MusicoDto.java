package com.infotrack.capacitacion.datos.entidades;

import com.google.firebase.database.PropertyName;

public class MusicoDto {

    private int idMusico;
    private String NombreMusico;
    private String EdadMusico;
    private String GeneroMusico;

    @PropertyName("IdMusico")
    public int getIdMusico() {
        return idMusico;
    }

    @PropertyName("IdMusico")
    public void setIdMusico(int idMusico) {
        this.idMusico = idMusico;
    }

    @PropertyName("NombreMusico")
    public String getNombreMusico() {
        return NombreMusico;
    }

    @PropertyName("NombreMusico")
    public void setNombreMusico(String nombreMusico) {
        NombreMusico = nombreMusico;
    }

    @PropertyName("EdadMusico")
    public String getEdadMusico() {
        return EdadMusico;
    }

    @PropertyName("EdadMusico")
    public void setEdadMusico(String edadMusico) {
        EdadMusico = edadMusico;
    }

    @PropertyName("GeneroMusico")
    public String getGeneroMusico() {
        return GeneroMusico;
    }

    @PropertyName("GeneroMusico")
    public void setGeneroMusico(String generoMusico) {
        GeneroMusico = generoMusico;
    }



}
