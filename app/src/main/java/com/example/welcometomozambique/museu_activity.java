package com.example.welcometomozambique;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class museu_activity extends AppCompatActivity {

    String nomeMuseu [] = {"Museu da Historia Natural", "Fortaleza"};
    int imageMuseu [] = {R.drawable.museu1, R.drawable.museu2};
    String localizacao [] = {"Maputo", "Maputo"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museu);
        getSupportActionBar().hide();
        listView = (ListView) findViewById(R.id.listaMuseu);
        CustomBaseAdapter customBaseAdapterMuseu = new CustomBaseAdapter(getApplication(), nomeMuseu, imageMuseu, localizacao);
        listView.setAdapter(customBaseAdapterMuseu);
    }
}