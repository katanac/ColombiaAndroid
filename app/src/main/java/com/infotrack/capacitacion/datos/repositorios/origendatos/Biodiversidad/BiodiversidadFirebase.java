package com.infotrack.capacitacion.datos.repositorios.origendatos.Biodiversidad;

import com.infotrack.capacitacion.datos.entidades.BiodiversidadDto;
import java.util.List;
import io.reactivex.Observable;

public class BiodiversidadFirebase implements BiodiversidadOrigenDatos {
    @Override
    public Observable<List<BiodiversidadDto>> consultarListaBiodiversidad(int idFlora) {
        return null;
    }
}
