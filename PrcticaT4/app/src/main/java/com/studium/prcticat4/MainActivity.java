package com.studium.prcticat4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
        {

    Button btnDesplazar, btnPrimos, btnSeleccionar, btnAciertos;
    ImageView imgAndroid;
    AppCompatActivity Principal;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Principal = this;

        btnDesplazar = findViewById(R.id.btnDesplazar);
        btnPrimos = findViewById(R.id.btnPrimos);
        btnSeleccionar = findViewById(R.id.btnSeleccionar);
        btnAciertos = findViewById(R.id.btnAciertos);
        imgAndroid = findViewById(R.id.imgAndroid);

        btnPrimos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Principal, NumerosPrimos.class);
                startActivity(intent);
            }
        });
        btnAciertos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Principal, JuegoDeAciertos.class);
                startActivity(intent);
            }
        });
        btnDesplazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Principal, DesplazandoImagenes.class);
                startActivity(intent);

            }
        });
        btnSeleccionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Principal, SeleccionandoImagenes.class);
                startActivity(intent);
            }
        });
    }
}
