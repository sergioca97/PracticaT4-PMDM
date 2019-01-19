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

import java.util.Collections;


public class FragmentPaises extends Fragment
{
    View v;
    public static RadioGroup grpPaises;
    public static RadioButton radbtnEspaña,radbtnFrancia,radbtnItalia,radbtnVenezuela,radbtnChina,radbtnJapon,radbtnMexico,radbtnBrasil, radbtnArgentina, radbtnAlemania;

    private OnFragmentInteractionListener mListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_fragment_paises, container, false);
        grpPaises = v.findViewById(R.id.grpPaises);
        radbtnEspaña = v.findViewById(R.id.radbtnEspaña);
        radbtnFrancia = v.findViewById(R.id.radbtnFrancia);
        radbtnItalia = v.findViewById(R.id.radbtnItalia);
        radbtnVenezuela = v.findViewById(R.id.radbtnVenezuela);
        radbtnChina = v.findViewById(R.id.radbtnChina);
        radbtnJapon = v.findViewById(R.id.radbtnJapon);
        radbtnMexico = v.findViewById(R.id.radbtnMexico);
        radbtnBrasil = v.findViewById(R.id.radbtnBrasil);
        radbtnArgentina = v.findViewById(R.id.radbtnArgentina);
        radbtnAlemania = v.findViewById(R.id.radbtnAlemania);

        grpPaises.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String paises = ((RadioButton)v.findViewById(grpPaises.getCheckedRadioButtonId())).getText().toString();
                TextView r = getActivity().findViewById(R.id.txtResultadoPaises);
                r.setText(paises);
            }
        });

        return v;
    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
