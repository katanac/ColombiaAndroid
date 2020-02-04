package com.infotrack.capacitacion.datos.repositorios.origendatos.ffaa;

import com.infotrack.capacitacion.datos.excepciones.GenerarFabricaNullException;
import com.infotrack.capacitacion.datos.repositorios.fabrica.FabricaAbstracta;
import com.infotrack.capacitacion.transversal.enumeradores.OrigenDatosEnum;

public class FfaaFabrica implements FabricaAbstracta<FfaaOrigenDatos> {

    @Override
    public FfaaOrigenDatos crear(String Tipo) {
            switch (OrigenDatosEnum.valueOf(Tipo)) {
                case FIREBASE:
                    return new FfaaFirebase();
                //case RETROFIT:
                default:
                    throw new GenerarFabricaNullException();
            }
    }
}
