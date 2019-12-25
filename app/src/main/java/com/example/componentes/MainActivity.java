package com.example.componentes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    EditText txtbuscar;
    ArrayList<String> names;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        names = new ArrayList<>();
        names.add("Naruto");
        names.add("One Piece");
        names.add("Dragon Ball");
        names.add("Berserk");
        names.add("Gintama");
        names.add("Nanatsu No taizai");
        names.add("Black Jack");
        names.add("Death Note");
        names.add("Code Geass");
        names.add("Black Clover");
        names.add("Bleach");

        recycler = findViewById(R.id.recycler1);
        txtbuscar = findViewById(R.id.search_txt);

        // Se usa para mejorar el rendimiento, si sabemos que el contenido no va afectar el tamaño del recyclerview
        recycler.setHasFixedSize(true);

        // podemos pasarle como parametro this o getContext()
        recycler.setLayoutManager(new LinearLayoutManager(this));

        adapter = new CustomAdapter(names);
        recycler.setAdapter(adapter);

        txtbuscar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                // Despues que se escribe algo en el edittext se filtra con el metodo
                filter(s.toString());
            }
        });


    }

    // Metodo para filtar el contenido del dataset: names
    private void filter (String escrito) {
        // Creamos una lista auxiliar que se llenara con todos los elementos filtrados
        ArrayList<String> filternames = new ArrayList<>();

        for (String s :
                names) {
            // si existe el elemento en el dataset, lo guardara en la lista auxiliar
            if (s.toLowerCase().contains(escrito.toLowerCase())){
                filternames.add(s);
            }
        }
        // Invoca al metodo de adapter que referencia la lista auxiliar como el dataset principal para poder mostrarlo al usuario
        adapter.filterList(filternames);
    }

}
