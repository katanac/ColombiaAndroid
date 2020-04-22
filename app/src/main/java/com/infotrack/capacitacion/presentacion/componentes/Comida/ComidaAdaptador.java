package com.infotrack.capacitacion.presentacion.componentes.Comida;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.infotrack.capacitacion.R;
import com.infotrack.capacitacion.presentacion.vistamodelos.ComidaVM;

import java.util.List;

import butterknife.BindView;

public class ComidaAdaptador extends RecyclerView.Adapter<ComidaAdaptador.ViewHolder> {

    private List<ComidaVM> listadoComida;


    ComidaAdaptador(List<ComidaVM> listadoComida) {
        this.listadoComida = listadoComida;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_comida, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.bin(i);
    }

    @Override
    public int getItemCount() {
        return listadoComida.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_comida)
        TextView nombreComida;
        @BindView(R.id.tv_ingredientes)
        TextView ingredientes;
        @BindView(R.id.tv_region)
        TextView region;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        void bin(final int posicion) {
            final ComidaVM comida = listadoComida.get(posicion);
            nombreComida.setText(comida.getNombreComida());
            ingredientes.setText(comida.getIngredientes());
            region.setText(comida.getRegion());
        }
    }
}
