package com.sdainfo.fragmentos.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.sdainfo.fragmentos.R;


public class ConversasFragment extends Fragment {

     private TextView tvConversa;


    public ConversasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_conversas, container, false);

        tvConversa = view.findViewById(R.id.textViewConversa);
        tvConversa.setText("conversa carregada");

        FloatingActionButton btConversa = view.findViewById(R.id.floatingActionButton);
        btConversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "snack bar precionado", Snackbar.LENGTH_LONG  )
                        .setAction("Confirmar", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(getContext(), "toast....", Toast.LENGTH_LONG).show();;
                            }
                        })
                        .setActionTextColor(getResources().getColor(R.color.design_default_color_primary ))
                        .show();
            }
        });





        return view;
    }
}