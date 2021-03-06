package com.infotrack.capacitacion.presentacion.base;

import android.content.Context;
import android.content.Intent;

import com.infotrack.artefactos.utilitarios.base.FragmentoBase;
import com.infotrack.capacitacion.R;
import com.infotrack.capacitacion.presentacion.componentes.Biodiversidad.BiodiversidadActividad;
import com.infotrack.capacitacion.presentacion.componentes.Biodiversidad.BiodiversidadFragmento;
import com.infotrack.capacitacion.presentacion.componentes.Comida.ComidaActividad;
import com.infotrack.capacitacion.presentacion.componentes.Comida.ComidaFragmento;
import com.infotrack.capacitacion.presentacion.componentes.Geografia.GeografiaFragmento;
import com.infotrack.capacitacion.presentacion.componentes.Presidentes.PresidentesActividad;
import com.infotrack.capacitacion.presentacion.componentes.Presidentes.PresidentesFragmento;
import com.infotrack.capacitacion.presentacion.componentes.Ffaa.FfaaActividad;
import com.infotrack.capacitacion.presentacion.componentes.Ffaa.FfaaFragmento;
import com.infotrack.capacitacion.presentacion.componentes.Geografia.GeografiaActividad;
import com.infotrack.capacitacion.presentacion.componentes.informacionGeneral.InformacionGeneralActividad;
import com.infotrack.capacitacion.presentacion.componentes.informacionGeneral.InformacionGeneralFragmento;

import javax.inject.Inject;

public class Navegador implements INavegador {

    //region Constructor
    @Inject
    public Navegador() {
    }
    //endregion

    //region Contrato
    @Override
    public void seleccionar(int i, Context context) {
        switch (i) {
            case R.id.navegador_comida:
                navegarComidaActividad(context);
                break;
            case R.id.navegador_geografia:
                navegarGeografiaActividad(context);
                break;
            case R.id.navegador_biodiversidad:
                navegarBiodiversidadActividad(context);
                break;
            case R.id.navegador_presedente:
                navegarPresidentesActividad(context);
                break;
            case R.id.navegador_ffaaa:
                navegarFfaaActividad(context);
                break;
            case R.id.navegador_sugerencias:
                break;


        }
    }

    @Override
    public void navegarComidaActividad(Context contexto) {
        Intent intencion = ComidaActividad.obtenerIntencion(contexto);
        intencion.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intencion.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        contexto.startActivity(intencion);
    }

    @Override
    public FragmentoBase navegarComidaFragmento() {
        return ComidaFragmento.obtenerInstancia();
    }

    @Override
    public void navegarBiodiversidadActividad(Context contexto) {
        Intent intencion = BiodiversidadActividad.obtenerIntencion(contexto);
        intencion.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intencion.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        contexto.startActivity(intencion);
    }

    @Override
    public FragmentoBase navegarBiodiversidadFragmento() {
        return BiodiversidadFragmento.obtenerInstancia();
    }

    @Override
    public void navegarInformacionGeneralActividad(Context contexto) {
        contexto.startActivity(InformacionGeneralActividad.obtenerintencion(contexto));
    }

    @Override
    public FragmentoBase navegarInformacionGeneralFragmento() {
        return InformacionGeneralFragmento.obtenerInstancia();
    }

    @Override
    public void navegarGeografiaActividad(Context contexto) {
        Intent intencion = GeografiaActividad.obtenerIntencion(contexto);
        intencion.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intencion.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        contexto.startActivity(intencion);
    }

    @Override
    public FragmentoBase navegarGeografiaFragmento() {
        return GeografiaFragmento.ObtenerInstancia();
    }

    @Override
    public void navegarPresidentesActividad(Context contexto) {
        Intent intencion = PresidentesActividad.obtenerIntencion(contexto);
        intencion.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intencion.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        contexto.startActivity(intencion);
    }

    @Override
    public FragmentoBase navegarPreseidentesFragmento() {
        return PresidentesFragmento.obtenerInstancia();
    }

    @Override
    public void navegarFfaaActividad(Context contexto) {
        Intent intencion = FfaaActividad.obtenerIntencion(contexto);
        intencion.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intencion.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        contexto.startActivity(intencion);
    }

    @Override
    public FragmentoBase navegarFfaaFragmento() {
        return FfaaFragmento.obtenerInstancia();
    }

    //endregion


}
