package com.example.welcometomozambique;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapterMuseu extends BaseAdapter {

    Context context;
    String listaMuseu[];
    int listaImagesMuseu[];
    String locationMuseu[];
    LayoutInflater inflater;

    public CustomBaseAdapterMuseu(Context ctx, String[] listaMuseu, int [] images, String locationMuseu[]){
        this.context = ctx;
        this.listaMuseu = listaMuseu;
        this.listaImagesMuseu = images;
        this.locationMuseu = locationMuseu;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return listaMuseu.length;

    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView nomeMuseu = (TextView) convertView.findViewById(R.id.nomeCategoriaa);
        ImageView imageMuseu = (ImageView) convertView.findViewById(R.id.imageIconee);
        TextView textLocation = (TextView) convertView.findViewById(R.id.localizacaoCategoriaa);
        nomeMuseu.setText(listaMuseu[position]);
        imageMuseu.setImageResource(listaImagesMuseu[position]);
        textLocation.setText(locationMuseu[position]);
        return convertView;
    }
}
