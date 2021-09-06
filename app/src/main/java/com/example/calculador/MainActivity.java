package com.example.calculador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView textAnuncio;
    private EditText nombreText;
    private Button botonColores;
    private Button botonContinuar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencia

        textAnuncio = findViewById(R.id.text);
        nombreText = findViewById(R.id.nombreText);
        botonColores = findViewById(R.id.botonColores);
        botonContinuar = findViewById(R.id.botonContinuar);

        botonContinuar.setOnClickListener(this);

        }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.botonContinuar:
                String nombre = nombreText.getText().toString();

                Intent i = new Intent(this, CalculoNotaActivity.class);
                startActivity(i);




    }
}


}