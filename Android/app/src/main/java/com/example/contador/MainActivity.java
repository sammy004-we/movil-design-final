package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button01, button02, button03;
    TextView contar;

    int contador = 0;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button01 = findViewById(R.id.button01);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 contador ++;
                contar.setText("Estoy Contando:" + contador);
            }
        });
        button02 = findViewById(R.id.button02);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador --;
                contar.setText("Estoy Descontando:" + contador);
            }
        });
        button03 = findViewById(R.id.button03);
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador = 0;
                contar.setText("Comienza a Contar:" + contador);

            }
        });
        contar = findViewById(R.id.contar);
        contar.setText(Integer.toString(contador));

    }
}