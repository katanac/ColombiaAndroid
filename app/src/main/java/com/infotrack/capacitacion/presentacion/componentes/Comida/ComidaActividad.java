package com.infotrack.capacitacion.presentacion.componentes.Comida;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.MenuItem;

import com.infotrack.artefactos.utilitarios.base.ActividadBase;
import com.infotrack.capacitacion.R;
import com.infotrack.capacitacion.presentacion.base.AplicacionPrincipal;
import com.infotrack.capacitacion.presentacion.base.Navegador;

import javax.inject.Inject;


public class ComidaActividad extends ActividadBase {

    //region Regiones
    @Inject
    Navegador navegador;
    //endregion

    public static Intent obtenerIntencion(Context contexto) {
        return new Intent(contexto, ComidaActividad.class);
    }


    //region Actividad Base
    @Override
    public int asignarLayout() {
        return R.layout.actividad_contenedor;
    }

    @Override
    public void iniciarActividad(Bundle bundle) {
        Fragment fragmento = getSupportFragmentManager().findFragmentById(R.id.contenedor);
        if (fragmento == null)
            agregarFragmento(R.id.contenedor, navegador.navegarComidaFragmento());
    }

    @Override
    public void iniciarInyector() {
        super.iniciarInyector();
        AplicacionPrincipal app = (AplicacionPrincipal) this.getApplication();
        app.obtenerComponentePrincipal().inject(this);
    }


    @Override
    public void seleccionMenuNavegacion(MenuItem menuItem) {
        super.seleccionMenuNavegacion(menuItem);
        navegador.seleccionar(menuItem.getItemId(), this);
    }
    //endregion
}
