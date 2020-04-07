package com.infotrack.capacitacion.datos.entidades;

import com.google.firebase.database.PropertyName;

public class FutbolistaDto {

    private int idFutbolista;
    private String equipoProfesional;
    private String apodo;
    private String nombre;

    @PropertyName("IdFutbolista")
    public int getIdFutbolista() {return idFutbolista;}

    @PropertyName("IdFutbolista")
    public void setIdFutbolista(int idFutbolista) {this.idFutbolista = idFutbolista;}

    @PropertyName("EquipoProfesional")
    public String getEquipoProfesional() {return equipoProfesional;}

    @PropertyName("EquipoProfesional")
    public void setEquipoProfesional(String equipoProfesional) {this.equipoProfesional = equipoProfesional;}

    @PropertyName("Apodo")
    public String getApodo() {return apodo;}

    @PropertyName("Apodo")
    public void setApodo(String apodo) {this.apodo = apodo;}

    @PropertyName("Nombre")
    public String getNombre() { return nombre;}

    @PropertyName("Nombre")
    public void setNombre(String nombre) {this.nombre = nombre;}

}
