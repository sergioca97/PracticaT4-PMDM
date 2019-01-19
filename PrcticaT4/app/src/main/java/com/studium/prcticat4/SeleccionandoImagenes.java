package com.studium.prcticat4;

import android.graphics.Color;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.studium.prcticat4.R.color.colorPrimaryDark;

public class SeleccionandoImagenes extends AppCompatActivity implements FragmentoRosa.OnFragmentInteractionListener,
        FragmentoClavel.OnFragmentInteractionListener,
        FragmentoJazmin.OnFragmentInteractionListener,
        FragmentoTulipan.OnFragmentInteractionListener{

    FragmentoRosa fragmentoRosa;
    FragmentoClavel fragmentoClavel;
    FragmentoJazmin fragmentoJazmin;
    FragmentoTulipan fragmentoTulipan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionando_imagenes);

        this.setTitle(R.string.titleSeleccionando);

        fragmentoRosa = new FragmentoRosa();
        fragmentoClavel = new FragmentoClavel();
        fragmentoJazmin = new FragmentoJazmin();
        fragmentoTulipan = new FragmentoTulipan();

        getSupportFragmentManager().beginTransaction().add(R.id.imagenes,fragmentoRosa).commit();

    }
    public void onClick(View v)
    {
        FragmentTransaction Transaction = getSupportFragmentManager().beginTransaction();

        switch (v.getId())
        {
            case R.id.btnRosa:
                Transaction.replace(R.id.imagenes,fragmentoRosa);
                break;
            case R.id.btnClavel:
                Transaction.replace(R.id.imagenes,fragmentoClavel);
                break;
            case R.id.btnJazmin:
                Transaction.replace(R.id.imagenes,fragmentoJazmin);
                break;
            case R.id.btnTulipan:
                Transaction.replace(R.id.imagenes,fragmentoTulipan);
                break;
        }
        Transaction.commit();
    }
    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
