package com.example.cl.ejercicio9_modulo4java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    int imagen1 = R.drawable.ic_launcher_foreground;
    int imagen2 = R.drawable.baseline_local_florist_24;
    int imagen3 = R.drawable.baseline_dangerous_24;
    int imagen4 = R.drawable.baseline_currency_exchange_24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();
    }

    private void initListeners() {

        ImageButton boton1 = findViewById(R.id.Button1);
        ImageButton boton2 = findViewById(R.id.Button2);
        ImageButton boton3 = findViewById(R.id.Button3);
        ImageButton boton4 = findViewById(R.id.Button4);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity();
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity();
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity();
            }
        });

        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity();
            }
        });


    }

    public void moveToSecondActivity(){
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }
}