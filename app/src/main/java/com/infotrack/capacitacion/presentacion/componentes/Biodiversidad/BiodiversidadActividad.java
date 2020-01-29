package com.infotrack.capacitacion.presentacion.componentes.Biodiversidad;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.infotrack.artefactos.utilitarios.base.ActividadBase;
import com.infotrack.capacitacion.R;
import com.infotrack.capacitacion.presentacion.base.AplicacionPrincipal;
import com.infotrack.capacitacion.presentacion.base.Navegador;

import javax.inject.Inject;

public class BiodiversidadActividad extends ActividadBase {

    //region Atrivutos
    @Inject
    Navegador navegador;
    //endregion

    //region Intencion
    public static Intent obtenerIntencion(Context contexto){
        return new Intent(contexto, BiodiversidadActividad.class);
    }
    //endregion

    @Override
    public int asignarLayout() {
        return R.layout.actividad_contenedor;
    }

    @Override
    public void iniciarActividad(Bundle bundle) {
        Fragment fragmento = getSupportFragmentManager().findFragmentById(R.id.contenedor);

        //if(fragmento == null)
            //agregarFragmento(R.id.contenedor, navegador.navega);
    }

    @Override
    public void iniciarInyector() {
        super.iniciarInyector();
        AplicacionPrincipal app = (AplicacionPrincipal) this.getApplication();
        app.obtenerComponentePrincipal().inject(this);
    }

    //endregion
}
