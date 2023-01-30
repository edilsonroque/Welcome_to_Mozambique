package com.example.welcometomozambique;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class explorarFragment extends Fragment {

    Button btnPraia, btnMuseu;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_explorer, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnPraia = view.findViewById(R.id.btn_prais);
        btnMuseu = view.findViewById(R.id.btn_museus);

        btnPraia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(getActivity(), praia_activity.class);
                startActivity(i1);
                //((praia_activity) getActivity()).overridePendingTransition(0, 0);
            }
        });

        btnMuseu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getActivity(), museu_activity.class);
                startActivity(i2);
            }
        });

    }
}
