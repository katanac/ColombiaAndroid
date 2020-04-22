package com.infotrack.capacitacion.datos.repositorios.fachada.interfaces;

import com.infotrack.capacitacion.dominio.modelos.ComidaMdl;

import java.util.List;

import io.reactivex.Observable;

public interface ComidaRepositorio {

    Observable<List<ComidaMdl>> consultarListadoComida();
}
