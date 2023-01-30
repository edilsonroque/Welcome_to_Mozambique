package com.example.welcometomozambique;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class praia_activity extends AppCompatActivity {

    String nomePraia [] = {"Costa do Sol", "Macaneta", "Chidenguele", "Ponta de Ouro", "Praia do Tofo", "Wimbi Beach", "Ponta mamole"};
    int imagePraia [] = {R.drawable.costadosol, R.drawable.macaneta, R.drawable.chidenguele, R.drawable.ponta, R.drawable.tofo, R.drawable.wimbe, R.drawable.pontamamole};
    String localizacao [] = {"Maputo", "Maputo", "Xai-Xai", "Maputo", "Inhambane", "Wimbi Beach", "Maputo"};

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praia);
        getSupportActionBar().hide();
        listView = (ListView) findViewById(R.id.customListView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplication(), nomePraia, imagePraia, localizacao);
        listView.setAdapter(customBaseAdapter);
    }
}