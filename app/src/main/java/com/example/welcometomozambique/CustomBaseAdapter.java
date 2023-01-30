package com.example.welcometomozambique;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    String listaPraia[];
    int listaImages[];
    String locationPraia[];
    LayoutInflater inflater;

    public  CustomBaseAdapter(Context ctx, String[] listaPraia, int [] images, String locationPraia[]){
        this.context = ctx;
        this.listaPraia = listaPraia;
        this.listaImages = images;
        this.locationPraia = locationPraia;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return listaPraia.length;

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
        TextView textView = (TextView) convertView.findViewById(R.id.nomeCategoriaa);
        ImageView praiaImage = (ImageView) convertView.findViewById(R.id.imageIconee);
        TextView textLocation = (TextView) convertView.findViewById(R.id.localizacaoCategoriaa);
        textView.setText(listaPraia[position]);
        praiaImage.setImageResource(listaImages[position]);
        textLocation.setText(locationPraia[position]);
        return convertView;
    }
}
