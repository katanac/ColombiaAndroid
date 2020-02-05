package com.infotrack.capacitacion.datos.repositorios.origendatos.presidentes;

import com.infotrack.capacitacion.datos.excepciones.GenerarFabricaNullException;
import com.infotrack.capacitacion.datos.repositorios.fabrica.FabricaAbstracta;
import com.infotrack.capacitacion.transversal.enumeradores.OrigenDatosEnum;

public class PresidentesFabrica implements FabricaAbstracta<PresidentesOrigenDatos> {
    @Override
    public PresidentesOrigenDatos crear(String Tipo) {
        switch (OrigenDatosEnum.valueOf(Tipo)) {
            case FIREBASE:
                return new PresidentesFirebase();
            default:
                throw new GenerarFabricaNullException();
        }
    }
}
