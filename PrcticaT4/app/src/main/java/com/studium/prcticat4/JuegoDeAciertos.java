package com.studium.prcticat4;

import android.graphics.Color;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class JuegoDeAciertos extends AppCompatActivity implements FragmentCapitales.OnFragmentInteractionListener,FragmentPaises.OnFragmentInteractionListener
{
    Fragment fragment1, fragment2;
    public static TextView txtResultadoPaises, txtResultadoCapitales;
    ImageView imageError,imageCorrecto;
    Button btnVerificar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_de_aciertos);
        this.setTitle(R.string.titleJuego);

        btnVerificar = findViewById(R.id.btnVerificar);
        txtResultadoPaises = findViewById(R.id.txtResultadoPaises);
        imageCorrecto = findViewById(R.id.imageCorrecto);
        imageError = findViewById(R.id.imageError);
        btnVerificar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (FragmentPaises.radbtnEspaña.isChecked() && FragmentCapitales.radbtnMadrid.isChecked())
                {
                    imageCorrecto.setVisibility(View.VISIBLE);
                    imageError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else if (FragmentPaises.radbtnFrancia.isChecked() && FragmentCapitales.radbtnParis.isChecked())
                {
                    imageCorrecto.setVisibility(View.VISIBLE);
                    imageError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else if (FragmentPaises.radbtnItalia.isChecked() && FragmentCapitales.radbtnRoma.isChecked())
                {
                    imageCorrecto.setVisibility(View.VISIBLE);
                    imageError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else if (FragmentPaises.radbtnVenezuela.isChecked() && FragmentCapitales.radbtnCaracas.isChecked())
                {
                    imageCorrecto.setVisibility(View.VISIBLE);
                    imageError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else if (FragmentPaises.radbtnChina.isChecked() && FragmentCapitales.radbtnPekin.isChecked())
                {
                    imageCorrecto.setVisibility(View.VISIBLE);
                    imageError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else if (FragmentPaises.radbtnJapon.isChecked() && FragmentCapitales.radbtnTokio.isChecked())
                {
                    imageCorrecto.setVisibility(View.VISIBLE);
                    imageError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else if (FragmentPaises.radbtnMexico.isChecked() && FragmentCapitales.radbtnCiudadMexico.isChecked())
                {
                    imageCorrecto.setVisibility(View.VISIBLE);
                    imageError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else if (FragmentPaises.radbtnBrasil.isChecked() && FragmentCapitales.radbtnBrasilia.isChecked())
                {
                    imageCorrecto.setVisibility(View.VISIBLE);
                    imageError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else if (FragmentPaises.radbtnArgentina.isChecked() && FragmentCapitales.radbtnBuenosAires.isChecked())
                {
                    imageCorrecto.setVisibility(View.VISIBLE);
                    imageError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else if (FragmentPaises.radbtnAlemania.isChecked() && FragmentCapitales.radbtnBerlin.isChecked())
                {
                    imageCorrecto.setVisibility(View.VISIBLE);
                    imageError.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.GREEN);
                }
                else
                {
                    imageError.setVisibility(View.VISIBLE);
                    imageCorrecto.setVisibility(View.INVISIBLE);
                    btnVerificar.setBackgroundColor(Color.RED);
                }
            }
        });
    }



@Override
public void onFragmentInteraction(Uri uri)
        {

        }
}
