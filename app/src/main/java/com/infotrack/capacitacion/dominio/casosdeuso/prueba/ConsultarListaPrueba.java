package com.infotrack.capacitacion.dominio.casosdeuso.prueba;

import com.infotrack.artefactos.utilitarios.base.CasoDeUso;
import com.infotrack.capacitacion.datos.repositorios.fachada.interfaces.PruebaRepositorio;
import com.infotrack.capacitacion.dominio.modelos.PruebaMdl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

public class ConsultarListaPrueba extends CasoDeUso<List<PruebaMdl>> {

    private final PruebaRepositorio pruebaRepositorio;

    @Inject
    public ConsultarListaPrueba(@Named("hilo_ejecutor") Scheduler hiloEjecutor,
                                @Named("hilo_interfaz_usuario") Scheduler hiloUI,
                                PruebaRepositorio pruebaRepositorio) {
        super(hiloEjecutor, hiloUI);
        this.pruebaRepositorio = pruebaRepositorio;
    }

    @Override
    public Observable<List<PruebaMdl>> crearObservableCasoDeUso() {
        return pruebaRepositorio.consultarListadoPrueba();
    }
}