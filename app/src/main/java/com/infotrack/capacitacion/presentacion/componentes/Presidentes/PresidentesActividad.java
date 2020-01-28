package com.infotrack.capacitacion.presentacion.componentes.Presidentes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ContextThemeWrapper;

import com.infotrack.artefactos.utilitarios.base.ActividadBase;
import com.infotrack.capacitacion.R;
import com.infotrack.capacitacion.presentacion.base.AplicacionPrincipal;
import com.infotrack.capacitacion.presentacion.base.Navegador;

import javax.inject.Inject;

public class PresidentesActividad extends ActividadBase {


    //region Intencion
    public static Intent ObtenerIntencion(Context contexto){
        return new Intent(contexto, PresidentesActividad.class);
    }
    //endregion

    //region Atributos
    @Inject
    Navegador navegador;
    //endregion

    //region Base
    @Override
    public int asignarLayout() {
        return R.layout.actividad_contenedor;
    }

    @Override
    public void iniciarActividad(Bundle bundle)
    {
        Fragment fragmento = getSupportFragmentManager().findFragmentById(R.id.contenedor);

    }

    @Override
    public void iniciarInyector() {
        super.iniciarInyector();
        AplicacionPrincipal app = (AplicacionPrincipal) this.getApplication();
        app.obtenerComponentePrincipal().inject(this);
    }

    //endregion

}
