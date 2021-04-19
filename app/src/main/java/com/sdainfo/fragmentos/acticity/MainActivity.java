package com.sdainfo.fragmentos.acticity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.sdainfo.fragmentos.R;
import com.sdainfo.fragmentos.fragment.ContatosFragment;
import com.sdainfo.fragmentos.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button btConversa, btContato;
    private ConversasFragment  conversasFragment;
    private ContatosFragment contatosFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setElevation(0);

        btContato = findViewById(R.id.buttonContato);
        btConversa = findViewById(R.id.buttonConversa);

        conversasFragment = new ConversasFragment();
        FragmentTransaction fragmentTransition = getSupportFragmentManager().beginTransaction();
        fragmentTransition.replace(R.id.frameConteudo, conversasFragment);
        fragmentTransition.commit();


        btConversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conversasFragment = new ConversasFragment();
                FragmentTransaction fragmentTransition = getSupportFragmentManager().beginTransaction();
                fragmentTransition.replace(R.id.frameConteudo, conversasFragment);
                fragmentTransition.commit();
            }
        });


        // comecar video 11


        btContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contatosFragment = new ContatosFragment();
                FragmentTransaction fragmentTransition = getSupportFragmentManager().beginTransaction();
                fragmentTransition.replace(R.id.frameConteudo, contatosFragment);
                fragmentTransition.commit();

            }
        });





    }
}