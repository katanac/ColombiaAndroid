package com.infotrack.capacitacion.datos.repositorios.origendatos.pruebas;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.infotrack.artefactos.utilitarios.firebase.RxFirebaseHelper;
import com.infotrack.capacitacion.datos.entidades.ComidaDto;

import java.util.List;

import io.reactivex.Observable;

class PruebasFirebase implements PruebasOrigenDatos {

    private RxFirebaseHelper firebaseHelper = new RxFirebaseHelper("base");
    final private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();

    @Override
    public Observable persistirPrueba(final ComidaDto comidaDto) {
        return firebaseHelper.getObservable(referencia
                .child("base")
                .child("pruebaentidad")
                .push()
                .setValue(comidaDto));
    }

    @Override
    public Observable<List<ComidaDto>> consultarListadoPrueba() {
        return firebaseHelper.consultaListaTiempoReal(
                referencia.child("pruebaentidad"),
                ComidaDto.class
        );
    }

    @Override
    public Observable<ComidaDto> consultarPrueba() {
        return firebaseHelper.consultaUnicaVez(
                referencia.child("pruebaentidad")
                        .child("-LfvK9KzyO2IWWD7kovi"),
                ComidaDto.class,
                false
        );
    }

    @Override
    public Observable<List<ComidaDto>> consultarListadoPruebaTiempoReal() {
        return firebaseHelper.consultaListaTiempoReal(
                referencia.child("pruebaentidad"),
                ComidaDto.class
        );
    }

    @Override
    public Observable<ComidaDto> consultarPruebaTiempoReal() {
        return firebaseHelper.consultaTiempoReal(
                referencia.child("pruebaentidad")
                        .child("-LfvK9KzyO2IWWD7kovi"),
                ComidaDto.class,
                false
        );
    }

    @Override
    public Observable<List<ComidaDto>> consultarListadoPruebaPorFiltro() {
        return firebaseHelper.consultaListaUnicaVez(
                referencia.child("-LfvK9KzyO2IWWD7kovi"),
                ComidaDto.class
        );
    }
}
