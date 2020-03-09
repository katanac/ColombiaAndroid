package com.infotrack.capacitacion.presentacion.componentes.Comida;

import android.os.Bundle;
import android.view.View;

import com.infotrack.artefactos.utilitarios.base.FragmentoBase;
import com.infotrack.capacitacion.R;
import com.infotrack.capacitacion.presentacion.base.AplicacionPrincipal;
import com.infotrack.capacitacion.presentacion.base.Navegador;
import com.infotrack.capacitacion.presentacion.vistamodelos.ComidaVM;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import javax.inject.Inject;

public class ComidaFragmento extends FragmentoBase implements ComidaContrato {

    //region Atributos
    @Inject
    Navegador navegador;

    @Inject
    ComidaPresentador presentador;

    private List<ComidaVM> listadoComida;
    private ComidaAdaptador adaptador;
    //endregion

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
        listadoComida = new LinkedList<>();
    }

    @Override
    public void iniciarFragmento(View view, Bundle bundle) {
        iniciarPresentador();
        ui();
    }

    @Override
    public void ui() {
        adaptador = new ComidaAdaptador(listadoComida);
    }

    @Override
    public void iniciarPresentador() {

    }

    @Override
    public void mostarListadoComida() {

    }
    //endregion
}
