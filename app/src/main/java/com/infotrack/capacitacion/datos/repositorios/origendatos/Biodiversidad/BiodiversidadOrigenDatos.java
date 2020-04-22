package com.infotrack.capacitacion.datos.repositorios.origendatos.Biodiversidad;
import com.infotrack.capacitacion.datos.entidades.BiodiversidadDto;
import java.util.List;
import io.reactivex.Observable;

public interface BiodiversidadOrigenDatos {

    Observable<List<BiodiversidadDto>> consultarListaBiodiversidad(int idFlora);

}
