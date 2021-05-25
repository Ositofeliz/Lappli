package com.example.lappli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Layout.LinearLayout;
import Layout.LinearVerticalActivity;

public class MainActivity extends AppCompatActivity {

    Button bt_linearLayout;
    Button bt_VerticalLinearLayout;

    // TEST GIT

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_linearLayout = findViewById(R.id.bt_linearLayout);
        // Récupération du contenu du texte pour le fournir à putExtra
        String titre_linearLayout = bt_linearLayout.getText().toString();

        bt_VerticalLinearLayout = findViewById(R.id.bt_VerticalLinearLayout);
        String titre_VerticalLinearLayout = bt_VerticalLinearLayout.getText().toString();



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

        bt_VerticalLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_VerticalLinearLayout = new Intent(MainActivity.this, LinearVerticalActivity.class);
                intent_VerticalLinearLayout.putExtra("titre_VerticalLinearLayout",titre_VerticalLinearLayout);
                startActivity(intent_VerticalLinearLayout);
            }
        });



        
    }

}