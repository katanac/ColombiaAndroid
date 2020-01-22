package com.infotrack.capacitacion.datos.repositorios.origendatos.pruebas;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.infotrack.artefactos.utilitarios.firebase.RxFirebaseHelper;
import com.infotrack.capacitacion.datos.entidades.PruebaDto;

import java.util.List;

import io.reactivex.Observable;

class PruebasFirebase implements PruebasOrigenDatos {

    private RxFirebaseHelper firebaseHelper = new RxFirebaseHelper("base");
    final private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();

    @Override
    public Observable persistirPrueba(final PruebaDto pruebaDto) {
        return firebaseHelper.getObservable(referencia
                .child("base")
                .child("pruebaentidad")
                .push()
                .setValue(pruebaDto));
    }

    @Override
    public Observable<List<PruebaDto>> consultarListadoPrueba() {
        return firebaseHelper.consultaListaTiempoReal(
                referencia.child("pruebaentidad"),
                PruebaDto.class
        );
    }

    @Override
    public Observable<PruebaDto> consultarPrueba() {
        return firebaseHelper.consultaUnicaVez(
                referencia.child("pruebaentidad")
                        .child("-LfvK9KzyO2IWWD7kovi"),
                PruebaDto.class,
                false
        );
    }

    @Override
    public Observable<List<PruebaDto>> consultarListadoPruebaTiempoReal() {
        return firebaseHelper.consultaListaTiempoReal(
                referencia.child("pruebaentidad"),
                PruebaDto.class
        );
    }

    @Override
    public Observable<PruebaDto> consultarPruebaTiempoReal() {
        return firebaseHelper.consultaTiempoReal(
                referencia.child("pruebaentidad")
                        .child("-LfvK9KzyO2IWWD7kovi"),
                PruebaDto.class,
                false
        );
    }

    @Override
    public Observable<List<PruebaDto>> consultarListadoPruebaPorFiltro() {
        return firebaseHelper.consultaListaUnicaVez(
                referencia.child("-LfvK9KzyO2IWWD7kovi"),
                PruebaDto.class
        );
    }
}
