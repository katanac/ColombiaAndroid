package com.infotrack.capacitacion.di.componente;

import android.content.Context;

import com.infotrack.capacitacion.di.modulo.ModuloPrincipal;
import com.infotrack.capacitacion.presentacion.componentes.Comida.ComidaActividad;
import com.infotrack.capacitacion.presentacion.componentes.Comida.ComidaFragmento;
import com.infotrack.capacitacion.presentacion.componentes.informacionGeneral.InformacionGeneralActividad;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ModuloPrincipal.class)
public interface ComponentePrincipal {

    Context contexto();

    void inject(InformacionGeneralActividad pruebaActividad);

    void inject(ComidaActividad comidaActividad);

    void inject(ComidaFragmento comidaFragmento);
}
