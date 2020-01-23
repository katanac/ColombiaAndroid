package com.infotrack.capacitacion.presentacion.componentes.informacionGeneral;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.infotrack.artefactos.utilitarios.base.FragmentoBase;
import com.infotrack.capacitacion.R;
import com.infotrack.capacitacion.presentacion.base.AplicacionPrincipal;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

import java.util.Objects;

import butterknife.BindView;

public class InformacionGeneralFragmento extends FragmentoBase {


    //region Atributos
    @BindView(R.id.carousel_infor_general)
    CarouselView carouselView;
    //endregion

    //region Instancia
    public static InformacionGeneralFragmento obtenerInstancia() {
        return new InformacionGeneralFragmento();
    }
    //endregion


    //region Base
    @Override
    public int asignarLayout() {
        return R.layout.fragmento_info_general;
    }

    @Override
    public void iniciarInyector() {
        AplicacionPrincipal app = (AplicacionPrincipal) Objects.requireNonNull(getActivity()).getApplication();
        app.obtenerComponentePrincipal().inject(this);
    }

    @Override
    public void extras() {

    }

    @Override
    public void iniciarFragmento(View view, Bundle bundle) {
        ui();
        iniciarPresentador();
    }

    @Override
    public void ui() {
        llenadoCarouselView(carouselView);
    }

    @Override
    public void iniciarPresentador() {

    }
    //endregion

    //region Propios
    private int[] obtenerImagenesCarousel() {
        return new int[]{
                R.drawable.bandera,
                R.drawable.avenacional,
                R.drawable.escudo,
                R.drawable.flornacional,
                R.drawable.palmacera};

    }

    private String[] obtenerNombresCarrousel() {
        return new String[]{
                "bandera",
                "Ave Nacional",
                "Escudo",
                "Flor Nacional",
                "Palma De cera"
        };
    }

    private void llenadoCarouselView(CarouselView carouselView) {

        carouselView.setImageListener(listenerImagen);
        carouselView.setImageClickListener(listenerOnclick);
        carouselView.setPageCount(obtenerImagenesCarousel().length);

    }
    //endregion

    //region Listeners
    ImageListener listenerImagen = (position, imageView) -> imageView.setImageResource(obtenerImagenesCarousel()[position]);

    ImageClickListener listenerOnclick = position ->
            Toast.makeText(getActivity(), obtenerNombresCarrousel()[position], Toast.LENGTH_SHORT).show();
    //endregion
}
