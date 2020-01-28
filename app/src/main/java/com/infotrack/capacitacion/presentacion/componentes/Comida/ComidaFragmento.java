package com.infotrack.capacitacion.presentacion.componentes.Comida;

import android.os.Bundle;
import android.view.View;

import com.infotrack.artefactos.utilitarios.base.FragmentoBase;
import com.infotrack.capacitacion.R;
import com.infotrack.capacitacion.presentacion.base.AplicacionPrincipal;
import com.infotrack.capacitacion.presentacion.base.Navegador;

import java.util.Objects;

import javax.inject.Inject;

public class ComidaFragmento extends FragmentoBase {

    @Inject
    Navegador navegador;

    //region constructor

    public static ComidaFragmento obtenerInstancia() {
        return new ComidaFragmento();
    }
    //endregion

    //region Base
    @Override
    public int asignarLayout() {
        return R.layout.fragmento_comida;
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
