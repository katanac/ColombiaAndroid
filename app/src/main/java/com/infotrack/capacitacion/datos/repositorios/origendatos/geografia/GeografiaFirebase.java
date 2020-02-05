package com.infotrack.capacitacion.datos.repositorios.origendatos.geografia;

import com.infotrack.capacitacion.datos.entidades.GeografiaDto;

import java.util.List;

import io.reactivex.Observable;

public class GeografiaFirebase implements  GeografiaOrigenDatos {
    @Override
    public Observable<List<GeografiaDto>> ConsultarGeografia(int idGeografia) {
        return null;
    }
}
