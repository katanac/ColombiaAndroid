package com.infotrack.capacitacion.datos.repositorios.origendatos.comida;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;
import com.infotrack.artefactos.utilitarios.firebase.RxFirebaseHelper;
import com.infotrack.capacitacion.datos.entidades.ComidaDto;

import java.util.List;

import io.reactivex.Observable;

public class ComidaFirebase implements ComidaOrigenDatos {
    //private RxFirebaseHelper firebaseHelper = new RxFirebaseHelper();
    //private DatabaseReference referencia = firebaseHelper.obtenerReferencia();

    @Override
    public Observable<List<ComidaDto>> consultarListadoComida(int idComida) {
        //Query query = referencia.child(String.valueOf(idComida));
       // return firebaseHelper.consultaListaTiempoReal(query, ComidaDto.class);
        return null;
    }
}
