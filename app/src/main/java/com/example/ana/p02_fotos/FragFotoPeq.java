package com.example.ana.p02_fotos;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragFotoPeq extends Fragment implements View.OnClickListener {

    View parentView;
    detectaImg MiCallBack;


    public FragFotoPeq() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        parentView = inflater.inflate(R.layout.fragment_frag_foto_peq, container, false);
        parentView.findViewById(R.id.Raf).setOnClickListener(this);
        parentView.findViewById(R.id.Zaz).setOnClickListener(this);
        parentView.findViewById(R.id.Sca).setOnClickListener(this);

        return parentView;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        MiCallBack = (detectaImg) activity;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch(id) {
            case R.id.Raf:
                MiCallBack.detectarBoton("1");
                break;
            case R.id.Zaz:
                MiCallBack.detectarBoton("2");
                break;
            case R.id.Sca:
                MiCallBack.detectarBoton("3");
                break;
        }
    }
}
