package com.infotrack.capacitacion.datos.repositorios.origendatos.comida;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;
import com.infotrack.artefactos.utilitarios.firebase.RxFirebaseHelper;
import com.infotrack.capacitacion.datos.entidades.ComidaDto;
import com.infotrack.capacitacion.transversal.firebase.ConstantesFirebase;
import com.infotrack.capacitacion.transversal.firebase.rutas.ComidaRutas;

import java.util.List;

import io.reactivex.Observable;

public class ComidaFirebase implements ComidaOrigenDatos {
    private RxFirebaseHelper firebaseHelper = new RxFirebaseHelper(ConstantesFirebase.FIREBASE_NODO_RAIZ);
    private DatabaseReference referencia = firebaseHelper.obtenerReferencia();

    @Override
    public Observable<List<ComidaDto>> consultarListadoComida() {
        Query query = referencia.child(ComidaRutas.NODO_FIREBASE_COMIDA);
        return firebaseHelper.consultaListaTiempoReal(query, ComidaDto.class);
    }
}
