package com.infotrack.capacitacion.datos.repositorios.origendatos.geografia;

import com.infotrack.capacitacion.datos.entidades.GeografiaDto;

import java.util.List;

import io.reactivex.Observable;

import com.infotrack.capacitacion.datos.excepciones.GenerarFabricaNullException;
import com.infotrack.capacitacion.datos.repositorios.fabrica.FabricaAbstracta;
import com.infotrack.capacitacion.transversal.enumeradores.OrigenDatosEnum;

public class GeografiaFabrica implements FabricaAbstracta<GeografiaOrigenDatos> {

    @Override
    public GeografiaOrigenDatos crear(String Tipo) {
        switch (OrigenDatosEnum.valueOf(Tipo))
        {
            case FIREBASE:
                return  new GeografiaFirebase();
            case RETROFIT:
                return null;
                default:
                    throw  new GenerarFabricaNullException();

        }

    }
}
