package com.infotrack.capacitacion.datos.repositorios.origendatos.pruebas;

import com.infotrack.capacitacion.datos.repositorios.fabrica.FabricaAbstracta;
import com.infotrack.capacitacion.transversal.enumeradores.OrigenDatosEnum;

public class PruebasFabrica implements FabricaAbstracta<PruebasOrigenDatos> {

    @Override
    public PruebasOrigenDatos crear(String origen) {
        switch (OrigenDatosEnum.valueOf(origen)) {
            case FIREBASE:
                return new PruebasFirebase();
            case RETROFIT:
            default:
                // TODO: 23/05/2019 Manejar excepcion controlada
                return null;
        }
    }
}
