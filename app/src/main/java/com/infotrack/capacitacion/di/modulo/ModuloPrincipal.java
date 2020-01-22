package com.infotrack.capacitacion.di.modulo;

import android.content.Context;

import com.infotrack.capacitacion.datos.repositorios.fachada.interfaces.PruebaRepositorio;
import com.infotrack.capacitacion.datos.repositorios.fachada.usos.PruebaUso;
import com.infotrack.capacitacion.presentacion.base.AplicacionPrincipal;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

@Module
public class ModuloPrincipal {

    private final AplicacionPrincipal aplicacion;

    public ModuloPrincipal(AplicacionPrincipal aplicacion) {
        this.aplicacion = aplicacion;
    }

    @Provides
    @Singleton
    Context proporcionaContextoDeAplicacion() {
        return aplicacion;
    }

    @Provides
    @Named("hilo_ejecutor")
    Scheduler proporcionaHiloEjecutor() {
        return Schedulers.io();
    }

    @Provides
    @Named("hilo_interfaz_usuario")
    Scheduler proporcionaHiloUI() {
        return AndroidSchedulers.mainThread();
    }

    @Provides
    @Singleton
    PruebaRepositorio proporcionaRepositorioPrueba(PruebaUso pruebaUso) {
        return pruebaUso;
    }

}
