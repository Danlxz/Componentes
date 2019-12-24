package com.example.componentes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    // Dataset que son los datos que se pretende mostrar en RecyclerView
    private ArrayList<String> names;

    public CustomAdapter(ArrayList<String> names) {
        this.names = names;
    }

    // Clase interna que permite obtener referencias de los componentes visuales de cada elemento de la lista
    // ejemplo textview, edittext, etc.
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.txt_Row);
        }
    }

    // El layout manager invoca este método para renderizar cada elemento del RecyclerView
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // creamos una nueva vista
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        return new ViewHolder(v);
    }

    // Enlaza nuestra data con cada ViewHolder, en otras palabras
    // Este método reemplaza el contenido de cada view, para cada elemento de la lista
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // - obtenemos un elemento del dataset según su posición
        // - reemplazamos el contenido de los views según tales datos
        holder.textView.setText(names.get(position));
    }

    // Método que define la cantidad de elementos del RecyclerView
    // Puede ser más complejo (por ejemplo si implementamos filtros o búsquedas)
    @Override
    public int getItemCount() {
        return names.size();
    }

    // Metodo constructor el filtro de elementos del dataset que se pretende mostrar
    public void filterList(ArrayList<String> filterNames){
        this.names = filterNames;
        notifyDataSetChanged();
    }

}
