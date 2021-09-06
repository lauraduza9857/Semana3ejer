package com.example.calculador;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculoNotaActivity extends AppCompatActivity  {

    private Button botonCalcular;
    private TextView textNota;
    private EditText pparcialUno;
    private EditText pparcialDos;
    private EditText quicesTodo;
    private EditText parcialUno;
    private EditText parcialDos;








    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_nota);


        botonCalcular = findViewById(R.id.botonCalcular);
        pparcialUno = findViewById(R.id.pparcialUno);
        pparcialDos = findViewById(R.id.pparcialDos);
        quicesTodo = findViewById(R.id.quicesTodo);
        parcialUno = findViewById(R.id.parcialUno);
        parcialDos = findViewById(R.id.parcialDos);

        botonCalcular.setOnClickListener((v)->{String notaproyectouno = pparcialUno.getText().toString();
            String notaproyectdos = pparcialUno.getText().toString();
            String quices = quicesTodo.getText().toString();
            String parcialnotauno = parcialUno.getText().toString();
            String parcialnotados = parcialUno.getText().toString();


            Intent i = new Intent(CalculoNotaActivity.this, ResultadoFinal.class);
            startActivity(i);});





    }

}