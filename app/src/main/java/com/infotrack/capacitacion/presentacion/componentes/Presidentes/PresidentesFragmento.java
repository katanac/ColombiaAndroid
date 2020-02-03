package com.infotrack.capacitacion.presentacion.componentes.Presidentes;

import android.os.Bundle;
import android.view.View;

import com.infotrack.artefactos.utilitarios.base.FragmentoBase;
import com.infotrack.capacitacion.R;
import com.infotrack.capacitacion.presentacion.base.AplicacionPrincipal;

import java.util.Objects;

public class PresidentesFragmento extends FragmentoBase {

    //region Constructor
    public static PresidentesFragmento obtenerInstancia(){
        return new PresidentesFragmento();
    }
    //endregion

    @Override
    public int asignarLayout() {
        return R.layout.fragmento_presidentes;
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
}
