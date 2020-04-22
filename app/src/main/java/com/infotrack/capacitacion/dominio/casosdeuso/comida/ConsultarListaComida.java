package com.infotrack.capacitacion.dominio.casosdeuso.comida;

import com.infotrack.artefactos.utilitarios.base.CasoDeUso;
import com.infotrack.capacitacion.datos.repositorios.fachada.interfaces.ComidaRepositorio;
import com.infotrack.capacitacion.dominio.modelos.ComidaMdl;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

public class ConsultarListaComida extends CasoDeUso<List<ComidaMdl>> {

    //region Atributos
    private ComidaRepositorio repositorio;

    @Inject
    ConsultarListaComida(ComidaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Observable<List<ComidaMdl>> crearObservableCasoDeUso() {
        return repositorio.consultarListadoComida();
    }
    //endregion


}
