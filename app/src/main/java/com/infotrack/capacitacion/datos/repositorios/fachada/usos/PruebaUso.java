package com.infotrack.capacitacion.datos.repositorios.fachada.usos;

import com.infotrack.artefactos.utilitarios.base.Mapeadores.MapeadorGenerico;
import com.infotrack.capacitacion.datos.entidades.ComidaDto;
import com.infotrack.capacitacion.datos.repositorios.fachada.interfaces.PruebaRepositorio;
import com.infotrack.capacitacion.datos.repositorios.fabrica.FabricaAbstracta;
import com.infotrack.capacitacion.datos.repositorios.fabrica.GeneradorFabrica;
import com.infotrack.capacitacion.datos.repositorios.origendatos.pruebas.PruebasOrigenDatos;
import com.infotrack.capacitacion.dominio.modelos.PruebaMdl;
import com.infotrack.capacitacion.transversal.enumeradores.FabricasEnum;
import com.infotrack.capacitacion.transversal.enumeradores.OrigenDatosEnum;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

public class PruebaUso implements PruebaRepositorio {

    private final MapeadorGenerico<ComidaDto, PruebaMdl> mapPrueba;

    @Inject
    PruebaUso(MapeadorGenerico<ComidaDto, PruebaMdl> mapPrueba) {
        this.mapPrueba = mapPrueba;
    }

    @Override
    public Observable persistirPrueba(PruebaMdl pruebaMdl) {
        FabricaAbstracta fabricaAbstracta = GeneradorFabrica.crearFabrica(FabricasEnum.Pruebas);
        PruebasOrigenDatos pruebasOrigenDatos = ((PruebasOrigenDatos) fabricaAbstracta.crear(OrigenDatosEnum.FIREBASE.toString()));
        return pruebasOrigenDatos.persistirPrueba(mapPrueba.revertir(pruebaMdl, new ComidaDto()));
    }

    @Override
    public Observable<List<PruebaMdl>> consultarListadoPrueba() {
        FabricaAbstracta fabricaAbstracta = GeneradorFabrica.crearFabrica(FabricasEnum.Pruebas);
        PruebasOrigenDatos pruebasOrigenDatos = ((PruebasOrigenDatos) fabricaAbstracta.crear(OrigenDatosEnum.FIREBASE.toString()));
        return pruebasOrigenDatos.consultarListadoPrueba().map(pruebaDtos -> mapPrueba.mapear(pruebaDtos, new PruebaMdl()));
    }

    @Override
    public Observable<PruebaMdl> consultarPrueba() {
        FabricaAbstracta fabricaAbstracta = GeneradorFabrica.crearFabrica(FabricasEnum.Pruebas);
        PruebasOrigenDatos pruebasOrigenDatos = ((PruebasOrigenDatos) fabricaAbstracta.crear(OrigenDatosEnum.FIREBASE.toString()));
        return pruebasOrigenDatos.consultarPrueba().map(pruebaDto -> mapPrueba.mapear(pruebaDto, new PruebaMdl()));
    }
}
