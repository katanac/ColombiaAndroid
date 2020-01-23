package com.infotrack.capacitacion.presentacion.componentes.informacionGeneral;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.MenuItem;
import android.view.View;

import com.infotrack.artefactos.utilitarios.base.ActividadBase;
import com.infotrack.capacitacion.R;
import com.infotrack.capacitacion.presentacion.base.AplicacionPrincipal;
import com.infotrack.capacitacion.presentacion.base.Navegador;

import javax.inject.Inject;


public class InformacionGeneralActividad extends ActividadBase {

    //region Atributos
    @Inject
    InformacionGeneralPresentador presentador;
    @Inject
    Navegador navegador;
    //endregion

    public static Intent obtenerintencion(Context contexto) {
        return new Intent(contexto, InformacionGeneralActividad.class);
    }


    //region Actividad Base
    @Override
    public int asignarLayout() {
        return R.layout.actividad_contenedor;
    }

    @Override
    public void iniciarInyector() {
        super.iniciarInyector();
        AplicacionPrincipal aplicacionPrincipal = (AplicacionPrincipal) this.getApplication();
        aplicacionPrincipal.obtenerComponentePrincipal().inject(this);
    }

    @Override
    public void iniciarActividad(Bundle bundle) {
        Fragment fragmento = getSupportFragmentManager().findFragmentById(R.id.contenedor);
        if (fragmento == null)
            agregarFragmento(R.id.contenedor, navegador.navegarInformacionGeneralFragmento());

    }
    //endregion

    public void crearEntidadPrueba(View view) {
        presentador.establecerVista(null);
    }

    public void consultarEntidadPrueba(View view) {
        presentador.consultarPrueba();
    }

    public void consultarListaPrueba(View view) {
        presentador.consultarListaPrueba();
    }

    @Override
    protected void onDestroy() {
        presentador.destruir();
        super.onDestroy();
    }

    @Override
    public void seleccionMenuNavegacion(MenuItem menuItem) {
        super.seleccionMenuNavegacion(menuItem);
        navegador.seleccionar(menuItem.getItemId(), this);
    }
}
