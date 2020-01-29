package com.infotrack.capacitacion.presentacion.componentes.Ffaa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.infotrack.artefactos.utilitarios.base.ActividadBase;
import com.infotrack.capacitacion.R;
import com.infotrack.capacitacion.presentacion.base.AplicacionPrincipal;
import com.infotrack.capacitacion.presentacion.base.Navegador;
import com.infotrack.capacitacion.presentacion.componentes.Comida.ComidaActividad;

import javax.inject.Inject;

public class FfaaActividad extends ActividadBase {

    //region Atributos
    @Inject
    Navegador navegador;
    //endregion


    //region Intencion
    public static Intent obtenerIntencion(Context contexto){
        return new Intent(contexto, FfaaActividad.class);
    }
    //endregion


    //region Base
    @Override
    public int asignarLayout() {
        return R.layout.actividad_contenedor;
    }

    @Override
    public void iniciarActividad(Bundle bundle) {
        Fragment fragmento = getSupportFragmentManager().findFragmentById(R.id.contenedor);
        //if(fragmento==null)
            //agregarFragmento(R.id.contenedor, navegador.navegadorFfaaFragmento);
    }
    //endregion


    @Override
    public void iniciarInyector() {
        super.iniciarInyector();
        AplicacionPrincipal app = (AplicacionPrincipal) this.getApplication();
        app.obtenerComponentePrincipal().inject(this);
    }
}
