package com.infotrack.capacitacion.datos.repositorios.fachada.usos;

import com.infotrack.artefactos.utilitarios.base.Mapeadores.MapeadorGenerico;
import com.infotrack.capacitacion.datos.entidades.ComidaDto;
import com.infotrack.capacitacion.datos.repositorios.fabrica.FabricaAbstracta;
import com.infotrack.capacitacion.datos.repositorios.fabrica.GeneradorFabrica;
import com.infotrack.capacitacion.datos.repositorios.fachada.interfaces.ComidaRepositorio;
import com.infotrack.capacitacion.datos.repositorios.origendatos.comida.ComidaOrigenDatos;
import com.infotrack.capacitacion.dominio.modelos.ComidaMdl;
import com.infotrack.capacitacion.transversal.enumeradores.FabricasEnum;
import com.infotrack.capacitacion.transversal.enumeradores.OrigenDatosEnum;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

public class ComidaUso implements ComidaRepositorio {

    private final MapeadorGenerico<ComidaDto, ComidaMdl> mapeadorComida;

    //region Constructor
    @Inject
     ComidaUso(MapeadorGenerico<ComidaDto, ComidaMdl> mapeadorComida) {
        this.mapeadorComida = mapeadorComida;
    }
    //endregion

    //region Fabrica
    private ComidaOrigenDatos generadorFabricaFirebase() {
        FabricaAbstracta fabricaAbstracta = GeneradorFabrica.crearFabrica(FabricasEnum.Comida);
        return (ComidaOrigenDatos) fabricaAbstracta.crear(OrigenDatosEnum.FIREBASE.toString());
    }
    //endregion

    //region Contrato
    @Override
    public Observable<List<ComidaMdl>> consultarListadoComida() {
        return generadorFabricaFirebase().consultarListadoComida()
                .map(comidaDtos -> mapeadorComida.mapear(comidaDtos, new ComidaMdl()));
    }
    //endregion
}
