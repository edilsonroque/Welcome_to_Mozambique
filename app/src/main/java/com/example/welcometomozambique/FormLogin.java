package com.example.welcometomozambique;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {

    private TextView text_tela_login;
    private Button btEntrar;
    EditText nomeUsuario;
    TextView nomePerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
        iniciarComponentes();

        text_tela_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormLogin.this, FormCadastro.class);
                startActivity(i);
            }
        });

        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaMain = new Intent(FormLogin.this, MainActivity.class);
                startActivity(telaMain);
            }
        });

    }

    private void iniciarComponentes(){
        text_tela_login = findViewById(R.id.text_tela_login);
        btEntrar = findViewById(R.id.btLogin);

    }
}