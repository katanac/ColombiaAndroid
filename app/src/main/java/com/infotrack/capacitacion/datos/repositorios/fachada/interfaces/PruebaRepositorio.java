package com.infotrack.capacitacion.datos.repositorios.fachada.interfaces;

import com.infotrack.capacitacion.dominio.modelos.PruebaMdl;

import java.util.List;

import io.reactivex.Observable;

public interface PruebaRepositorio {
    Observable persistirPrueba(PruebaMdl pruebaMdl);

    Observable<List<PruebaMdl>> consultarListadoPrueba();

    Observable<PruebaMdl> consultarPrueba();
}
