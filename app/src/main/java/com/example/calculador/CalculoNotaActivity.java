package com.example.calculador;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class CalculoNotaActivity extends AppCompatActivity  {

    private Button botonCalcular;
    private TextView textNota;
    private EditText pparcialUno;
    private EditText pparcialDos;
    private EditText quicesTodo;
    private EditText parcialUno;
    private EditText parcialDos;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double nota5;
    private double notafinal;
    private ConstraintLayout layout;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_nota);


        botonCalcular = findViewById(R.id.botonCalcular);
        pparcialUno = findViewById(R.id.pparcialUno);
        pparcialDos = findViewById(R.id.pparcialDos);
        quicesTodo = findViewById(R.id.quicesTodo);
        parcialUno = findViewById(R.id.parcialUno);
        parcialDos = findViewById(R.id.parcialDos);

        layout = findViewById(R.id.layout);



        botonCalcular.setOnClickListener((v)->{

            String notaproyectouno = pparcialUno.getText().toString();
            String notaproyectdos = pparcialDos.getText().toString();
            String quices = quicesTodo.getText().toString();
            String parcialnotauno = parcialUno.getText().toString();
            String parcialnotados = parcialUno.getText().toString();

            nota1 = Double.parseDouble(notaproyectouno);
            nota2 = Double.parseDouble(notaproyectdos);
            nota3 = Double.parseDouble(quices);
            nota4 = Double.parseDouble(parcialnotauno);
            nota5 = Double.parseDouble(parcialnotados);
            notafinal = ((nota1*15)/100) + ((nota2*15)/100) + ((nota3*15)/100) + ((nota4*15)/100) + ((nota5*15)/100);

            Log.e("calculo", String.valueOf(notafinal));



            Intent i = new Intent(CalculoNotaActivity.this, ResultadoFinal.class);

            Intent icalculo = new Intent(this,ResultadoFinal.class);
            icalculo.putExtra("f", notafinal);





            startActivity(i);});









    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences preferencias =getSharedPreferences ("fondo",MODE_PRIVATE);
        String background = preferencias.getString("color", "#FFFFFF");
        layout.setBackgroundColor(Color.parseColor(background));


    }

}