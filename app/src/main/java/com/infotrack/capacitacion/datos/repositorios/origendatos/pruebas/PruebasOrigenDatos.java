package com.infotrack.capacitacion.datos.repositorios.origendatos.pruebas;

import com.infotrack.capacitacion.datos.entidades.PruebaDto;

import java.util.List;

import io.reactivex.Observable;

public interface PruebasOrigenDatos {
    Observable persistirPrueba(PruebaDto pruebaDto);

    Observable<List<PruebaDto>> consultarListadoPrueba();

    Observable<PruebaDto> consultarPrueba();

    Observable<List<PruebaDto>> consultarListadoPruebaTiempoReal();

    Observable<PruebaDto> consultarPruebaTiempoReal();

    Observable<List<PruebaDto>> consultarListadoPruebaPorFiltro();
}
