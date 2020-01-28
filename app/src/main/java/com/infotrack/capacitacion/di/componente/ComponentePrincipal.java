package com.infotrack.capacitacion.di.componente;

import android.content.Context;

import com.infotrack.capacitacion.di.modulo.ModuloPrincipal;
import com.infotrack.capacitacion.presentacion.componentes.Biodiversidad.BiodiversidadActividad;
import com.infotrack.capacitacion.presentacion.componentes.Biodiversidad.BiodiversidadFragmento;
import com.infotrack.capacitacion.presentacion.componentes.Comida.ComidaActividad;
import com.infotrack.capacitacion.presentacion.componentes.Comida.ComidaFragmento;
import com.infotrack.capacitacion.presentacion.componentes.informacionGeneral.InformacionGeneralActividad;
import com.infotrack.capacitacion.presentacion.componentes.informacionGeneral.InformacionGeneralFragmento;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ModuloPrincipal.class)
public interface ComponentePrincipal {

    Context contexto();

    void inject(InformacionGeneralActividad pruebaActividad);

    void inject(InformacionGeneralFragmento informacionGeneralFragmento);

    void inject(ComidaActividad comidaActividad);

    void inject(ComidaFragmento comidaFragmento);

    void inject(BiodiversidadActividad biodiversidadActividad);

    void inject(BiodiversidadFragmento biodiversidadFragmento);
}