package com.infotrack.capacitacion.datos.repositorios.origendatos.ffaa;

import com.infotrack.capacitacion.datos.entidades.FfaaDto;
import java.util.List;
import io.reactivex.Observable;


public interface FfaaOrigenDatos {
    Observable<List<FfaaDto>> consultarListadoFfaa(int idFFaa);
}
