package com.example.ana.p02_fotos;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragFotoGran extends Fragment {

    View parentView;

    public FragFotoGran() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        parentView = inflater.inflate(R.layout.fragment_frag_foto_gran, container, false);
        return parentView;
    }

    public void recibirBoton(String msg) {

        switch (msg){
            case "1":
                parentView.setBackgroundResource(R.drawable.rafiki);
                break;
            case "2":
                parentView.setBackgroundResource(R.drawable.zazu);
                break;
            case "3":
                parentView.setBackgroundResource(R.drawable.scar);
                break;
        }
    }
}
