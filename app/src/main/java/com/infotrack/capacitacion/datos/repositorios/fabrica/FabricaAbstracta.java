package com.infotrack.capacitacion.datos.repositorios.fabrica;


public interface FabricaAbstracta<T> {
    T crear(String Tipo);
}
