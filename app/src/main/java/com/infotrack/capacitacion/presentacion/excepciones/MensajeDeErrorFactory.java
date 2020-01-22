package com.infotrack.capacitacion.presentacion.excepciones;

import android.content.Context;

import com.infotrack.capacitacion.R;

public class MensajeDeErrorFactory {

    public MensajeDeErrorFactory() {
    }


    public static String crear(Context contexto, Exception excepcion) {
        String message = contexto.getString(R.string.mensaje_error_defecto);
/*
        if (excepcion instanceof ConexionException) {
            message = contexto.getString(R.string.error_msj_sin_conexion);
        } else if (excepcion instanceof UsuarioNoEncontradoException) {
            message = contexto.getString(R.string.error_msj_usuario_no_encontrado);
        }*/

        return message;
    }
}
