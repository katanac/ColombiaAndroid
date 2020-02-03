package com.infotrack.capacitacion.presentacion.componentes.Biodiversidad;

import android.os.Bundle;
import android.view.View;

import com.infotrack.artefactos.utilitarios.base.FragmentoBase;
import com.infotrack.capacitacion.R;
import com.infotrack.capacitacion.presentacion.base.AplicacionPrincipal;
import com.infotrack.capacitacion.presentacion.base.Navegador;

import javax.inject.Inject;

public class BiodiversidadFragmento extends FragmentoBase {

    @Inject
    Navegador navegador;

    //region contructor
    public static BiodiversidadFragmento obtenerInstancia(){
        return new BiodiversidadFragmento();
    }
    //endregion

    //region Base
    @Override
    public int asignarLayout() {
        return R.layout.fragmento_biodiversidad;
    }

    @Override
    public void iniciarInyector() {
        AplicacionPrincipal app = (AplicacionPrincipal) getActivity().getApplication();
        app.obtenerComponentePrincipal().inject(this);
    }

    @Override
    public void extras() {

    }

    @Override
    public void iniciarFragmento(View view, Bundle bundle) {
        iniciarPresentador();
        ui();
    }

    @Override
    public void ui() {

    }

    @Override
    public void iniciarPresentador() {

    }
    //endregion
}
