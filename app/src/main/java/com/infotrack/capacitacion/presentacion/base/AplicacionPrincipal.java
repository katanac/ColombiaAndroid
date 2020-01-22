package com.infotrack.capacitacion.presentacion.base;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;
import com.infotrack.capacitacion.di.componente.ComponentePrincipal;
import com.infotrack.capacitacion.di.componente.DaggerComponentePrincipal;
import com.infotrack.capacitacion.di.modulo.ModuloPrincipal;

public class AplicacionPrincipal extends Application {

    //region Propiedades
    private ComponentePrincipal componente;
    //endregion

    //region Metodos De Sobrecarga
    @Override
    public void onCreate() {
        super.onCreate();

        if (!FirebaseApp.getApps(this).isEmpty()) {
            FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        }

        inicializarInyector();
    }
    //endregion

    //region Metodos Propios
    private void inicializarInyector() {
        componente = DaggerComponentePrincipal.builder().moduloPrincipal(new ModuloPrincipal(this)).build();
    }

    public ComponentePrincipal obtenerComponentePrincipal() {
        return componente;
    }
    //endregion
}
