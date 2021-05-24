package com.example.lappli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt_linearLayout;

    // TEST GIT

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_linearLayout = findViewById(R.id.bt_linearLayout);
        // Récupération du contenu du texte pour le fournir à putExtra
        String titre_linearLayout = bt_linearLayout.getText().toString();



        bt_linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Création d'un intent
                Intent intent_linearlayout = new Intent(MainActivity.this, LinearLayout.class);
                // préparation del'envoi des données vers la deuxième activité
                intent_linearlayout.putExtra("titre_LinearLayout", titre_linearLayout);
                // lancement de la deuxième activité
                startActivity(intent_linearlayout);
            }
        });

        
    }

}