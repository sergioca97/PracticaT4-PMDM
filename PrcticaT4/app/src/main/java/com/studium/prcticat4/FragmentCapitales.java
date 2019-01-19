package com.studium.prcticat4;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;


public class FragmentCapitales extends Fragment
{
    View v;
    public static RadioGroup grpCapitales;
    public static RadioButton radbtnMadrid,radbtnParis,radbtnRoma,radbtnCaracas,radbtnPekin,radbtnTokio,radbtnCiudadMexico,radbtnBrasilia, radbtnBuenosAires, radbtnBerlin;

    private OnFragmentInteractionListener mListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_fragment_capitales, container, false);
        grpCapitales = v.findViewById(R.id.grpCapitales);
        radbtnMadrid = v.findViewById(R.id.radbtnMadrid);
        radbtnParis = v.findViewById(R.id.radbtnParis);
        radbtnRoma = v.findViewById(R.id.radbtnRoma);
        radbtnCaracas = v.findViewById(R.id.radbtnCaracas);
        radbtnPekin = v.findViewById(R.id.radbtnPekin);
        radbtnTokio = v.findViewById(R.id.radbtnTokio);
        radbtnCiudadMexico = v.findViewById(R.id.radbtnCiudadMexico);
        radbtnBrasilia = v.findViewById(R.id.radbtnBrasilia);
        radbtnBuenosAires = v.findViewById(R.id.radbtnBuenosAires);
        radbtnBerlin = v.findViewById(R.id.radbtnBerlin);

        grpCapitales.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                String capital = ((RadioButton)v.findViewById(grpCapitales.getCheckedRadioButtonId())).getText().toString();
                TextView r = getActivity().findViewById(R.id.txtResultadoCapitales);
                r.setText(capital);
            }
        });

        return v;
    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
