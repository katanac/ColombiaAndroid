package com.infotrack.capacitacion.presentacion.base;

import android.content.Context;

import com.infotrack.artefactos.utilitarios.base.FragmentoBase;
import com.infotrack.artefactos.utilitarios.base.NavegadorAbstracto;

public interface INavegador extends NavegadorAbstracto {

    void navegarComidaActividad(Context contexto);

    FragmentoBase navegarComidaFragmento();

    void navegarBiodiversidadActividad(Context contexto);

    FragmentoBase navegarBiodiversidadFragmento();


    void navegarInformacionGeneralActividad(Context contexto);

    FragmentoBase navegarInformacionGeneralFragmento();


}
