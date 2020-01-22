package com.infotrack.capacitacion.dominio.casosdeuso.prueba;

import com.infotrack.artefactos.utilitarios.base.CasoDeUso;
import com.infotrack.capacitacion.datos.repositorios.fachada.interfaces.PruebaRepositorio;
import com.infotrack.capacitacion.dominio.modelos.PruebaMdl;

import javax.inject.Inject;
import javax.inject.Named;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

public class PersistirPrueba extends CasoDeUso {

    private final PruebaRepositorio pruebaRepositorio;
    private PruebaMdl pruebaMdl;

    @Inject
    public PersistirPrueba(@Named("hilo_ejecutor") Scheduler hiloEjecutor,
                           @Named("hilo_interfaz_usuario") Scheduler hiloUI,
                           PruebaRepositorio pruebaRepositorio) {
        super(hiloEjecutor, hiloUI);
        this.pruebaRepositorio = pruebaRepositorio;
    }

    public void setPruebaMdl(PruebaMdl pruebaMdl) {
        this.pruebaMdl = pruebaMdl;
    }

    @Override
    public Observable crearObservableCasoDeUso() {
        return pruebaRepositorio.persistirPrueba(this.pruebaMdl);
    }
}
