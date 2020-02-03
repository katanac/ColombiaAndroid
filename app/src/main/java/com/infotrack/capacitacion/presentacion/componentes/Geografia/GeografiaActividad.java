package com.infotrack.capacitacion.presentacion.componentes.Geografia;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.infotrack.artefactos.utilitarios.base.ActividadBase;
import com.infotrack.capacitacion.R;
import com.infotrack.capacitacion.presentacion.base.AplicacionPrincipal;
import com.infotrack.capacitacion.presentacion.base.Navegador;

import javax.inject.Inject;

public class GeografiaActividad extends ActividadBase {

    //Region Atributos
    @Inject
    Navegador navegador;
    //endregion

    //Region Intencion
    public  static Intent obtenerIntencion(Context contexto)
    {
        return  new Intent(contexto,GeografiaActividad.class);
    }
    //endregion
    @Override
    public int asignarLayout() {
        return R.layout.actividad_contenedor;
    }



    @Override
    public void iniciarActividad(Bundle bundle) {
        Fragment fragmento = getSupportFragmentManager().findFragmentById(R.id.contenedor);
       // if (fragmento == null)
          //  agregarFragmento(R.id.contenedor, navegador.navegarComidaFragmento());
    }

    @Override
    public void iniciarInyector() {
        super.iniciarInyector();
        AplicacionPrincipal app = (AplicacionPrincipal) this.getApplication();
        app.obtenerComponentePrincipal().inject(this);
    }
}