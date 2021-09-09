package com.example.calculador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ResultadoFinal extends AppCompatActivity {


    private Button buttonnAgain;
    private TextView resultadoTotal;
    private TextView editNota;
    private ConstraintLayout layout;
    private String notamateria;
    private String name;

    //TENGO MIEDOOOO

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_final);

        buttonnAgain = findViewById(R.id.buttonAgain);
        resultadoTotal = findViewById(R.id.resultadoTotal);
        editNota = findViewById(R.id.editNota);
        resultadoTotal = findViewById(R.id.resultadoTotal);
       name = getSharedPreferences("fondo",MODE_PRIVATE).getString("nombre","NO_USER");

        layout = findViewById(R.id.layout);

        String notafinal = editNota.getText().toString();

        resultadoTotal.setText("¨Hola,"+ name +"¨su nota es:");

        notamateria = "" + getIntent().getExtras().getDouble("f");
        editNota.setText(notamateria);

        buttonnAgain.setOnClickListener((v)->{

            Intent ii = new Intent(ResultadoFinal.this, MainActivity.class);
            startActivity(ii);});


    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences preferencias =getSharedPreferences ("fondo",MODE_PRIVATE);
        String background = preferencias.getString("color", "#FFFFFF");
        layout.setBackgroundColor(Color.parseColor(background));


    }
}