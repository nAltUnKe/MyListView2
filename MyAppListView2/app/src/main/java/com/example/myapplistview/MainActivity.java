package com.example.myapplistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvItems;
    private Adaptador adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = findViewById(R.id.lvItems);
        // CREAR UN OBJETO ADAPTADOR
        adaptador = new Adaptador(this, GetArrayItems());
        lvItems.setAdapter(adaptador);

    }

    private ArrayList<Entidad> GetArrayItems(){
        ArrayList<Entidad> listItems = new ArrayList<>();
        listItems.add(new Entidad(R.drawable.ceviche, "Plato típico 1", "ceviche"));
        listItems.add(new Entidad(R.drawable.caldodebola, "Plato típico 2", "caldo de bola"));
        listItems.add(new Entidad(R.drawable.chaulafan, "Plato típico 3", "chaulafan"));
        listItems.add(new Entidad(R.drawable.guatita, "Plato típico 4", "guatita"));

        // RETURN

        return listItems;


    }
}