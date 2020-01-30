package com.infotrack.capacitacion.presentacion.componentes.launch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

import com.infotrack.capacitacion.R;
import com.infotrack.capacitacion.presentacion.componentes.informacionGeneral.InformacionGeneralActividad;

public class launchActividad extends Activity {

    //region Atributos
    int tiempo = 1;
    //endregion


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmento_launcher);
        iniciarLaunch();
    }

    private void iniciarLaunch() {
        new Handler().postDelayed(() -> {
            startActivity(new Intent(new Intent(getBaseContext(), InformacionGeneralActividad.class)));
            finish();
        }, tiempo * 1000);
    }
}
