package com.infotrack.capacitacion.datos.repositorios.origendatos.comida;

import com.infotrack.capacitacion.datos.entidades.ComidaDto;

import java.util.List;

import io.reactivex.Observable;

public interface ComidaOrigenDatos {

    Observable<List<ComidaDto>> consultarListadoComida(int idComida);
}
