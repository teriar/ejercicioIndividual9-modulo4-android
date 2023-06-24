package com.example.cl.ejercicio9_modulo4java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initListeners();
        Intent intentGet = getIntent();
         int idImage = intentGet.getIntExtra("Clave",0);
        Log.d("secondActivity",String.valueOf(idImage));

        ImageView imageButton = findViewById(R.id.imageView);
        imageButton.setImageResource(idImage);
    }

    private void initListeners() {
        Button buttonBack = findViewById(R.id.buttonBack);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}