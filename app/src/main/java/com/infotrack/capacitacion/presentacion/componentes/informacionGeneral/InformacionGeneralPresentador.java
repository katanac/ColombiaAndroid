package com.infotrack.capacitacion.presentacion.componentes.informacionGeneral;

import com.infotrack.artefactos.utilitarios.base.AccionesObservador;
import com.infotrack.artefactos.utilitarios.base.Mapeadores.MapeadorGenerico;
import com.infotrack.artefactos.utilitarios.base.PresentadorBase;
import com.infotrack.capacitacion.dominio.casosdeuso.prueba.ConsultarListaPrueba;
import com.infotrack.capacitacion.dominio.casosdeuso.prueba.ConsultarPrueba;
import com.infotrack.capacitacion.dominio.casosdeuso.prueba.PersistirPrueba;
import com.infotrack.capacitacion.dominio.modelos.PruebaMdl;
import com.infotrack.capacitacion.presentacion.vistamodelos.PruebaVM;

import java.util.List;

import javax.inject.Inject;

class InformacionGeneralPresentador extends PresentadorBase<InformacionGeneralContrato> {
    private MapeadorGenerico<PruebaMdl, PruebaVM> mapPrueba;
    private PersistirPrueba persistirPrueba;
    private ConsultarPrueba consultarPrueba;
    private ConsultarListaPrueba consultarListaPrueba;

    @Inject
    InformacionGeneralPresentador(MapeadorGenerico<PruebaMdl, PruebaVM> mapPrueba,
                                  ConsultarPrueba consultarPrueba,
                                  ConsultarListaPrueba consultarListaPrueba) {
        this.mapPrueba = mapPrueba;
        this.consultarPrueba = consultarPrueba;
        this.consultarListaPrueba = consultarListaPrueba;
    }


    void consultarPrueba() {
        consultarPrueba.ejecutar(new ConsultarPruebaObservador());
    }

    void consultarListaPrueba() {
        consultarListaPrueba.ejecutar(new ConsultarListaPruebaObservador());
    }

    @Override
    public void destruir() {
     //   persistirPrueba.desechar();
     //   consultarPrueba.desechar();
    }

    class ConsultarPruebaObservador extends AccionesObservador<PruebaMdl> {
        @Override
        public void onNext(PruebaMdl value) {
            super.onNext(value);
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
        }

        @Override
        public void onComplete() {
            super.onComplete();
        }
    }

    class ConsultarListaPruebaObservador extends AccionesObservador<List<PruebaMdl>> {
        @Override
        public void onNext(List<PruebaMdl> value) {
            super.onNext(value);
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
        }

        @Override
        public void onComplete() {
            super.onComplete();
        }
    }
}
