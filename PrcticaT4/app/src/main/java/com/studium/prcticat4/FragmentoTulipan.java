package com.studium.prcticat4;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.studium.prcticat4.R;

public class FragmentoTulipan extends Fragment {

    View v;
    ImageView imagenTulipan;
    private com.studium.prcticat4.FragmentoClavel.OnFragmentInteractionListener mListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_fragmento_tulipan, container, false);

        imagenTulipan = v.findViewById(R.id.imagenTulipan);
        return v;
    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}