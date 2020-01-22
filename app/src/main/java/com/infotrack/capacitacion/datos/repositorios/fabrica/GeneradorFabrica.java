package com.infotrack.capacitacion.datos.repositorios.fabrica;

import com.infotrack.capacitacion.datos.excepciones.GenerarFabricaNullException;
import com.infotrack.capacitacion.datos.repositorios.origendatos.pruebas.PruebasFabrica;
import com.infotrack.capacitacion.transversal.enumeradores.FabricasEnum;

import javax.inject.Inject;

public class GeneradorFabrica {

    @Inject
    GeneradorFabrica() {
    }

    public static FabricaAbstracta crearFabrica(FabricasEnum listaFabricas) {
        switch (listaFabricas) {
            case Pruebas:
                return new PruebasFabrica();
            case Default:
            default:
                throw new GenerarFabricaNullException();
        }
    }
}
