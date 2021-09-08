package com.example.calculador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class ColoresFondo extends AppCompatActivity {


    private String blue;
    private String blanco;
    private String negro;
    private ConstraintLayout layout;
    private Button botonAzul;
    private Button botonBlanco;
    private Button botonNegro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores_fondo);

        botonAzul = findViewById(R.id.botonAzul);
        botonBlanco = findViewById(R.id.botonBlanco);
        botonNegro = findViewById(R.id.botonNegro);

        blue = "#A9EFF3";
        blanco = "#FFFFFF";
        negro = "#000000";

        layout = findViewById(R.id.fondoApp);

        SharedPreferences preferencias = getSharedPreferences("fondo",MODE_PRIVATE);

        botonAzul.setOnClickListener((v)->{

            preferencias.edit().putString("color", blue).apply();

            finish();


        });

        botonBlanco.setOnClickListener((v)->{

            preferencias.edit().putString("color", blanco).apply();

            finish();


        });

        botonNegro.setOnClickListener((v)->{

            preferencias.edit().putString("color", negro).apply();

            finish();


        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences preferencias =getSharedPreferences ("fondo",MODE_PRIVATE);
        String background = preferencias.getString("color", "#FFFFFF");
        layout.setBackgroundColor(Color.parseColor(background));


    }


}