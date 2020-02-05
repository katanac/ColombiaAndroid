package com.infotrack.capacitacion.datos.repositorios.origendatos.ffaa;

import com.infotrack.capacitacion.datos.entidades.FfaaDto;

import java.util.List;

import io.reactivex.Observable;

public class FfaaFirebase implements FfaaOrigenDatos {
    @Override
    public Observable<List<FfaaDto>> consultarListadoFfaa(int idFFaa) {
        return null;
    }
}
