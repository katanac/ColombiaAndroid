package com.infotrack.capacitacion.datos.repositorios.origendatos.comida;

import com.infotrack.capacitacion.datos.excepciones.GenerarFabricaNullException;
import com.infotrack.capacitacion.datos.repositorios.fabrica.FabricaAbstracta;
import com.infotrack.capacitacion.transversal.enumeradores.OrigenDatosEnum;

public class ComidaFabrica implements FabricaAbstracta<ComidaOrigenDatos> {

    @Override
    public ComidaOrigenDatos crear(String Tipo) {
        switch (OrigenDatosEnum.valueOf(Tipo)){

            case FIREBASE:
                return new ComidaFirebase();
            default:
                throw new GenerarFabricaNullException();
        }
    }
}
