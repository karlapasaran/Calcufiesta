package com.example.calcufiesta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Preguntas extends AppCompatActivity {

    private EditText editTextEmpresa;
    private EditText editTextTelefonos;
    private EditText editTextCorreo;
    private EditText editTextFecha;
    private EditText editTextHora;
    private EditText editTextLugar;
    private EditText editTextCiudad;
    private EditText editTextTipoFiesta;
    private EditText editTextTematica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);

        editTextEmpresa = findViewById(R.id.editTextEmpresa);
        editTextTelefonos = findViewById(R.id.editTextTelefonos);
        editTextCorreo = findViewById(R.id.editTextCorreo);
        editTextFecha = findViewById(R.id.editTextFecha);
        editTextHora = findViewById(R.id.editTextHora);
        editTextLugar = findViewById(R.id.editTextLugar);
        editTextCiudad = findViewById(R.id.editTextCiudad);
        editTextTipoFiesta = findViewById(R.id.editTextTipoFiesta);
        editTextTematica = findViewById(R.id.editTextTematica);
    }
    public void oCSe (View view){
        Intent b=new Intent(this,Servicios.class);
        startActivity(b);
    }
}
