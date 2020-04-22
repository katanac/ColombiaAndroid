package com.infotrack.capacitacion.datos.repositorios.origendatos.presidentes;

import android.database.Observable;

import com.infotrack.capacitacion.datos.entidades.PresidentesDto;

import java.util.List;

public interface PresidentesOrigenDatos {

    Observable<List<PresidentesDto>> consultarPresidentes();
}


