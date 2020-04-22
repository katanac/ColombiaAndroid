package com.infotrack.capacitacion.datos.repositorios.origendatos.Biodiversidad;

import com.infotrack.capacitacion.datos.excepciones.GenerarFabricaNullException;
import com.infotrack.capacitacion.datos.repositorios.fabrica.FabricaAbstracta;
import com.infotrack.capacitacion.transversal.enumeradores.OrigenDatosEnum;

public class BiodiversidadFabrica implements FabricaAbstracta<BiodiversidadOrigenDatos> {

    @Override
    public BiodiversidadOrigenDatos crear(String tipo) {
        switch (OrigenDatosEnum.valueOf(tipo)) {
            case FIREBASE:
                return new BiodiversidadFirebase();
            default:
                throw  new GenerarFabricaNullException();

        }
    }
}
