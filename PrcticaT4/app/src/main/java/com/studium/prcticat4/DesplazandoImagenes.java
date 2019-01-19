package com.studium.prcticat4;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DesplazandoImagenes extends AppCompatActivity implements FragmentoPerro.OnFragmentInteractionListener,FragmentoGato.OnFragmentInteractionListener{

    Fragment fragment3, fragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desplazando_imagenes);

        this.setTitle(R.string.titleDesplazando);
    }
    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
