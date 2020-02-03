package com.infotrack.capacitacion.presentacion.componentes.Geografia;

import android.os.Bundle;
import android.view.View;

import com.infotrack.artefactos.utilitarios.base.FragmentoBase;
import com.infotrack.capacitacion.R;
import com.infotrack.capacitacion.presentacion.base.AplicacionPrincipal;
import com.infotrack.capacitacion.presentacion.base.Navegador;


import java.util.Objects;

import javax.inject.Inject;

public class GeografiaFragmento extends FragmentoBase {
    //region Base

    @Inject
    Navegador navegador;


    public static GeografiaFragmento ObtenerInstancia() {
        return new GeografiaFragmento();
    }

    @Override
    public int asignarLayout() {
        return R.layout.fragmento_geografia;
    }

    @Override
    public void iniciarInyector() {
        AplicacionPrincipal app = (AplicacionPrincipal) Objects.requireNonNull(getActivity()).getApplication();
        app.obtenerComponentePrincipal().inject(this);
    }

    @Override
    public void extras() {

    }

    @Override
    public void iniciarFragmento(View view, Bundle bundle) {

    }

    @Override
    public void ui() {

    }

    @Override
    public void iniciarPresentador() {

    }
    //endregion
}
