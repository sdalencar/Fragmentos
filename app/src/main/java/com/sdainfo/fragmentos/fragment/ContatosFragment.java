package com.sdainfo.fragmentos.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.sdainfo.fragmentos.R;




public class ContatosFragment extends Fragment {

    private TextView tvContato;
    private Button btContato;

    public ContatosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contatos, container, false);

        tvContato = view.findViewById(R.id.textViewContato);
        tvContato.setText("snack bar");

        btContato = view.findViewById(R.id.buttonContato);
        btContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "snack bar precionado", Snackbar.LENGTH_INDEFINITE  )
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