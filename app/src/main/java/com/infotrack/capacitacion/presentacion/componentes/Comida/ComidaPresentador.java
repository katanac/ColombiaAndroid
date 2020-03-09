package com.infotrack.capacitacion.presentacion.componentes.Comida;

import com.infotrack.artefactos.utilitarios.base.PresentadorBase;
import com.infotrack.capacitacion.dominio.casosdeuso.comida.ConsultarListaComida;

import javax.inject.Inject;

public class ComidaPresentador extends PresentadorBase {

    //region Atributos
    private ConsultarListaComida consultarListaComida;
    //endregion

    //region Constructor
    @Inject
    ComidaPresentador(ConsultarListaComida consultarListaComida) {
        this.consultarListaComida = consultarListaComida;
    }
    //endregion

    //region Presentador base
    @Override
    public void destruir() {
        consultarListaComida.desechar();
    }
    //endregion


}

