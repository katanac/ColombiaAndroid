package com.infotrack.capacitacion.presentacion.componentes.Ffaa;

import android.os.Bundle;
import android.view.View;

import com.infotrack.artefactos.utilitarios.base.FragmentoBase;
import com.infotrack.capacitacion.R;
import com.infotrack.capacitacion.presentacion.base.AplicacionPrincipal;
import com.infotrack.capacitacion.presentacion.base.Navegador;

import javax.inject.Inject;

public class FfaaFragmento extends FragmentoBase {

    //region Atributos
    @Inject
    Navegador navegador;
    //endregion


    //region constructor
    public static FfaaFragmento obtenerInstancia(){
        return new FfaaFragmento();
    }
    //endregion


    //region Base
    @Override
    public int asignarLayout() {
        return R.layout.fragmento_ffaa;
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
