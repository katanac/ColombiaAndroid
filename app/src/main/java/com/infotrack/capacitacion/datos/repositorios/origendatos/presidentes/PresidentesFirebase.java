package com.infotrack.capacitacion.datos.repositorios.origendatos.presidentes;

import android.database.Observable;

import com.infotrack.capacitacion.datos.entidades.PresidentesDto;

import java.util.List;

public class PresidentesFirebase implements PresidentesOrigenDatos {

    @Override
    public Observable<List<PresidentesDto>> consultarPresidentes() {
        return null;
    }
}
