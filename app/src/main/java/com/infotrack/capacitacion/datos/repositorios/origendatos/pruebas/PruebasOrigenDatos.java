package com.infotrack.capacitacion.datos.repositorios.origendatos.pruebas;

import com.infotrack.capacitacion.datos.entidades.ComidaDto;

import java.util.List;

import io.reactivex.Observable;

public interface PruebasOrigenDatos {
    Observable persistirPrueba(ComidaDto comidaDto);

    Observable<List<ComidaDto>> consultarListadoPrueba();

    Observable<ComidaDto> consultarPrueba();

    Observable<List<ComidaDto>> consultarListadoPruebaTiempoReal();

    Observable<ComidaDto> consultarPruebaTiempoReal();

    Observable<List<ComidaDto>> consultarListadoPruebaPorFiltro();
}
